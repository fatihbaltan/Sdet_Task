Feature:Manage Booking
@wip
  Scenario: Manage booking with correct credentials
    Given the user is on the home page
    And the user click on the manage booking
    And the user enter the 'BDOR109768' and 'Tester' and pick the date
    When the user click on the search user should be in the booking information page
    And the user click in the Amend booking
    Then the user in the Amend booking page
    And the user change the arrival date to 25 August
