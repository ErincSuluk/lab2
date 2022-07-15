package stepDefinitions;

import Pages.GuruSuccessful;
import Pages.GuruTariffPlan;
import Pages.GuruTelecomPage;
import Utilities.BrowserUtils;
import Utilities.ConfigurationsReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class steps extends BrowserUtils {
    GuruTelecomPage guruTelecomPage=new GuruTelecomPage();
    GuruTariffPlan guruTariffPlan=new GuruTariffPlan();
    GuruSuccessful guruSuccessful=new GuruSuccessful();
    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
       Driver.getDriver().get(ConfigurationsReader.getProperties("url"));
       BrowserUtils.setWaitTime();

    }
    @When("The user wants to add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
        guruTelecomPage.setAddTariffPlan();

    }
    @Then("The user wants to verify {string} header")
    public void the_user_wants_to_verify_header(String string) {
        guruTariffPlan.verifyTariffPlanHeader(string);

    }
    @Then("The user wants to Add Tarif Plan details as")
    public void the_user_wants_to_add_tarif_plan_details_as(Map<String,String> dataTable) {
        guruTariffPlan.setMonthlyRental(dataTable.get("Monthly Rental"));
        guruTariffPlan.setLocalMin(dataTable.get("Free Local Minutes"));
        guruTariffPlan.setInternationalMin(dataTable.get("Free International Minutes"));
        guruTariffPlan.setSmsPack(dataTable.get("Free SMS Pack"));
        guruTariffPlan.setLocalMinCharges(dataTable.get("Local Per Minutes Charges"));
        guruTariffPlan.setInternationalMinCharges(dataTable.get("International Per Minutes Charges"));
        guruTariffPlan.setSmsCharges(dataTable.get("SMS Per Charges"));

    }
    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        guruTariffPlan.setSubmitButton();

    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        guruSuccessful.setSuccessfulMessage(string);

    }

}
