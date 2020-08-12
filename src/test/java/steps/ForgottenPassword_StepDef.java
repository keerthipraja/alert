package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ForgottenPassword;
import pages.Login;

import static driverBase.Base.driver;

public class ForgottenPassword_StepDef {


    Login login = new Login(driver);
    ForgottenPassword forgottenPW = new ForgottenPassword(driver);


    @When("^User clicks Forgotten Password link$")
    public void user_clicks_Forgotten_Password_link() throws Throwable {

        login.clickForgottenPasswordLink();
    }

    @Then("^Forgotten Password page is displayed$")
    public void forgotten_Password_page_is_displayed() throws Throwable {

        forgottenPW.forgottenPasswordPageDisplayed();
    }

    @When("^User enters invalid \"([^\"]*)\" in field$")
    public void user_enters_invalid_in_field(String email) throws Throwable {

     forgottenPW.enterInvalidLEmail(email);
    }

    @When("^User clicks Reset Password button$")
    public void user_clicks_Reset_Password_button() throws Throwable {

        forgottenPW.clickResetPasswordButton();
    }

    @Then("^Validation error message displayed$")
    public void validation_error_message_displayed() throws Throwable {

        forgottenPW.validationMessageDisplayed();
    }
}
