package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;

public class tc_010Steps {

    WebDriver driver;
    tc_010Page page;

    @Given("^El usuario está en la página de carga de documentos$")
    public void navigateToUploadPage() {
        page = new tc_010Page(driver);
        page.navigateToUploadPage();
    }

    @When("^El usuario carga un documento exitosamente$")
    public void uploadDocument() {
        page.uploadDocument();
    }

    @Then("^El sistema registra la operación en el log de auditoría$")
    public void auditLogOperation() {
        page.verifyLogRecorded();
    }

    @When("^El usuario consulta el log de auditoría post-carga$")
    public void checkAuditLog() {
        page.openAuditLogPage();
    }

    @Then("^Se visualizan detalles como fecha, usuario y estado de la operación$")
    public void validateAuditLogDetails() {
        page.checkAuditLogDetails();
    }
}