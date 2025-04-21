package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_009Page {
    private WebDriver driver;
    private WebDriverWait wait;

    private By uploadInput = By.id("file-upload");
    private By warningMessage = By.id("warning-message");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void seleccionarArchivoConCaracteresEspeciales() {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys("C:\\path\\to\\@file!.txt");
    }

    public void validarNombreArchivo() {
        // Implementación hipotética de validación
    }

    public boolean mensajeAdvertenciaMostrado() {
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(warningMessage));
        return messageElement.getText().equals("Nombre de archivo no permitido");
    }
}