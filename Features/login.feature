
  Feature: User login
    Scenario: login success
      Given the entered password="1234"
      And the entered userName="Ruba"
      Then the message "you are welcome" will printed