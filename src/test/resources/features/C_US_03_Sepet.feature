@sepet @smoke
  Feature: Sistem kullaniciya sepete birden fazla urun eklemeye ve sepetini guncellemeye musaade etmelidir.
    
    Background: Anasayfa
      Given Kullanici anasayfaya gider "https://www.tutumluanne.com/"
    
    @US03_TC01
    Scenario: US03_TC01 SEPET Testi
      Given Kullanici Giris Yap butonuna tiklar.
      And Kullanici E-posta adresini girer "foreachloop2021@gmail.com"
      And Kullanici sifresini girer "40414005"
      And Kullanici Giris yap butonuna tiklar.
      And Kullanici arama textbox'ina arayacagi urunu yazar "biberon"
      And Kullanici Enter tusuna basar.
      And Kullanici en ustte cikan urunun gorseline basar.
      And Kullanici Sepete Ekle butonuna basar.
      Then Kullanici Alisverise Devam Et butonuna tiklar.
      And Kullanici arama textbox'ina arayacagi urunu tekrar yazar "emzik"
      And Kullanici Enter tusuna basar.
      Then Kullanici yine en ustte cikan urunun gorseline tiklar.
      And Kullanici Sepete Ekle butonuna basar.
      And Kullanici Sepete Git butonuna basar.


