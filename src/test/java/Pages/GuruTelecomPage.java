package Pages;

import Utilities.BrowserUtils;
import Utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruTelecomPage extends BrowserUtils {
    public GuruTelecomPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Add Tariff Plan']")
    public WebElement addTariffPlan;


    public void setAddTariffPlan() {
        staticWait(2);
        addTariffPlan.click();
    }


}
