package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {

    private WebDriver driver;

    // Example locators; please change accordingly
    private By documentUploadButton = By.id("uploadButton");
    private By securityErrorMessage = By.id("securityErrorMessage");
    private By securityLog = By.id("securityLog");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void intentarCargarDocumentoNoAutorizado() {
        // Logic to attempt file upload from unauthorized source
        driver.findElement(documentUploadButton).click();
    }

    public boolean revisarOrigenDocumento() {
        // Logic to review document source (this needs further details)
        return true;
    }

    public boolean esAccionBloqueada() {
        // Check if the action is blocked and the correct message appears
        return driver.findElement(securityErrorMessage).isDisplayed();
    }

    public boolean mostrarMensajeErrorSeguridad() {
        // Check if security error message is displayed
        return driver.findElement(securityErrorMessage).isDisplayed();
    }

    public boolean verificarLogSeguridad() {
        // Logic to verify that security log is updated
        return driver.findElement(securityLog).isDisplayed();
    }

    public boolean esRegistroGenerado() {
        // Check if a new entry is added to the security log
        return driver.findElement(securityLog).getText().contains("Unauthorized document upload attempt");
    }
}