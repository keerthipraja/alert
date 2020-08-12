package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AboutYourRewards;
import pages.DashBoard;

import static driverBase.Base.driver;

public class AboutYourRewards_StepDef {


    DashBoard dashBoard = new DashBoard(driver);
    AboutYourRewards aboutYourRewards = new AboutYourRewards(driver);


    @When("^User clicks on About your rewards Hyperlink$")
    public void userClicksOnAboutYourRewardsHyperlink() throws Throwable {

        dashBoard.clickAboutYourRewardsLink();
    }


    @Then("^About your rewards page is displayed$")
    public void about_your_rewards_page_is_displayed() throws Throwable {

        aboutYourRewards.pageLabelDisplayed();
    }

    @Then("^Version Number of Rewards App is displayed$")
    public void versionNumberOfRewardsAppIsDisplayed() throws Throwable{

        aboutYourRewards.versionNumberDisplayed();
    }
}
