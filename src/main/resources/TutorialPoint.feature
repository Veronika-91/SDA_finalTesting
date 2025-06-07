Feature: TutorialPoint

  #REQ-C1
  Scenario: Checkbox basic checking
    Given the user is on the website tutorialpoint checkbox
    When user clicks on the checkbox with id "c_bs_1"
    Then user sees the ticked checkbox with id "c_bs_1"

    #REQ-C2
  Scenario: Checkbox - ticking all checkboxes
    Given the user is on the website tutorialpoint checkbox
    When user clicks on the button plus for rollup offer with xpath "html/body/main/div/div/div[2]/div/ul/li[1]/span[1]"
    When user clicks on the checkbox with id "c_bf_1"
    And user clicks on the checkbox with id "c_bf_2"
    Then user sees the ticked checkbox with id "c_bs_1"

    #REQ-C2
  Scenario: Checkbox unticking the checkbox will untick the main checkbox
    Given the user is on the website tutorialpoint checkbox
    When user clicks on the checkbox with id "c_bs_1"
    And user clicks on the button plus for rollup offer with xpath "html/body/main/div/div/div[2]/div/ul/li[1]/span[1]"
    And user clicks on the checkbox with id "c_bf_1"
    Then user sees the unticked checkbox with id "c_bs_1"

    #REQ-C3
  Scenario: Checkbox collective ticking
    Given the user is on the website tutorialpoint checkbox
    When user clicks on the checkbox with id "c_bs_1"
    And user clicks on the button plus for rollup offer with xpath "/html/body/main/div/div/div[2]/div/ul/li[1]/span[1]"
    Then user sees the ticked checkbox with id "c_bf_1"
    And user sees the ticked checkbox with id "c_bf_2"
    When user clicks on the checkbox with id "c_bs_1"
    Then user sees the unticked checkbox with id "c_bf_1"
    And user sees the unticked checkbox with id "c_bf_2"



