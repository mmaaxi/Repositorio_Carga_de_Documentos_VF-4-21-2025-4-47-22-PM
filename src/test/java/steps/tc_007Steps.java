package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("El usuario intenta cargar un documento desde un origen no autorizado")
    public void elUsuarioIntentaCargarDocumentoNoAutorizado() {
        page.intentarCargarDocumentoNoAutorizado();
    }

    @When("El sistema revisa el origen del documento")
    public void elSistemaRevisaOrigenDocumento() {
        Assert.assertTrue(page.revisarOrigenDocumento());
    }

    @Then("El sistema bloquea la acción")
    public void elSistemaBloqueaAccion() {
        Assert.assertTrue(page.esAccionBloqueada());
    }

    @Then("Muestra un mensaje de error de seguridad")
    public void muestraMensajeErrorSeguridad() {
        Assert.assertTrue(page.mostrarMensajeErrorSeguridad());
    }

    @Given("Se ha intentado cargar un documento desde un origen no autorizado")
    public void seHaIntandoCargarDocumento() {
        page.intentarCargarDocumentoNoAutorizado();
    }

    @When("Se verifica el log de seguridad del sistema")
    public void seVerificaLogSeguridad() {
        Assert.assertTrue(page.verificarLogSeguridad());
    }

    @Then("Se genera un registro en el log de seguridad del sistema")
    public void seGeneraRegistroLogSeguridad() {
        Assert.assertTrue(page.esRegistroGenerado());
    }
}