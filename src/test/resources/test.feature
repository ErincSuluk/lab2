Feature: Verification of functionalities of Guru application
  Scenario: Verify Add Tariff Plan website Guru99
    Given The user wants to see Guru demo site
    When The user wants to add Tariff Plan
    Then The user wants to verify "Add Tariff Plans" header
    Then The user wants to Add Tarif Plan details as
    |Monthly Rental|10|
    |Free Local Minutes|12|
    |Free International Minutes|13|
    |Free SMS Pack             |15|
    | Local Per Minutes Charges| 18|
    | International Per Minutes Charges| 25|
    | SMS Per Charges| 28|
    And The user wants to submit
    Then The user wants to verify message as "Congratulation you add Tariff Plan"
