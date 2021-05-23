package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class B_US_02_Negatif_Kayit_Page {

    public B_US_02_Negatif_Kayit_Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Adınız Soyadınız']")
    public WebElement adinizSoyadinizTextBox;

    @FindBy(xpath = "//span[@id='name-error']")
    public WebElement hataMesajiAdSoyad;

    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement girisYapButonu;

    @FindBy(xpath = "//a[@class='btn btn-m-lg btn-primary w-100 mb-0 signUpButton']")
    public WebElement hemenUyeOl;

    @FindBy(xpath = "(//input[@placeholder='E-Posta'])[2]")
    public WebElement epostaTextBox;

    @FindBy(xpath = "//input[@placeholder='Kullanıcı Adı']")
    public WebElement KullaniciAdiTextBox;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement firstPassword;

    @FindBy(xpath = "(//input[@type='password'])[3]")
    public WebElement secondPassword;

    @FindBy(xpath = "//input[@class='form-control maskPhone']")
    public WebElement phoneTextBox;

    @FindBy(xpath = "(//span[@class='checkmark'])[2]")
    public WebElement checkMarkSozlesme;

    @FindBy(className = "btn btn-m-lg btn-lg w-100 mb-0")
    public WebElement uyeOlButtonu;

    @FindBy(xpath = "//p[@class='font30 font-weight-bold black']")
    public WebElement kayitMesaji;

    @FindBy(xpath = "//*[@id='uyeol']/form/div[2]/span")
    public WebElement hataMesajiEmail;

    @FindBy(xpath = "//*[@id='uyeol']/form/div[3]/span")
    public WebElement hataMesajiKullaniciAdi;



}
