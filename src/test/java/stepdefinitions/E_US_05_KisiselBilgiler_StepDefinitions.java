package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.E_US_05_KisiselBilgiler_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class E_US_05_KisiselBilgiler_StepDefinitions {
    E_US_05_KisiselBilgiler_Page e_us_05_kisiselBilgiler_page;
    Actions action;

    @Given("Kullanici Profilim butonuna tiklar.")
    public void kullanici_Profilim_butonuna_tiklar() {
        e_us_05_kisiselBilgiler_page = new E_US_05_KisiselBilgiler_Page();
        e_us_05_kisiselBilgiler_page.profilimDropDown.click();
        ReusableMethods.wait(2);
    }

    @Given("Kullanici acilan menuden kisisel bilgilerim linkini secer.")
    public void kullanici_acilan_menuden_kisisel_bilgilerim_linkini_secer() {
        e_us_05_kisiselBilgiler_page = new E_US_05_KisiselBilgiler_Page();
        e_us_05_kisiselBilgiler_page.kisiselBilgiler.click();
    }


    @Given("Kullanici adiniz Soyadiniz textbox inin icinde yazanlari silip {string} karakterlerini yazar.")
    public void kullanici_adiniz_Soyadiniz_textbox_inin_icinde_yazanlari_silip_karakterlerini_yazar(String string) {
        action = new Actions(Driver.getDriver());
        e_us_05_kisiselBilgiler_page = new E_US_05_KisiselBilgiler_Page();
        action.doubleClick(e_us_05_kisiselBilgiler_page.adinizSoyadinizTextBox).perform();
        action.keyDown(Keys.CONTROL).sendKeys("a").perform();
        action.keyUp(Keys.CONTROL).perform();
        ReusableMethods.wait(1);
        e_us_05_kisiselBilgiler_page.adinizSoyadinizTextBox.clear();
        ReusableMethods.wait(2);
        e_us_05_kisiselBilgiler_page.adinizSoyadinizTextBox.sendKeys(string);
        ReusableMethods.wait(2);
        action.keyDown(Keys.CONTROL).sendKeys("a").perform();
        action.keyUp(Keys.CONTROL).perform();
        ReusableMethods.wait(3);

    }

    @Given("Kullanici Sayfayi asagi indirir.")
    public void kullanici_Sayfayi_asagi_indirir() {
        action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);

    }

    @Given("Kullanici degisiklikleri kaydet butonuna basar.")
    public void kullanici_degisiklikleri_kaydet_butonuna_basar() {
        e_us_05_kisiselBilgiler_page = new E_US_05_KisiselBilgiler_Page();
        e_us_05_kisiselBilgiler_page.dagisiklikleriKaydet.click();

    }

    @Then("Kullanici adiniz Soyadiniz textBox'inin icindeki yazili metini secer.")
    public void kullanici_adiniz_Soyadiniz_textBox_inin_icindeki_yazili_metini_secer() {
        action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.wait(2);
        e_us_05_kisiselBilgiler_page.adinizSoyadinizTextBox.click();
        action.keyDown(Keys.CONTROL).sendKeys("a").perform();
        action.keyUp(Keys.CONTROL).perform();
        ReusableMethods.wait(3);
        Driver.closeDriver();

    }

    @And("Kullanici dogum tarihi dropdownundan dogum tarihini {string} yapar.")
    public void kullaniciDogumTarihiDropdownundanDogumTarihiniYapar(String yil) {

        e_us_05_kisiselBilgiler_page = new E_US_05_KisiselBilgiler_Page();
        Select options = new Select(e_us_05_kisiselBilgiler_page.dogumYili);
        options.selectByValue(yil);
        ReusableMethods.wait(3);
    }

    @And("Kullanici Sayfayi asagiya indirir indirir.")
    public void kullaniciSayfayiAsagiyaIndirirIndirir() {
        action=new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);
        Driver.closeDriver();
    }
}
