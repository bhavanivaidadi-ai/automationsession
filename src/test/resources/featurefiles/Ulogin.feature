Feature: user should able to login and encounter the invalid logins

  Scenario: user login with valid user name and password

    Given user is on login page
    When user enters "Admin" and "admin123"
    And user clicks on login button
    Then user is successfully logged in


  Scenario Outline: Unsuccessful login with invalid credentials

    Given user is on login page
    When user enters <username> <password>
    And user clicks on login button
    Then user get this <message>




    Examples:
      | username | password       | message                 |
      | "Admin"  | "admin@12345"  | "Invalid credentials"   |
      | "admin"  | "admin"        | "Invalid credentials"   |
      | ""       | "admin123"     | "Required"              |
      | "Admin"  | ""             | "Required"              |
      | ""       | ""             | "Required & Invalid credentials"              |
