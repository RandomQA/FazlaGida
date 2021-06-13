@HomePage @smoke

Feature: System should allow user to navigate on HomePage

  Background: HomePage
    Given User goes to the homepage "https://www.fazlagida.com/"


  @US01_TC
  Scenario: US01_TC01 HomePage navigation
    Given User scroll down to the second page.
    And User scroll slowly to the bottom of the page
    And And User clicks on the FACEBOOK link
    Then User navigate back to the homepage
    And User clicks on the TWITTER page
    Then User navigate back to the homepage
    And User click the button of UP


