@kisiselBilgiler @smoke
Feature: Sistem kullaniciya hesabina giris yaptiktan sonra kisisel bilgilerini degistirmeye musaade etmelidir.


  Background: Kullanici anasayfaya gider.
    Given Kullanici anasayfaya gider "https://www.tutumluanne.com/"
    And Kullanici Giris Yap butonuna tiklar.
    And Kullanici E-posta adresini girer "foreachloop2021@gmail.com"
    And Kullanici sifresini girer "40414005"
    And Kullanici Giris yap butonuna tiklar.

  @US05_TC01
  Scenario: US05_TC01 ISIM degistirme
    And Kullanici Profilim butonuna tiklar.
    And Kullanici acilan menuden kisisel bilgilerim linkini secer.
    And Kullanici adiniz Soyadiniz textbox inin icinde yazanlari silip "BURAYA HERSEY GIRILEBILIYOR. $#@^^$#@*&%" karakterlerini yazar.
    And Kullanici Sayfayi asagi indirir.
    And Kullanici degisiklikleri kaydet butonuna basar.
    And Kullanici Profilim butonuna tiklar.
    And Kullanici acilan menuden kisisel bilgilerim linkini secer.
    Then Kullanici adiniz Soyadiniz textBox'inin icindeki yazili metini secer.


  @US05_TC02
  Scenario: US05_TC01 ISIM degistirme
    And Kullanici Profilim butonuna tiklar.
    And Kullanici acilan menuden kisisel bilgilerim linkini secer.
    And Kullanici Sayfayi asagi indirir.
    And Kullanici dogum tarihi dropdownundan dogum tarihini "2020" yapar.
    And Kullanici degisiklikleri kaydet butonuna basar.
    And Kullanici Profilim butonuna tiklar.
    And Kullanici acilan menuden kisisel bilgilerim linkini secer.
    And Kullanici Sayfayi asagiya indirir indirir.

