package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static driverBase.Base.driver;

import freemarker.log.CommonsLoggingLoggerFactory;
import pages.DashBoard;
import pages.Login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Login_StepDef {

    Properties prop = new Properties();
    FileInputStream ip;

    {
        try {
            ip = new FileInputStream("config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    Login login = new Login(driver);
    DashBoard dashBoard = new DashBoard(driver);


    @Given("^User navigates to Rewards Login page$")
    public void user_navigates_to_Rewards_Login_page() throws Throwable {

        login.navigateToLoginPage();
    }

    @When("^User enter valid \"([^\"]*)\" and \"([^\"]*)\" credentials$")
    public void userEnterValidAndCredentials(String username, String password) throws Throwable {

        login.enterValidLoginCredentials(prop.getProperty("username"), prop.getProperty("password"));
    }

    @When("^User clicks Login button$")
    public void user_clicks_Login_button() throws Throwable {

        login.clickLoginButton();
    }

    @Then("^Validation error Message displayed$")
    public void validation_error_Message_displayed() throws Throwable {

        login.validationMessageDisplayed();
    }

    @Then("^Rewards Dashboard page displayed$")
    public void rewards_Dashboard_page_displayed() throws Throwable {

        dashBoard.rewardsDashBoardPageDisplayed();
    }

    @When("^User enter invalid \"([^\"]*)\" and \"([^\"]*)\" credentials$")
    public void userEnterInvalidAndCredentials(String username, String password) throws Throwable {

        login.enterInvalidLoginCredentials(username, password);
    }

    @Then("^Rewards login page label displayed$")
    public void rewardsLoginPageLabelDisplayed()throws Throwable{

        login.rewardsLoginPageDisplayed();
    }
}
