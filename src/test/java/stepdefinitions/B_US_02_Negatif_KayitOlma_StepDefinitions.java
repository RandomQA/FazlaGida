package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.B_US_02_Negatif_Kayit_Page;
import utilities.Driver;

import javax.swing.*;

public class B_US_02_Negatif_KayitOlma_StepDefinitions {

    B_US_02_Negatif_Kayit_Page b_us_02_negatif_kayit_page;

    @Given("Kullanici Adiniz Soyadiniz text kutusuna Adini Soyadini {string} yazmadan kayit olmayi dener.")
    public void kullanici_Adiniz_Soyadiniz_text_kutusuna_Adini_Soyadini_yazmadan_kayit_olmayi_dener(String string) {
        b_us_02_negatif_kayit_page = new B_US_02_Negatif_Kayit_Page();
        b_us_02_negatif_kayit_page.adinizSoyadinizTextBox.sendKeys(string);

    }

    @Then("Kullanici hata mesajini dogrular.")
    public void kullanici_hata_mesajini_dogrular() {
        b_us_02_negatif_kayit_page = new B_US_02_Negatif_Kayit_Page();
        b_us_02_negatif_kayit_page.hataMesajiAdSoyad.isDisplayed();

    }


    @Given("Kullanici E-Posta adresini {string} girmeden kayit olmayi dener.")
    public void kullanici_E_Posta_adresini_girmeden_kayit_olmayi_dener(String string) {
        b_us_02_negatif_kayit_page = new B_US_02_Negatif_Kayit_Page();
        b_us_02_negatif_kayit_page.epostaTextBox.sendKeys(string);
    }

    @Then("Kullanici E-Posta textBox'inin altindaki hata mesajini dogrular.")
    public void kullanici_E_Posta_textBox_inin_altindaki_hata_mesajini_dogrular() {
        b_us_02_negatif_kayit_page = new B_US_02_Negatif_Kayit_Page();
        b_us_02_negatif_kayit_page.hataMesajiEmail.isDisplayed();

    }

    @Given("Kullanici Kullanici adini {string} girmeden kayit olmayi dener.")
    public void kullanici_Kullanici_adini_girmeden_kayit_olmayi_dener(String string) {
        b_us_02_negatif_kayit_page = new B_US_02_Negatif_Kayit_Page();
        b_us_02_negatif_kayit_page.KullaniciAdiTextBox.sendKeys(string);


    }

    @Then("Kullanici Kullanici Adi textBox'inin altindaki hata mesajini dogrular.")
    public void kullanici_Kullanici_Adi_textBox_inin_altindaki_hata_mesajini_dogrular() {
        b_us_02_negatif_kayit_page = new B_US_02_Negatif_Kayit_Page();
        b_us_02_negatif_kayit_page.hataMesajiKullaniciAdi.isDisplayed();
        Driver.closeDriver();

    }


}
