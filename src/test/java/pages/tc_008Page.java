package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.PageFactory;

public class tc_008Page {

    private WebDriver driver;
    private WebDriverWait wait;

    private By uploadButton = By.id("uploadButton");
    private By messageBox = By.id("messageBox");
    private By documentViewer = By.id("documentViewer");
    
    public tc_008Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadDocument(String fileName) {
        WebElement uploadElement = wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
        uploadElement.sendKeys(System.getProperty("user.dir") + "/resources/" + fileName);
    }

    public boolean isDocxProcesadoCorrectamente() {
        String message = wait.until(ExpectedConditions.visibilityOfElementLocated(messageBox)).getText();
        return message.contains("DOCX aceptado");
    }

    public boolean isXlsxProcesadoCorrectamente() {
        String message = wait.until(ExpectedConditions.visibilityOfElementLocated(messageBox)).getText();
        return message.contains("XLSX aceptado");
    }

    public boolean isDocumentDisplayedCorrectly() {
        WebElement viewer = wait.until(ExpectedConditions.visibilityOfElementLocated(documentViewer));
        // Additional checks can be implemented for specific document format checks
        return viewer.isDisplayed();
    }
}