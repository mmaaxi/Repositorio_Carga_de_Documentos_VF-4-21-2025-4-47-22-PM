package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_002Page {

    private WebDriver driver;
    private WebDriverWait wait;

    private By uploadButtonLocator = By.id("uploadButton");
    private By fileInputLocator = By.id("fileInput");
    private By errorMessageLocator = By.id("errorMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void selectInvalidFileFormat() {
        WebElement fileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(fileInputLocator));
        fileInput.sendKeys("/path/to/invalid/file.exe");
    }

    public void verifyErrorMessageDisplayed() {
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageLocator));
        assert errorMessage.isDisplayed();
    }

    public void verifyUploadProcessNotStarted() {
        WebElement uploadButton = wait.until(ExpectedConditions.elementToBeClickable(uploadButtonLocator));
        assert uploadButton.isEnabled();
    }
}