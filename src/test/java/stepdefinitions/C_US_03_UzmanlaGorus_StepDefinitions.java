package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.C_US_03_UzmanlaGorus_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class C_US_03_UzmanlaGorus_StepDefinitions {

    C_US_03_UzmanlaGorus_Page c_us_03_uzmanlaGorus_page;

    @Then("User clicks the Uzmanimizla Gorusun link.")
    public void user_clicks_the_Uzmanimizla_Gorusun_link() {
        c_us_03_uzmanlaGorus_page = new C_US_03_UzmanlaGorus_Page();
        c_us_03_uzmanlaGorus_page.uzmanButton.click();
        ReusableMethods.wait(1);

//        int size=Driver.getDriver().findElements(By.tagName("iframe")).size();
//        System.out.println(size);
    }

    @Then("User enters name and surname on adi Soyadi Textbox {string}")
    public void user_enters_name_and_surname_on_adi_Soyadi_Textbox(String string) {
        c_us_03_uzmanlaGorus_page = new C_US_03_UzmanlaGorus_Page();
        ReusableMethods.wait(1);
        Driver.getDriver().switchTo().frame("hs-form-iframe-0");
        ReusableMethods.clickWithJS(c_us_03_uzmanlaGorus_page.adSoyadi);
        c_us_03_uzmanlaGorus_page.adSoyadi.sendKeys(string);

    }

    @Then("User enters Company Name on Firma Adi Textbox {string}")
    public void user_enters_Company_Name_on_Firma_Adi_Textbox(String string) {
        c_us_03_uzmanlaGorus_page = new C_US_03_UzmanlaGorus_Page();
        c_us_03_uzmanlaGorus_page.firmaAdi.sendKeys(string);
        ReusableMethods.wait(1);

    }

    @Then("User enters E-mail on E-posta Textbox {string}")
    public void user_enters_E_mail_on_E_posta_Textbox(String string) {
        c_us_03_uzmanlaGorus_page = new C_US_03_UzmanlaGorus_Page();
        c_us_03_uzmanlaGorus_page.email.sendKeys(string);
        ReusableMethods.wait(1);

    }

    @Then("User enters phoneNumber on adi Telefon {string}")
    public void user_enters_phoneNumber_on_adi_Telefon(String string) {
        c_us_03_uzmanlaGorus_page = new C_US_03_UzmanlaGorus_Page();
        c_us_03_uzmanlaGorus_page.telefon.sendKeys(string);
        ReusableMethods.wait(1);

    }

    @Then("User enters product name on adi Urun Adi {string}")
    public void user_enters_product_name_on_adi_Urun_Adi(String string) {
        c_us_03_uzmanlaGorus_page = new C_US_03_UzmanlaGorus_Page();
        c_us_03_uzmanlaGorus_page.urunAdi.sendKeys(string);
        ReusableMethods.wait(1);

    }

    @Then("User selects Atik Urun")
    public void user_selects_Atik_Urun() {
        c_us_03_uzmanlaGorus_page = new C_US_03_UzmanlaGorus_Page();
        c_us_03_uzmanlaGorus_page.urunDurumu.click();
        ReusableMethods.wait(1);

    }


    @And("User enters amount on Miktar TextBox{string}")
    public void userEntersAmountOnMiktarTextBox(String string) {
        c_us_03_uzmanlaGorus_page=new C_US_03_UzmanlaGorus_Page();
        c_us_03_uzmanlaGorus_page.miktar.sendKeys(string);
        ReusableMethods.wait(1);
    }


    @And("User enters Location on Lokasyon TextBox{string}")
    public void userEntersLocationOnLokasyonTextBox(String string) {
        c_us_03_uzmanlaGorus_page=new C_US_03_UzmanlaGorus_Page();
        c_us_03_uzmanlaGorus_page.lokasyon.sendKeys(string);
        ReusableMethods.wait(2);
    }

    @Then("User selects the Urunleri hayvan barinaklarina bagisliyorum.")
    public void user_selects_the_Urunleri_hayvan_barinaklarina_bagisliyorum() {
        c_us_03_uzmanlaGorus_page=new C_US_03_UzmanlaGorus_Page();
        c_us_03_uzmanlaGorus_page.hayvanBarinak.click();
        ReusableMethods.wait(1);
        Driver.closeDriver();

    }


}
