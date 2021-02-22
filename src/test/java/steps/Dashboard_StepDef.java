package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashBoard;
import pages.Login;
import pages.RewardsDetails;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static driverBase.Base.driver;

public class Dashboard_StepDef {

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
    RewardsDetails rewardsDetails = new RewardsDetails(driver);


    @Given("^User is logged in on Rewards DashBoard page$")
    public void user_is_logged_in_on_Rewards_DashBoard_page() throws Throwable {

        login.navigateToLoginPage();
        login.enterValidLoginCredentials(prop.getProperty("username"), prop.getProperty("password"));
        login.clickLoginButton();
    }


    @Then("^Points balance colour is bold black on page$")
    public void pointsBalanceColourIsBoldBlackOnPage() throws Throwable {

        dashBoard.pointsColourDashboardPage();
    }

    @Then("^Browse Gifts label is displayed$")
    public void browseGiftsLabelIsDisplayed() throws Throwable {

        dashBoard.browseGiftLabelDisplayed();
    }

    @Then("^number of gift options is forty$")
    public void numberOfGiftOptionsIsForty() throws Throwable {

        dashBoard.numberOfGiftOptions();
    }

    @When("^User clicks on Amazon Gift option$")
    public void userClicksOnAmazonGiftOption() throws Throwable {

        dashBoard.clickAmazonGiftOption();
    }

    @Then("^Buy Now button is displayed on Rewards Details$")
    public void buyNowButtonIsDisplayedOnRewardsDetails() throws Throwable {

        rewardsDetails.buyNowButtonDisplayed();
    }

    @Then("^Points balance is displayed$")
    public void pointsBalanceIsDisplayed() throws Throwable {

        dashBoard.pointBalanceDisplayed();
    }

    @Then("^Points balance does not contain Decimal$")
    public void points_balance_does_not_contain_Decimal() throws Throwable {

        dashBoard.decimalPointsNotDisplayed();
    }

    @Then("^eGift user guide text is displayed$")
    public void egiftUserGuideTextIsDisplayed() throws Throwable {

        dashBoard.egiftTextDisplayed();
    }
}
