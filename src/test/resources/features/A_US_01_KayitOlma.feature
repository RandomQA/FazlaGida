@kayitolma @smoke

Feature: Sistem kullaniciya dogru datalarla kayit olmaya musaade etmeli

  Background: anasayfa
    Given Kullanici anasayfaya gider "https://www.tutumluanne.com/"


  @US01_TC01
  Scenario Outline: US01_TC01 Dogru datalarla Basarili Kayit Olma
    Given Kullanici Giris Yap butonuna tiklar.
    And Kullanici Hemen Uye Ol butonuna tiklar.
    And Kullanici Adiniz Soyadiniz text kutusuna Adini Soyadini "<Adi Soyadi>" girer.
    And Kullanici E-Posta adresini "<E-Posta>" girer
    And Kullanici Kullanici adini "<Kullanici Adi>" girer.
    And Kullanici Sifresini "<Sifre>" girer.
    And Kullanici Sifresini "<Sifre>" tekrar girer.
    And Kullanici Telefon numarasini "<Telefon Numarasi>" girer.
    And Kullanici sozlesme metnini okudugunu onaylar.
    And Kullanici uye ol butonuna tiklar.
    Then Kullanici Basarili bir sekilde kayit oldugunu dogrular.


    Examples:
      | Adi Soyadi  | E-Posta               | Sifre       | Sifre       | Telefon Numarasi | Kullanici Adi |
      | Ali CanLI   | alicanZAGA@gmail.com  | Ali123456   | Ali123456   | 5551114529       | AACAN1TCKT    |
      | Ayse HanLI  | aysehanATAG@gmail.com | Ayse123456  | Ayse123456  | 5550611159       | AAYHANTKYT    |
      | Osman CanLI | osmanYARA@gmail.com   | Osman123456 | Osman123456 | 5550401110       | AOSCANKBGT    |
