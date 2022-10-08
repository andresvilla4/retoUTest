package steps;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.UtestPage;

public class UtestSteps {

    UtestPage utest = new UtestPage();

    @Given("^I enter on Utest page$")
    public void navigateToHopping(){
        utest.navigateToUtest();
    }

    @When("^I click on JOIN TODAY button$")
    public void clickUserButton(){
        utest.clickJoinButton();
    }

    @And("^I fill out the form$")
    public void clickRegisterButton(){
        utest.enterFirstName("Andres");
        utest.enterLastName("Villacob");
        utest.enterEmail("andresvillacob2@email.com");
        utest.setMonth();
        utest.setDay();
        utest.setYear();
        utest.clickNextLocationButton();
        utest.waitFunction();
        utest.clickNextDevicesButton();
        
        utest.setVersion("Ubuntu");
        utest.setLanguage("Spanish");
        utest.setBrand("Samsung");
        utest.waitFunction();
        utest.setModel("Galaxy A");
        utest.setOS("Android 7.1.1");
        utest.clickLastStepButton();
        
        utest.setPass("Password12345@");
        utest.confirmPass("Password12345@");
        utest.clickAcceptTerms();
        utest.clickAcceptPrivacy();
        utest.clickComplete();
    }

    @Then("^validate the results$")
    public void validateResults(){
        utest.closeBrowser();
    }
    
}
