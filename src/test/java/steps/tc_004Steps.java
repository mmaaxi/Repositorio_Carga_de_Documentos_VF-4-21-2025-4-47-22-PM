package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page pdfPage = new tc_004Page();

    @Given("the user is on the document upload page")
    public void the_user_is_on_the_document_upload_page() {
        pdfPage.navigateToUploadPage();
    }

    @When("the user uploads a well-formatted PDF document")
    public void the_user_uploads_a_well_formatted_pdf_document() {
        pdfPage.uploadPDFDocument("path/to/well_formatted.pdf");
    }

    @Then("the system should accept the document without errors")
    public void the_system_should_accept_the_document_without_errors() {
        Assert.assertTrue(pdfPage.isUploadSuccessful());
    }

    @Given("the user has uploaded a PDF document")
    public void the_user_has_uploaded_a_pdf_document() {
        pdfPage.confirmPDFUploaded();
    }

    @When("the user opens the document from the application")
    public void the_user_opens_the_document_from_the_application() {
        pdfPage.openPDFDocument();
    }

    @Then("the document should be displayed correctly without corruption")
    public void the_document_should_be_displayed_correctly_without_corruption() {
        Assert.assertTrue(pdfPage.isPDFDisplayedCorrectly());
    }
}