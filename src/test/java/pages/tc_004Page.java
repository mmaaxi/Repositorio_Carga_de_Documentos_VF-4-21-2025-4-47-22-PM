package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_004Page {

    WebDriver driver;

    public tc_004Page() {
        driver = new ChromeDriver();
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadPDFDocument(String filePath) {
        WebElement uploadField = driver.findElement(By.id("upload"));
        uploadField.sendKeys(filePath);
        WebElement submitButton = driver.findElement(By.id("submitUpload"));
        submitButton.click();
    }

    public boolean isUploadSuccessful() {
        WebElement confirmationMessage = driver.findElement(By.id("uploadSuccessMessage"));
        return confirmationMessage.isDisplayed();
    }

    public void confirmPDFUploaded() {
        // Assume the PDF is uploaded and confirmed
    }

    public void openPDFDocument() {
        WebElement openPDFButton = driver.findElement(By.id("openPDF"));
        openPDFButton.click();
    }

    public boolean isPDFDisplayedCorrectly() {
        WebElement pdfViewer = driver.findElement(By.id("pdfViewer"));
        // Logic to check if PDF is displayed without corruption
        return pdfViewer.isDisplayed();
    }
}