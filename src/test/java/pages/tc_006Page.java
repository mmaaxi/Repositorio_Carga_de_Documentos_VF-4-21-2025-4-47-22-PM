package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {
    WebDriver driver;

    private By uploadButton = By.id("upload-button");
    private By warningMessage = By.id("warning-message");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadExistingDocument() {
        driver.findElement(uploadButton).sendKeys("/path/to/existing/document.pdf");
    }

    public boolean isDuplicateIdentified() {
        // Logic to check if duplicate is identified
        return driver.findElements(warningMessage).size() > 0;
    }

    public String getWarningMessage() {
        return driver.findElement(warningMessage).getText();
    }
}