package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_008Page;
import org.junit.Assert;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("que el usuario está en la página de carga de documentos")
    public void usuarioEnPaginaCarga() {
        page.navigateToUploadPage();
    }

    @When("el usuario selecciona un documento en formato DOCX")
    public void seleccionaDocumentoDOCX() {
        page.uploadDocument("documento.docx");
    }

    @Then("el sistema acepta y procesa el formato DOCX")
    public void sistemaAceptaDOCX() {
        Assert.assertTrue(page.isDocxProcesadoCorrectamente());
    }

    @When("el usuario selecciona un documento en formato XLSX")
    public void seleccionaDocumentoXLSX() {
        page.uploadDocument("documento.xlsx");
    }

    @Then("el sistema acepta y procesa el formato XLSX")
    public void sistemaAceptaXLSX() {
        Assert.assertTrue(page.isXlsxProcesadoCorrectamente());
    }

    @Then("cada documento se muestra conforme a su formato")
    public void verificaDocumentoDisplays() {
        Assert.assertTrue(page.isDocumentDisplayedCorrectly());
    }
}