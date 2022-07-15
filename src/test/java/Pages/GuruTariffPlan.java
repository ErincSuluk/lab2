package Pages;

import Utilities.BrowserUtils;
import Utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuruTariffPlan extends BrowserUtils {
    public GuruTariffPlan(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h1[.='Add Tariff Plans']")
    public WebElement TariffPlanHeader;

    @FindBy(id = "rental1")
    public WebElement monthlyRental;

    @FindBy(id = "local_minutes")
    public WebElement localMin;

    @FindBy(id = "inter_minutes")
    public WebElement internationalMin;

    @FindBy(id = "sms_pack")
    public WebElement smsPack;

    @FindBy(id = "minutes_charges")
    public WebElement localMinCharges;

    @FindBy(id = "inter_charges")
    public WebElement internationalMinCharges;

    @FindBy(id = "sms_charges")
    public WebElement smsCharges;

    @FindBy(xpath = "//input[@value='submit']")
    public WebElement submitButton;



    public void verifyTariffPlanHeader(String str){
        Assert.assertEquals(str,TariffPlanHeader.getText());
    }

    public void setMonthlyRental(String monthlyrental) {
        staticWait(2);
        monthlyRental.sendKeys(monthlyrental);
    }

    public void setLocalMin(String localmin) {
        staticWait(2);
        localMin.sendKeys(localmin);
    }

    public void setInternationalMin(String internationalmin) {
        staticWait(2);
        internationalMin.sendKeys(internationalmin);
    }

    public void setSmsPack(String smspack) {
        staticWait(2);
        smsPack.sendKeys(smspack);
    }

    public void setLocalMinCharges(String localmincharges) {
        staticWait(2);
        localMinCharges.sendKeys(localmincharges);
    }

    public void setInternationalMinCharges(String internationalmincharges) {
        staticWait(2);
        internationalMinCharges.sendKeys(internationalmincharges);
    }

    public void setSmsCharges(String smscharges) {
        staticWait(2);
        smsCharges.sendKeys(smscharges);
    }

    public void setSubmitButton() {
        staticWait(2);
        submitButton.click();
    }
}
