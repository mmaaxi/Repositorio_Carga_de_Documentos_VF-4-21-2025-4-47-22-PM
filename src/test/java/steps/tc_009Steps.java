package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {
    tc_009Page page = new tc_009Page();

    @Given("el usuario selecciona un archivo con caracteres especiales en el nombre")
    public void el_usuario_selecciona_un_archivo_con_caracteres_especiales_en_el_nombre() {
        page.seleccionarArchivoConCaracteresEspeciales();
    }

    @When("el sistema valida el nombre del archivo")
    public void el_sistema_valida_el_nombre_del_archivo() {
        page.validarNombreArchivo();
    }

    @Then("se muestra un mensaje indicando 'Nombre de archivo no permitido'")
    public void se_muestra_un_mensaje_indicando_nombre_de_archivo_no_permitido() {
        Assert.assertTrue(page.mensajeAdvertenciaMostrado());
    }
}