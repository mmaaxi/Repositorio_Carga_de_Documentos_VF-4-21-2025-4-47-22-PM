Feature: Validate PDF document integrity and readability

  Scenario: Upload and verify a well-formatted PDF document
    Given the user is on the document upload page
    When the user uploads a well-formatted PDF document
    Then the system should accept the document without errors

  Scenario: Open and view the uploaded document
    Given the user has uploaded a PDF document
    When the user opens the document from the application
    Then the document should be displayed correctly without corruption