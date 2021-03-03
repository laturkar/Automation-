
Feature: Home Page Feature

  Background:
    Given user has already logged in to application.
      | username | password |
      | CSR005000001  | password1 |

  Scenario: Home Page Title

    Given user is on Home Page
    Then  Page Title should be "School Cockpit Application"

  Scenario: Click on CSR Link

    Given user is on Home Page
    And   user clicks on "Curriculum, Subject and Results (CSR)"
