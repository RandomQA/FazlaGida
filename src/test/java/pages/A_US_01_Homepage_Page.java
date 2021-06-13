package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

import java.util.List;

public class A_US_01_Homepage_Page {


    public A_US_01_Homepage_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='https://www.facebook.com/fazlagida/?ref=fazlagida.com']")
    public WebElement faceBook;

    @FindBy(xpath = "//a[@href='https://twitter.com/FazlaGida/?ref=fazlagida.com']")
    public WebElement twitter;

    @FindBy(xpath = "//h1[@class='et_pb_module_header']")
    public WebElement topOfPage;



}
