package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;
import static org.junit.Assert.assertTrue;

public class tc_003Steps {
    WebDriver driver;
    tc_003Page uploadPage;

    @Given("que el usuario está en la página de carga de documentos")
    public void que_el_usuario_está_en_la_página_de_carga_de_documentos() {
        uploadPage = new tc_003Page(driver);
        uploadPage.navigateToUploadPage();
    }

    @When("el usuario selecciona un documento que supera el límite de tamaño permitido")
    public void el_usuario_selecciona_un_documento_que_supera_el_límite_de_tamaño_permitido() {
        uploadPage.uploadFileExceedsSizeLimit();
    }

    @Then("el sistema identifica que el archivo es demasiado pesado")
    public void el_sistema_identifica_que_el_archivo_es_demasiado_pesado() {
        assertTrue(uploadPage.isFileTooLargeErrorDisplayed());
    }

    @Then("muestra el mensaje de error 'Archivo excede el tamaño permitido'")
    public void muestra_el_mensaje_de_error_archivo_excede_el_tamaño_permitido() {
        assertTrue(uploadPage.isFileSizeErrorMessageDisplayed("Archivo excede el tamaño permitido"));
    }
}