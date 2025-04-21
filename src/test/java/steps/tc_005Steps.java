package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_005Page;
import static org.junit.Assert.assertTrue;

public class tc_005Steps {

    tc_005Page uploadPage = new tc_005Page();

    @Given("I am on the document upload page")
    public void i_am_on_the_document_upload_page() {
        uploadPage.navigateToUploadPage();
    }

    @When("I simulate an unstable network and attempt to upload a document")
    public void i_simulate_an_unstable_network() {
        uploadPage.simulateUnstableNetwork();
        uploadPage.uploadDocument();
    }

    @Then("the system should manage the interruption and retry the upload")
    public void the_system_should_retry_upload() {
        assertTrue(uploadPage.isRetryMechanismTriggered());
    }

    @Then("I should see an appropriate message indicating failure or retry")
    public void i_should_see_an_appropriate_message() {
        assertTrue(uploadPage.isErrorMessageDisplayed() || uploadPage.isRetryMessageDisplayed());
    }
}