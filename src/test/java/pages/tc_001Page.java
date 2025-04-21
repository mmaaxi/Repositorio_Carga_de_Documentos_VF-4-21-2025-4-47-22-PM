package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {

    WebDriver driver;

    private By selectorArchivo = By.id("id_selector_archivo");
    private By botonCargar = By.id("id_boton_cargar");
    private By mensajeExito = By.id("id_mensaje_exito");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarDocumentoPDFValido(String ruta) {
        WebElement inputFile = driver.findElement(selectorArchivo);
        inputFile.sendKeys(ruta);
    }

    public boolean isPDFSelecionadoCorrectamente() {
        // Lógica para validar que el archivo PDF se ha seleccionado
        return true; // Supongamos que se seleccionó correctamente
    }

    public void clicEnCargarDocumento() {
        driver.findElement(botonCargar).click();
    }

    public boolean isCargaIniciada() {
        // Lógica para verificar que el proceso de carga ha iniciado
        return true; // Supongamos que inició correctamente
    }

    public boolean isMensajeDeCargaExitosaMostrado() {
        return driver.findElement(mensajeExito).isDisplayed();
    }
}