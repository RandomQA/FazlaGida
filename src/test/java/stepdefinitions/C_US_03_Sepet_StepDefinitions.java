package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.C_US_03_Sepet_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ResourceBundle;

public class C_US_03_Sepet_StepDefinitions {
    C_US_03_Sepet_Page c_us_03_sepet_page;
    Actions action;

    @Given("Kullanici E-posta adresini girer {string}")
    public void kullanici_E_posta_adresini_girer(String string) {
        c_us_03_sepet_page=new C_US_03_Sepet_Page();
        c_us_03_sepet_page.emailTextBox.sendKeys(string);
        ReusableMethods.wait(1);
    }

    @Given("Kullanici sifresini girer {string}")
    public void kullanici_sifresini_girer(String string) {
        c_us_03_sepet_page=new C_US_03_Sepet_Page();
        c_us_03_sepet_page.sifreTextBox.sendKeys(string);
        ReusableMethods.wait(1);

    }
    @And("Kullanici Giris yap butonuna tiklar.")
    public void kullaniciGirisYapButonunaTiklar() {
        c_us_03_sepet_page=new C_US_03_Sepet_Page();
        c_us_03_sepet_page.girisYapButton.click();
        ReusableMethods.wait(1);

    }
    @Given("Kullanici arama textbox'ina arayacagi urunu yazar {string}")
    public void kullanici_arama_textbox_ina_arayacagi_urunu_yazar(String string) {
        c_us_03_sepet_page=new C_US_03_Sepet_Page();
        c_us_03_sepet_page.aramaTextBox.sendKeys(string);

    }
    @Then("Kullanici Enter tusuna basar.")
    public void kullanici_Enter_tusuna_basar() {
        action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.ENTER);
        ReusableMethods.wait(3);
    }



    @Given("Kullanici en ustte cikan urunun gorseline basar.")
    public void kullanici_en_ustte_cikan_urunun_gorseline_basar() {
        c_us_03_sepet_page=new C_US_03_Sepet_Page();
        c_us_03_sepet_page.ilkUrun.click();
        ReusableMethods.wait(3);

    }

    @Then("Kullanici Sepete Ekle butonuna basar.")
    public void kullanici_Sepete_Ekle_butonuna_basar() {
        c_us_03_sepet_page=new C_US_03_Sepet_Page();
        c_us_03_sepet_page.sepeteEkleButton.click();


    }

    @Then("Kullanici Alisverise Devam Et butonuna tiklar.")
    public void kullanici_Alisverise_Devam_Et_butonuna_tiklar() {
        c_us_03_sepet_page=new C_US_03_Sepet_Page();
        c_us_03_sepet_page.alisveriseDevam.click();
        ReusableMethods.wait(2);
    }

    @Then("Kullanici arama textbox'ina arayacagi urunu tekrar yazar {string}")
    public void kullanici_arama_textbox_ina_arayacagi_urunu_tekrar_yazar(String string) {

        c_us_03_sepet_page=new C_US_03_Sepet_Page();
        c_us_03_sepet_page.aramaTextBox.sendKeys(string);
        ReusableMethods.wait(2);
    }



    @Then("Kullanici yine en ustte cikan urunun gorseline tiklar.")
    public void kullanici_yine_en_ustte_cikan_urunun_gorseline_tiklar() {
        c_us_03_sepet_page=new C_US_03_Sepet_Page();
        c_us_03_sepet_page.ikinciUrun.click();
        ReusableMethods.wait(1);

    }


    @Then("Kullanici Sepete Git butonuna basar.")
    public void kullanici_Sepete_Git_butonuna_basar() {
        c_us_03_sepet_page=new C_US_03_Sepet_Page();
        c_us_03_sepet_page.sepeteGit.click();
        Driver.closeDriver();
    }





}
