package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class E_US_05_KisiselBilgiler_Page {

    public E_US_05_KisiselBilgiler_Page() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@class='account']")
    public WebElement profilimDropDown;

    @FindBy(linkText = "Kişisel Bilgilerim")
    public WebElement kisiselBilgiler;

    @FindBy(name = "SellerName")
    public WebElement adinizSoyadinizTextBox;

    @FindBy(xpath = "//button[@class='btn btn-lg px-md-5']")
    public WebElement dagisiklikleriKaydet;

    @FindBy(id = "Year")
    public WebElement dogumYili;






}
