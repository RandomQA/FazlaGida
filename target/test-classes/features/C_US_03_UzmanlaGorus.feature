@Uzman @smoke
Feature: System should allow user talk with expert.

  Background: HomePage
    Given User goes to the homepage "https://www.fazlagida.com/"

  @US03_TC01
  Scenario Outline: US03_TC01 Uzmanla Gorusun Testi
    Given User clicks the Atik Olmasin link on HomePage
    Then User clicks the Uzmanimizla Gorusun link.
    And User enters name and surname on adi Soyadi Textbox "<Ad Soyad>"
    And User enters Company Name on Firma Adi Textbox "<Firma>"
    And User enters E-mail on E-posta Textbox "<E-Posta>"
    And User enters phoneNumber on adi Telefon "<Telefon>"
    And User enters product name on adi Urun Adi "<Urun Adi>"
    Then User selects Atik Urun
    And User enters amount on Miktar TextBox"<Miktar>"
    And User enters Location on Lokasyon TextBox"<Lokasyon>"
    Then User selects the Urunleri hayvan barinaklarina bagisliyorum.






    Examples:
      | Ad Soyad | Firma         | E-Posta               | Telefon      | Urun Adi | Miktar | Lokasyon |
      | Ali Can  | TestOtomation | alicanbelli@gmail.com | 905552112211 | Ekmek    | 3 ton  | Ankara   |

