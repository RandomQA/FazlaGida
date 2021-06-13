package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.A_US_01_Homepage_Page;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.util.List;

public class A_US_01_Homepage_StepDefinitions {
    A_US_01_Homepage_Page a_us_01_homepage_page;
    Actions action;

    @Given("User goes to the homepage {string}")
    public void user_goes_to_the_homepage(String string) {
        Driver.getDriver().get(string);
        ReusableMethods.wait(2);
    }

    @Given("User scroll down to the second page.")
    public void user_scroll_down_to_the_second_page() {
        action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Given("User scroll slowly to the bottom of the page")
    public void user_scroll_slowly_to_the_bottom_of_the_page() {
        action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);
    }

    @Given("And User clicks on the FACEBOOK link")
    public void and_User_clicks_on_the_FACEBOOK_link() {
        a_us_01_homepage_page = new A_US_01_Homepage_Page();
        a_us_01_homepage_page.faceBook.click();
        ReusableMethods.wait(3);
    }

    @Then("User navigate back to the homepage")
    public void user_navigate_back_to_the_homepage() {
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(3);

    }

    @Then("User clicks on the TWITTER page")
    public void user_clicks_on_the_TWITTER_page() {
        a_us_01_homepage_page = new A_US_01_Homepage_Page();
        a_us_01_homepage_page.twitter.click();
        ReusableMethods.wait(3);
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(3);
    }

    @Then("User click the button of UP")
    public void user_click_the_button_of_UP() {
        action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_UP).perform();
        action.sendKeys(Keys.PAGE_UP).perform();
        action.sendKeys(Keys.PAGE_UP).perform();
        action.sendKeys(Keys.PAGE_UP).perform();
        Driver.closeDriver();
    }
}
