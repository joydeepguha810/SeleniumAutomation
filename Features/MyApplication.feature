Feature: Test facebook smoke scenario

  Scenario Outline: Test login with valid credentials
    Given Open firefox and start application
    When I enter valid "<username>" and valid "<password>"
    Then user should be able to login successfully
    Then application should be closed

    Examples: 
      | username         | password  |
      | jguha@gmail.com  | password1 |
      | jguha1@gmail.com | password2 |
      | jguha3@gmail.com | password3 |
