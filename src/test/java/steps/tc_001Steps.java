package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page = new tc_001Page(driver);

    @Given("Estoy en la página de carga de documentos")
    public void estoyEnLaPaginaDeCargaDeDocumentos() {
        driver.get("URL_DE_LA_PAGINA_DE_CARGA");
    }

    @When("Selecciono un documento en formato PDF válido")
    public void seleccionoUnDocumentoEnFormatoPDFValido() {
        page.seleccionarDocumentoPDFValido("RUTA_DEL_PDF_VALIDO");
    }

    @Then("El sistema permite la selección de archivos PDF sin error")
    public void elSistemaPermiteLaSeleccionDeArchivosPDFSinError() {
        assertTrue(page.isPDFSelecionadoCorrectamente());
    }

    @When("Hago clic en el botón \"Cargar Documento\"")
    public void hagoClicEnElBotonCargarDocumento() {
        page.clicEnCargarDocumento();
    }

    @Then("El sistema inicia el proceso de carga")
    public void elSistemaIniciaElProcesoDeCarga() {
        assertTrue(page.isCargaIniciada());
    }

    @When("Verifico el mensaje de éxito al completar la carga")
    public void verificoElMensajeDeExitoAlCompletarLaCarga() {
        // Esperar o verificar condiciones aquí
    }

    @Then("Se muestra mensaje: \"Carga Exitosa\"")
    public void seMuestraMensajeCargaExitosa() {
        assertTrue(page.isMensajeDeCargaExitosaMostrado());
    }
}