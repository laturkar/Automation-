
Feature: Academic Page Feature

Background:
  Given user has already logged in to application.
    | username | password |
    | CSR005000001  | password1 |

  Scenario: Academic Page Title

    Given user is on Academic Page
    Then  Page Title of academic page should be "Academic"

  Scenario: Qualitative Descriptors by Student

    Given user is on Academic Page
    When  user click on Assessment Framework dropdown
    When  select Qualitative descriptors by Student option
    Then  select class
    And   select Student
    And   select Assessment
    Then  select LO1, LO2, LO3, LO4 for few subjects
    And   click on Save button
    Then  click on SC+ icon
    And   click on logout menu

