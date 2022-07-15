package Pages;

import Utilities.BrowserUtils;
import Utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruSuccessful extends BrowserUtils {
    public GuruSuccessful(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[.='Congratulation you add Tariff Plan']")
    public WebElement successfulMessage;


    public void setSuccessfulMessage(String expectedMessage) {
        Assert.assertEquals(successfulMessage.getText(),expectedMessage);

    }
}
