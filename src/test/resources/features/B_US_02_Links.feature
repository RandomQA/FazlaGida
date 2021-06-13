@links @smoke

Feature: System should allow user to navigate all links on header

  Background: HomePage
    Given User goes to the homepage "https://www.fazlagida.com/"

  @US02_TC01
  Scenario: US02_TC01 Header Links Test
    Given User clicks the Atik Olmasin link on HomePage
    And User clicks the Hakkimizda Link
    And User clicks Gida Isletmeleri link on homepage
    And User clicks Gida Bankalari link on HomePage
    And User clicks Kariyer link on Homepage
    And User clicks on Bize Ulasin link on HomePage
    And User clicks on App link on HomePage



