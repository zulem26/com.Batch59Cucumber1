Feature: Verify Test Cases
  @autoEx
  Scenario: TC 20 Verify Test

    Given user launches the browser
    When user navigate to URl
    Then user verifies that home page is visible succesfully
    And user clicks on Test Cases button
    Then user is navigated to test cases page succesfully
    Then user closes the browser