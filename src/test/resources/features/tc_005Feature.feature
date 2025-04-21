Feature: Validate document upload under unstable network conditions

  Scenario: Uploading document with unstable network
    Given I am on the document upload page
    When I simulate an unstable network and attempt to upload a document
    Then the system should manage the interruption and retry the upload
    And I should see an appropriate message indicating failure or retry