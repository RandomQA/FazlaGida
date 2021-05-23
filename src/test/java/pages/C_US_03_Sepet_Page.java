package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class C_US_03_Sepet_Page {
    public C_US_03_Sepet_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='E-Posta']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@placeholder='Şifre']")
    public WebElement sifreTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement girisYapButton;

    @FindBy(xpath = "//input[@class='form-control ui-autocomplete-input']")
    public WebElement aramaTextBox;

    @FindBy(xpath = "//img[@class='card-img-top img-fluid lazyload']")
    public WebElement ilkUrun;

    @FindBy(xpath = "//button[@id='addBasket']")
    public WebElement sepeteEkleButton;

    @FindBy(xpath = "//a[@href='cocuk-108']")
    public WebElement alisveriseDevam;

    @FindBy(xpath = "//*[@id='product-list-container']/div[1]/div[1]/div/a/img")
    public WebElement ikinciUrun;

    @FindBy(linkText = "Sepete Git")
    public WebElement sepeteGit;

    @FindBy(xpath = "//a[@class='btn btn-lg w-100 completePayment font16']")
    public WebElement sepetiOnayla;









}
