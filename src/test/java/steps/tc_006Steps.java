package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_006Page;

public class tc_006Steps {
    WebDriver driver = new ChromeDriver();
    tc_006Page page = new tc_006Page(driver);

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_en_pagina_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("el usuario carga un documento ya existente")
    public void el_usuario_carga_un_documento_existente() {
        page.uploadExistingDocument();
    }

    @Then("el sistema identifica el duplicado")
    public void el_sistema_identifica_el_duplicado() {
        assertTrue(page.isDuplicateIdentified());
    }

    @Then("se muestra un mensaje de advertencia {string}")
    public void se_muestra_mensaje_de_advertencia(String mensajeEsperado) {
        assertEquals(mensajeEsperado, page.getWarningMessage());
    }
}