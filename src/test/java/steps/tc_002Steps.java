package steps;

import io.cucumber.java.en.*;
import pages.tc_002Page;

public class tc_002Steps {

    private tc_002Page uploadPage = new tc_002Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        uploadPage.navigateToUploadPage();
    }

    @When("el usuario selecciona un documento en formato \".exe\" o \".bat\"")
    public void el_usuario_selecciona_un_documento_en_formato_exe_o_bat() {
        uploadPage.selectInvalidFileFormat();
    }

    @Then("el sistema rechaza el archivo y muestra un mensaje de error")
    public void el_sistema_rechaza_el_archivo_y_muestra_un_mensaje_de_error() {
        uploadPage.verifyErrorMessageDisplayed();
    }

    @And("el proceso de carga no se inicia")
    public void el_proceso_de_carga_no_se_inicia() {
        uploadPage.verifyUploadProcessNotStarted();
    }
}