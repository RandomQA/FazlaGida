package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.A_US_01_KayitOlma_Page;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class A_US_01_KayitOlma_StepDefinitions {
    A_US_01_KayitOlma_Page a_us_01_kayitOlma_page;

    @Given("Kullanici anasayfaya gider {string}")
    public void Kullanici_anasayfaya_gider(String string) {

        Driver.getDriver().get(ConfigurationReader.getProperty("homePage"));
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Giris Yap butonuna tiklar.")
    public void kullanici_Giris_Yap_butonuna_tiklar() {
        a_us_01_kayitOlma_page = new A_US_01_KayitOlma_Page();
        a_us_01_kayitOlma_page.girisYapButonu.click();
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Hemen Uye Ol butonuna tiklar.")
    public void kullanici_Hemen_Uye_Ol_butonuna_tiklar() {
        a_us_01_kayitOlma_page = new A_US_01_KayitOlma_Page();
        a_us_01_kayitOlma_page.hemenUyeOl.click();
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Adiniz Soyadiniz text kutusuna Adini Soyadini {string} girer.")
    public void kullanici_Adiniz_Soyadiniz_text_kutusuna_Adini_Soyadini_girer(String string) {
        a_us_01_kayitOlma_page = new A_US_01_KayitOlma_Page();
        a_us_01_kayitOlma_page.adinizSoyadinizTextBox.sendKeys(string);
        ReusableMethods.wait(1);
    }

    @Given("Kullanici E-Posta adresini {string} girer")
    public void kullanici_E_Posta_adresini_girer(String string) {
        a_us_01_kayitOlma_page = new A_US_01_KayitOlma_Page();
        a_us_01_kayitOlma_page.epostaTextBox.sendKeys(string);
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Sifresini {string} girer.")
    public void kullanici_Sifresini_girer(String string) {
        a_us_01_kayitOlma_page = new A_US_01_KayitOlma_Page();
        a_us_01_kayitOlma_page.firstPassword.sendKeys(string);
        ReusableMethods.wait(2);
    }

    @Given("Kullanici Sifresini {string} tekrar girer.")
    public void kullanici_Sifresini_tekrar_girer(String string) {
        a_us_01_kayitOlma_page = new A_US_01_KayitOlma_Page();
        a_us_01_kayitOlma_page.secondPassword.sendKeys(string);
        ReusableMethods.wait(1);
    }

    @And("Kullanici Kullanici adini {string} girer.")
    public void kullaniciKullaniciAdiniGirer(String string) {
        a_us_01_kayitOlma_page = new A_US_01_KayitOlma_Page();
        a_us_01_kayitOlma_page.KullaniciAdiTextBox.sendKeys(string);
    }

    @Given("Kullanici Telefon numarasini {string} girer.")
    public void kullanici_Telefon_numarasini_girer(String string) {
        a_us_01_kayitOlma_page = new A_US_01_KayitOlma_Page();
        a_us_01_kayitOlma_page.phoneTextBox.sendKeys(string);
        ReusableMethods.wait(1);
    }

    @Given("Kullanici sozlesme metnini okudugunu onaylar.")
    public void kullanici_sozlesme_metnini_okudugunu_onaylar() {
        a_us_01_kayitOlma_page = new A_US_01_KayitOlma_Page();
        a_us_01_kayitOlma_page.checkMarkSozlesme.click();
        ReusableMethods.wait(1);
    }

    @Given("Kullanici uye ol butonuna tiklar.")
    public void kullanici_uye_ol_butonuna_tiklar() {
        a_us_01_kayitOlma_page = new A_US_01_KayitOlma_Page();
        a_us_01_kayitOlma_page.uyeOlButtonu.click();
        ReusableMethods.wait(1);
    }

    @Then("Kullanici Basarili bir sekilde kayit oldugunu dogrular.")
    public void kullanici_Basarili_bir_sekilde_kayit_oldugunu_dogrular() {
        a_us_01_kayitOlma_page = new A_US_01_KayitOlma_Page();
        ReusableMethods.wait(1);
        a_us_01_kayitOlma_page.kayitMesaji.isDisplayed();
        Driver.closeDriver();
    }
}
