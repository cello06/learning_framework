Feature: Webautomation page tabs functionality



  Scenario: Draggable tab auto-scrolling functionality
    Given The user is on the webautomation page
    And the user clicked to Draggable tab
    And the user clicked to Auto Scrolling link
    When the user Drag the first draggable element by 215 pixels to the right
    And the user Drag the third draggable element by -215 pixels to the left
    Then the elements are ordered as Three, Two, One