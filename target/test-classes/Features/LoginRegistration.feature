Feature: validate the login and registration

  Background: 
    user is on the facebook page


  @venkat
  Scenario Outline: validate the login functionality
    When user enters the invalid "<username>" and "<password>"
    And user click the login button
    Then user verifies the error message

    Examples: 
      | username  | password |
      | venkat123 | jolly123 |
      | eswar123  | lalala   |
      | abcdef    |  1212121 |

  @saran
  Scenario: validate the text properties of create an account
    When user get the text properties of create an account
    Then user verifies the text properties
