package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By auditLogLink = By.id("auditLogLink");
    By logEntry = By.xpath("//table[@id='auditLogTable']//tr[1]");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadDocument() {
        driver.findElement(uploadButton).click();
        // Assume file input handling
    }

    public void verifyLogRecorded() {
        // Implement verification logic here
    }

    public void openAuditLogPage() {
        driver.findElement(auditLogLink).click();
    }

    public void checkAuditLogDetails() {
        // Verify log details: date, user, operation status
        String logDetails = driver.findElement(logEntry).getText();
        // Validation logic here
    }
}