package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class B_US_02_Links_Page {

    public B_US_02_Links_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "menu-item-991")
    public WebElement atikOlmasin;

    @FindBy(linkText = "Hakkımızda")
    public WebElement hakkimizda;

    @FindBy(linkText = "Gıda İşletmeleri")
    public WebElement gidaIsletmeleri;

    @FindBy(linkText = "Gıda Bankaları")
    public WebElement gidaBankalari;

    @FindBy(linkText = "Kariyer")
    public WebElement kariyer;

    @FindBy(linkText = "Bize Ulaşın")
    public WebElement bizeUlasin;

    @FindBy(linkText = "App")
    public WebElement app;
}
