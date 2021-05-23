package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class D_US_04_Header_Page {
    public D_US_04_Header_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//i[@class='fa fa-facebook-square']")
    public WebElement bottomOfPage;

    @FindBy(xpath = "//img[@src='https://cdn.tutumluanne.com/Media/widget/story/s-bebektelsiz.png']")
    public WebElement bebekTelsizleri;


    @FindBy(xpath = "//img[@src='https://cdn.tutumluanne.com/Media/widget/story/s-lego.png']")
    public WebElement lego;

    @FindBy(xpath = "//img[@src='https://cdn.tutumluanne.com/Media/widget/story/s-eg%CC%86iticioyuncak.png']")
    public WebElement egiticiOyuncaklar;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[4]/div[2]")
    public WebElement mamaSandalyeleri;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[5]/div[2]")
    public WebElement besikler;

    @FindBy(xpath = "//img[@src='https://cdn.tutumluanne.com/Media/widget/story/s5.jpg']")
    public WebElement evTipiAnaKucaklari;

    @FindBy(xpath = "//img[@src='https://cdn.tutumluanne.com/Media/widget/story/bebek%20araba%20story.jpg']")
    public WebElement bebekArabalari;

    @FindBy(xpath = "//img[@src='https://cdn.tutumluanne.com/Media/widget/story/evcilik.jpg']")
    public WebElement evcilikOyuncaklari;


}
