package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {
    WebDriver driver;

    private By uploadInput = By.id("uploadInput");
    private By fileSizeErrorMessage = By.id("fileSizeErrorMessage");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadFileExceedsSizeLimit() {
        driver.findElement(uploadInput).sendKeys("/path/to/large/file.ext");
    }

    public boolean isFileTooLargeErrorDisplayed() {
        return driver.findElement(fileSizeErrorMessage).isDisplayed();
    }

    public boolean isFileSizeErrorMessageDisplayed(String message) {
        return driver.findElement(fileSizeErrorMessage).getText().equals(message);
    }
}