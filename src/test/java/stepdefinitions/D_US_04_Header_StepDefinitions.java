package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.D_US_04_Header_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class D_US_04_Header_StepDefinitions {

    D_US_04_Header_Page d_us_04_header_page;

    @Given("Kullanici sayfanin en altina iner.")
    public void kullanici_sayfanin_en_altina_iner() {
        d_us_04_header_page = new D_US_04_Header_Page();
        ReusableMethods.scrollToElement(d_us_04_header_page.bottomOfPage);
        ReusableMethods.wait(2);
    }

    @Given("Kullanici BEBEK TELSIZLERI Butonuna tiklar.")
    public void kullanici_BEBEK_TELSIZLERI_Butonuna_tiklar() {
        d_us_04_header_page = new D_US_04_Header_Page();
        d_us_04_header_page.bebekTelsizleri.click();
        ReusableMethods.wait(2);

    }

    @Given("Kullanici LEGO Butonuna tiklar.")
    public void kullanici_LEGO_Butonuna_tiklar() {
        d_us_04_header_page = new D_US_04_Header_Page();
        d_us_04_header_page.lego.click();
        ReusableMethods.wait(2);

    }


    @Given("Kullanici EGITICI OYUNCAKLAR Butonuna tiklar.")
    public void kullanici_EGITICI_OYUNCAKLAR_Butonuna_tiklar() {
        d_us_04_header_page = new D_US_04_Header_Page();
        d_us_04_header_page.egiticiOyuncaklar.click();
        ReusableMethods.wait(2);

    }

    @Given("Kullanici MAMA SANDALYELERI Butonuna tiklar.")
    public void kullanici_MAMA_SANDALYELERI_Butonuna_tiklar() {
        d_us_04_header_page = new D_US_04_Header_Page();
        ReusableMethods.clickWithJS(d_us_04_header_page.mamaSandalyeleri);
        ReusableMethods.wait(2);

    }

    @Given("Kullanici BESIKLER Butonuna tiklar.")
    public void kullanici_BESIKLER_Butonuna_tiklar() {
        d_us_04_header_page = new D_US_04_Header_Page();
        ReusableMethods.clickWithJS(d_us_04_header_page.besikler);
        ReusableMethods.wait(2);
    }

    @Given("Kullanici EV TIPI ANA KUCAKLARI Butonuna tiklar.")
    public void kullanici_EV_TIPI_ANA_KUCAKLARI_Butonuna_tiklar() {
        d_us_04_header_page = new D_US_04_Header_Page();
        d_us_04_header_page.evTipiAnaKucaklari.click();
        ReusableMethods.wait(2);

    }

    @Given("Kullanici BEBEK ARABALARI Butonuna tiklar.")
    public void kullanici_BEBEK_ARABALARI_Butonuna_tiklar() {
        d_us_04_header_page = new D_US_04_Header_Page();
        d_us_04_header_page.bebekArabalari.click();
        ReusableMethods.wait(2);

    }

    @Given("Kullanici EVCILIK OYUNCAKLARI Butonuna tiklar.")
    public void kullanici_EVCILIK_OYUNCAKLARI_Butonuna_tiklar() {
        d_us_04_header_page = new D_US_04_Header_Page();
        d_us_04_header_page.evcilikOyuncaklari.click();
        ReusableMethods.wait(2);
    }

    @And("Kullanici sayfayi kapatir.")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
