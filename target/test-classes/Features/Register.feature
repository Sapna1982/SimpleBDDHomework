Feature: NopCommerce Register

Background:
    Given user able to Open Browser
    And Enter URL

Scenario: NopCommerce Valid Registration Test
    When user clicks on Register Link
    Then user on Register Page
    And user enters Gender
    Then First Name and Last Name
    Then Date Of Birth
    Then Email and Company Name
    Then password and confirms password
    And click on register button
    Then user is Registered
    And user closes the Browser