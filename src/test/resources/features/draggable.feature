Feature: Webautomation page tabs functionality

  @web_order
  Scenario Outline: Web_order page login process functionality with invalid credentials
    Given The user is on the weborder login page
    When the user enters "<username>","<password>"
    Then the user face with "<error_message>"
    Examples:
      | username | password | error_message    |
      | cello    | Academy  | Invalid username |
      | Inar     | cello    | Invalid password |
      | cello    | cello    | Invalid username |
      | cello    | cello    | Invalid password |

  @web_automation
  Scenario: Draggable tab auto-scrolling functionality
    Given The user is on the webautomation page
    And the user clicked to Draggable tab
    And the user clicked to Auto Scrolling link
    When the user Drag the first draggable element by 215 pixels to the right
    And the user Drag the third draggable element by -215 pixels to the left
    Then the elements are ordered as Three, Two, One

