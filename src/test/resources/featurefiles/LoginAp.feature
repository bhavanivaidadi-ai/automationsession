Feature: user able to login the website

  Scenario Outline: user able to handle the captcha

    Given user is in website login page
    When user enter their credentials <uname> <paswrd>
    And user click login button
    Then user login is done successfully
    #And user click cancel btn on popup msg
    And user click on a particular village
    Then user gets the phone number of a person from the village
    And user opens the chat bot
    And user uses the phone number and retrieve their details from bot
    And user clicks on chatbot data entry button




    Examples:
      | uname     |  paswrd         |
      |"mao_4887" | "Apaims@123"    |