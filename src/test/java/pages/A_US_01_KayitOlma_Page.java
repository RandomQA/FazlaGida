package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class A_US_01_KayitOlma_Page {


    public A_US_01_KayitOlma_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement girisYapButonu;

    @FindBy(xpath = "//a[@class='btn btn-m-lg btn-primary w-100 mb-0 signUpButton']")
    public WebElement hemenUyeOl;

    @FindBy(xpath = "//input[@placeholder='Adınız Soyadınız']")
    public WebElement adinizSoyadinizTextBox;

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

    @FindBy(id = "signupSubmit")
    public WebElement uyeOlButtonu;

    @FindBy(xpath = "//p[@class='font30 font-weight-bold black']")
    public WebElement kayitMesaji;





}
