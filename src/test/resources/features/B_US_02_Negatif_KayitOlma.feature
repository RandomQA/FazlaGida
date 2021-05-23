@negatifKayit @smoke

Feature: Sistem kullaniciya yanlis datalarla kayit olmaya musaade etmemeli

  Background: anasayfa
    Given Kullanici anasayfaya gider "https://www.tutumluanne.com/"

  @US02_TC01
  Scenario Outline: US02_TC01 Adi Soyadi textBox Testi
    Given Kullanici Giris Yap butonuna tiklar.
    And Kullanici Hemen Uye Ol butonuna tiklar.
    And Kullanici Adiniz Soyadiniz text kutusuna Adini Soyadini "<Adi Soyadi>" yazmadan kayit olmayi dener.
    And Kullanici E-Posta adresini "<E-Posta>" girer
    And Kullanici Kullanici adini "<Kullanici Adi>" girer.
    And Kullanici Sifresini "<Sifre>" girer.
    And Kullanici Sifresini "<Sifre>" tekrar girer.
    And Kullanici Telefon numarasini "<Telefon Numarasi>" girer.
    And Kullanici sozlesme metnini okudugunu onaylar.
    And Kullanici uye ol butonuna tiklar.
    Then Kullanici hata mesajini dogrular.


    Examples:
      | Adi Soyadi | Kullanici Adi | Sifre     | Sifre     | Telefon Numarasi | E-Posta            |
      |            | ACANQA        | Ali123456 | Ali123456 | 5550230407       | alican22@gmail.com |
      | @$#%^&&$@! |               | Ali123456 | Ali123456 | 5550234067       | alican55@gmail.com |
      | 1234454321 |               | Ali123456 | Ali123456 | 5551034560       | alican77@gmail.com |

  @US02_TC02
  Scenario Outline: US02_TC02 E-Posta TextBox Testi
    Given Kullanici Giris Yap butonuna tiklar.
    And Kullanici Hemen Uye Ol butonuna tiklar.
    And Kullanici Adiniz Soyadiniz text kutusuna Adini Soyadini "<Adi Soyadi>" girer.
    And Kullanici E-Posta adresini "<E-Posta>" girmeden kayit olmayi dener.
    And Kullanici Kullanici adini "<Kullanici Adi>" girer.
    And Kullanici Sifresini "<Sifre>" girer.
    And Kullanici Sifresini "<Sifre>" tekrar girer.
    And Kullanici Telefon numarasini "<Telefon Numarasi>" girer.
    And Kullanici sozlesme metnini okudugunu onaylar.
    And Kullanici uye ol butonuna tiklar.
    Then Kullanici E-Posta textBox'inin altindaki hata mesajini dogrular.


    Examples:

      | Adi Soyadi | E-Posta                 | Kullanici Adi | Sifre     | Sifre     | Telefon Numarasi |
      | Ali Can    |                         | AliQATR       | Ali123456 | Ali123456 | 5551034560       |
      | Ali Can    | alican1999.com          | AliMYCE       | Ali123456 | Ali123456 | 5551804566       |
      | Ali Can    | 123@gmail.gmail.com.com |               | Ali123456 | Ali123456 | 5554230560       |


  @US02_TC03
  Scenario Outline: US02_TC03 Kullanici Adi TextBox Testi
    Given Kullanici Giris Yap butonuna tiklar.
    And Kullanici Hemen Uye Ol butonuna tiklar.
    And Kullanici Adiniz Soyadiniz text kutusuna Adini Soyadini "<Adi Soyadi>" girer.
    And Kullanici E-Posta adresini "<E-Posta>" girer
    And Kullanici Kullanici adini "<Kullanici Adi>" girmeden kayit olmayi dener.
    And Kullanici Sifresini "<Sifre>" girer.
    And Kullanici Sifresini "<Sifre>" tekrar girer.
    And Kullanici Telefon numarasini "<Telefon Numarasi>" girer.
    And Kullanici sozlesme metnini okudugunu onaylar.
    And Kullanici uye ol butonuna tiklar.
    Then Kullanici Kullanici Adi textBox'inin altindaki hata mesajini dogrular.


    Examples:

      | Adi Soyadi | E-Posta             | Kullanici Adi | Sifre     | Sifre     | Telefon Numarasi |
      | Ali Can    | alican777@gmail.com |               | Ali123456 | Ali123456 | 5551034407       |
      | Ali Can    | alican333@gmail.com | *&^%$#@@%^&*  | Ali123456 |           | 5551204440       |
      | Ali Can    | alican110@gmail.com | 123456789     | Ali123456 |           | 5554434577       |

