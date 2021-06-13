$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/A_US_01_Homepage.feature");
formatter.feature({
  "name": "System should allow user to navigate on HomePage",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@HomePage"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "HomePage",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User goes to the homepage \"https://www.fazlagida.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.A_US_01_Homepage_StepDefinitions.user_goes_to_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US01_TC01 HomePage navigation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HomePage"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@US01_TC"
    }
  ]
});
formatter.step({
  "name": "User scroll down to the second page.",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.A_US_01_Homepage_StepDefinitions.user_scroll_down_to_the_second_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User scroll slowly to the bottom of the page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.A_US_01_Homepage_StepDefinitions.user_scroll_slowly_to_the_bottom_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "And User clicks on the FACEBOOK link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.A_US_01_Homepage_StepDefinitions.and_User_clicks_on_the_FACEBOOK_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate back to the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.A_US_01_Homepage_StepDefinitions.user_navigate_back_to_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the TWITTER page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.A_US_01_Homepage_StepDefinitions.user_clicks_on_the_TWITTER_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate back to the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.A_US_01_Homepage_StepDefinitions.user_navigate_back_to_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the button of UP",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.A_US_01_Homepage_StepDefinitions.user_click_the_button_of_UP()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/B_US_02_Links.feature");
formatter.feature({
  "name": "System should allow user to navigate all links on header",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@links"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "HomePage",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User goes to the homepage \"https://www.fazlagida.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.A_US_01_Homepage_StepDefinitions.user_goes_to_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US02_TC01 Header Links Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@links"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@US02_TC01"
    }
  ]
});
formatter.step({
  "name": "User clicks the Atik Olmasin link on HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.B_US_02_Links_StepDefinitions.user_clicks_the_Atik_Olmasin_link_on_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Hakkimizda Link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.B_US_02_Links_StepDefinitions.user_clicks_the_Hakkimizda_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Gida Isletmeleri link on homepage",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.B_US_02_Links_StepDefinitions.user_clicks_Gida_Isletmeleri_link_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Gida Bankalari link on HomePage",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.B_US_02_Links_StepDefinitions.user_clicks_Gida_Bankalari_link_on_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Kariyer link on Homepage",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.B_US_02_Links_StepDefinitions.user_clicks_Kariyer_link_on_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Bize Ulasin link on HomePage",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.B_US_02_Links_StepDefinitions.user_clicks_on_Bize_Ulasin_link_on_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on App link on HomePage",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.B_US_02_Links_StepDefinitions.user_clicks_on_App_link_on_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/C_US_03_UzmanlaGorus.feature");
formatter.feature({
  "name": "System should allow user talk with expert.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Uzman"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "name": "US03_TC01 Uzmanla Gorusun Testi",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US03_TC01"
    }
  ]
});
formatter.step({
  "name": "User clicks the Atik Olmasin link on HomePage",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks the Uzmanimizla Gorusun link.",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters name and surname on adi Soyadi Textbox \"\u003cAd Soyad\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters Company Name on Firma Adi Textbox \"\u003cFirma\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters E-mail on E-posta Textbox \"\u003cE-Posta\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters phoneNumber on adi Telefon \"\u003cTelefon\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters product name on adi Urun Adi \"\u003cUrun Adi\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User selects Atik Urun",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters amount on Miktar TextBox\"\u003cMiktar\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters Location on Lokasyon TextBox\"\u003cLokasyon\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User selects the Urunleri hayvan barinaklarina bagisliyorum.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Ad Soyad",
        "Firma",
        "E-Posta",
        "Telefon",
        "Urun Adi",
        "Miktar",
        "Lokasyon"
      ]
    },
    {
      "cells": [
        "Ali Can",
        "TestOtomation",
        "alicanbelli@gmail.com",
        "905552112211",
        "Ekmek",
        "3 ton",
        "Ankara"
      ]
    }
  ]
});
formatter.background({
  "name": "HomePage",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User goes to the homepage \"https://www.fazlagida.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.A_US_01_Homepage_StepDefinitions.user_goes_to_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "US03_TC01 Uzmanla Gorusun Testi",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Uzman"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@US03_TC01"
    }
  ]
});
formatter.step({
  "name": "User clicks the Atik Olmasin link on HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.B_US_02_Links_StepDefinitions.user_clicks_the_Atik_Olmasin_link_on_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Uzmanimizla Gorusun link.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.C_US_03_UzmanlaGorus_StepDefinitions.user_clicks_the_Uzmanimizla_Gorusun_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters name and surname on adi Soyadi Textbox \"Ali Can\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.C_US_03_UzmanlaGorus_StepDefinitions.user_enters_name_and_surname_on_adi_Soyadi_Textbox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Company Name on Firma Adi Textbox \"TestOtomation\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.C_US_03_UzmanlaGorus_StepDefinitions.user_enters_Company_Name_on_Firma_Adi_Textbox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters E-mail on E-posta Textbox \"alicanbelli@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.C_US_03_UzmanlaGorus_StepDefinitions.user_enters_E_mail_on_E_posta_Textbox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters phoneNumber on adi Telefon \"905552112211\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.C_US_03_UzmanlaGorus_StepDefinitions.user_enters_phoneNumber_on_adi_Telefon(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters product name on adi Urun Adi \"Ekmek\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.C_US_03_UzmanlaGorus_StepDefinitions.user_enters_product_name_on_adi_Urun_Adi(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects Atik Urun",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.C_US_03_UzmanlaGorus_StepDefinitions.user_selects_Atik_Urun()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters amount on Miktar TextBox\"3 ton\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.C_US_03_UzmanlaGorus_StepDefinitions.userEntersAmountOnMiktarTextBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Location on Lokasyon TextBox\"Ankara\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.C_US_03_UzmanlaGorus_StepDefinitions.userEntersLocationOnLokasyonTextBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects the Urunleri hayvan barinaklarina bagisliyorum.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.C_US_03_UzmanlaGorus_StepDefinitions.user_selects_the_Urunleri_hayvan_barinaklarina_bagisliyorum()"
});
formatter.result({
  "status": "passed"
});
});