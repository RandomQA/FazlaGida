package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.B_US_02_Links_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class B_US_02_Links_StepDefinitions {

    B_US_02_Links_Page b_us_02_links_page;


    @Given("User clicks the Atik Olmasin link on HomePage")
    public void user_clicks_the_Atik_Olmasin_link_on_HomePage() {
        b_us_02_links_page = new B_US_02_Links_Page();
        b_us_02_links_page.atikOlmasin.click();


    }

    @Given("User clicks the Hakkimizda Link")
    public void user_clicks_the_Hakkimizda_Link() {
        b_us_02_links_page = new B_US_02_Links_Page();
        b_us_02_links_page.hakkimizda.click();
    }

    @Given("User clicks Gida Isletmeleri link on homepage")
    public void user_clicks_Gida_Isletmeleri_link_on_homepage() {
        b_us_02_links_page = new B_US_02_Links_Page();
        b_us_02_links_page.gidaIsletmeleri.click();
    }

    @Given("User clicks Gida Bankalari link on HomePage")
    public void user_clicks_Gida_Bankalari_link_on_HomePage() {
        b_us_02_links_page = new B_US_02_Links_Page();
        b_us_02_links_page.gidaBankalari.click();
    }

    @Given("User clicks Kariyer link on Homepage")
    public void user_clicks_Kariyer_link_on_Homepage() {
        b_us_02_links_page = new B_US_02_Links_Page();
        b_us_02_links_page.kariyer.click();
    }

    @Given("User clicks on Bize Ulasin link on HomePage")
    public void user_clicks_on_Bize_Ulasin_link_on_HomePage() {
        b_us_02_links_page = new B_US_02_Links_Page();
        b_us_02_links_page.bizeUlasin.click();
    }

    @Given("User clicks on App link on HomePage")
    public void user_clicks_on_App_link_on_HomePage() {
        b_us_02_links_page = new B_US_02_Links_Page();
        b_us_02_links_page.app.click();
        ReusableMethods.wait(1);
        Driver.closeDriver();
    }


}
