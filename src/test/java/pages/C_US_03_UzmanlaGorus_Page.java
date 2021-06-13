package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class C_US_03_UzmanlaGorus_Page {
    public C_US_03_UzmanlaGorus_Page() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='et_pb_button et_pb_more_button et_pb_button_one']")
    public WebElement uzmanButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/input[1]")
    public WebElement adSoyadi;

    @FindBy(xpath = "//input[@id='lastname-eb200e1a-6227-4548-824b-18ca960e8f11']")
    public WebElement firmaAdi;

    @FindBy(xpath = "//input[@id='email-eb200e1a-6227-4548-824b-18ca960e8f11']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='TICKET.subject-eb200e1a-6227-4548-824b-18ca960e8f11']")
    public WebElement telefon;

    @FindBy(xpath = "//textarea[@id='TICKET.content-eb200e1a-6227-4548-824b-18ca960e8f11']")
    public WebElement urunAdi;

    @FindBy(xpath = "//label[@for='urun_durumu1-eb200e1a-6227-4548-824b-18ca960e8f11']")
    public WebElement urunDurumu;

    @FindBy(xpath = "//input[@id='miktar-eb200e1a-6227-4548-824b-18ca960e8f11']")
    public WebElement miktar;

    @FindBy(xpath = "//input[@id='lokasyon-eb200e1a-6227-4548-824b-18ca960e8f11']")
    public WebElement lokasyon;

    @FindBy(xpath = "//label[@for='mevcut_degerlendirme_yontemi2-eb200e1a-6227-4548-824b-18ca960e8f11']")
    public WebElement hayvanBarinak;




}
