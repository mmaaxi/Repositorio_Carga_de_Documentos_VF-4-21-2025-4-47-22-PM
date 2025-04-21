package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import utils.DriverSetup;

public class tc_005Page {

    WebDriver driver = DriverSetup.getDriver();
    
    private By uploadButton = By.id("uploadButton");
    private By retryMessage = By.id("retryMessage");
    private By errorMessage = By.id("errorMessage");

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void simulateUnstableNetwork() {
        // Simulating unstable network conditions
        // This could involve setting network conditions in a local dev setup or using a tool
    }

    public void uploadDocument() {
        driver.findElement(uploadButton).click();
        // logic to upload a document
    }

    public boolean isRetryMechanismTriggered() {
        // Check if retry mechanism is triggered
        return driver.findElements(retryMessage).size() > 0;
    }

    public boolean isRetryMessageDisplayed() {
        // Check if the retry message is displayed
        return driver.findElement(retryMessage).isDisplayed();
    }

    public boolean isErrorMessageDisplayed() {
        // Check if the error message is displayed
        return driver.findElement(errorMessage).isDisplayed();
    }
}