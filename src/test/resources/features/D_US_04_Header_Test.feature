@header @smoke
Feature: Sistem kullaniciya hesabina giris yaptiktan sonra HEADER kismindaki linklere tiklayip acilan sayfalarda gezinmeye musaade etmelidir.


  Background: Login
    Given Kullanici anasayfaya gider "https://www.tutumluanne.com/"
    And Kullanici Giris Yap butonuna tiklar.
    And Kullanici E-posta adresini girer "foreachloop2021@gmail.com"
    And Kullanici sifresini girer "40414005"
    And Kullanici Giris yap butonuna tiklar.

  @US04_TC01
  Scenario: US04_TC01 BEBEK TELSIZLERI Testi
    And Kullanici BEBEK TELSIZLERI Butonuna tiklar.
    And Kullanici sayfanin en altina iner.
    And Kullanici sayfayi kapatir.

  @US04_TC02
  Scenario: US04_TC02 LEGO Testi
    And Kullanici LEGO Butonuna tiklar.
    And Kullanici sayfanin en altina iner.
    And Kullanici sayfayi kapatir.


  @US04_TC03
  Scenario: US04_TC03 EGITICI OYUNCAKLAR Testi
    And Kullanici EGITICI OYUNCAKLAR Butonuna tiklar.
    And Kullanici sayfanin en altina iner.
    And Kullanici sayfayi kapatir.


  @US04_TC04
  Scenario: US04_TC04 MAMA SANDALYELERI Testi
    And Kullanici MAMA SANDALYELERI Butonuna tiklar.
    And Kullanici sayfanin en altina iner.
    And Kullanici sayfayi kapatir.


  @US04_TC05
  Scenario: US04_TC05 BESIKLER Testi
    And Kullanici BESIKLER Butonuna tiklar.
    And Kullanici sayfanin en altina iner.
    And Kullanici sayfayi kapatir.


  @US04_TC06
  Scenario: US04_TC06 EV TIPI ANA KUCAKLARI Testi
    And Kullanici EV TIPI ANA KUCAKLARI Butonuna tiklar.
    And Kullanici sayfanin en altina iner.
    And Kullanici sayfayi kapatir.


  @US04_TC07
  Scenario: US04_TC07 BEBEK ARABALARI Testi
    And Kullanici BEBEK ARABALARI Butonuna tiklar.
    And Kullanici sayfanin en altina iner.
    And Kullanici sayfayi kapatir.


  @US04_TC08
  Scenario: US04_TC08 EVCILIK OYUNCAKLARI Testi
    And Kullanici EVCILIK OYUNCAKLARI Butonuna tiklar.
    And Kullanici sayfanin en altina iner.
    And Kullanici sayfayi kapatir.
