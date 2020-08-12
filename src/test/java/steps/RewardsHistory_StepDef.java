package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashBoard;
import pages.RewardsHistory;

import static driverBase.Base.driver;

public class RewardsHistory_StepDef {


    DashBoard dashBoard = new DashBoard(driver);
    RewardsHistory rewardsHistory = new RewardsHistory(driver);


    @When("^User clicks view my Rewards History link$")
    public void user_clicks_view_my_Rewards_History_link() throws Throwable {

        dashBoard.clickMyRewardsHistoryLink();
    }

    @Then("^Reward History page is displayed$")
    public void reward_History_page_is_displayed() throws Throwable {

        rewardsHistory.rewardsHistoryPageDisplayed();
    }

    @Then("^Rewards history page displays time stamp for Rewards activity$")
    public void rewardsHistoryPageDisplaysTimeStampForRewardsActivity() throws Throwable{

        rewardsHistory.timeStampDisplayed();
    }

    @Then("^Rewards history page displays Gift Claimed$")
    public void rewardsHistoryPageDisplaysGiftClaimed() throws Throwable {

        rewardsHistory.giftClaimedDisplayed();
    }

    @And("^User clicks Load More button$")
    public void userClicksLoadMoreButton() throws Throwable {

        rewardsHistory.clickLoadMoreButton();
    }

    @Then("^Rewards history page displays number of auto banked points$")
    public void rewards_history_page_displays_number_of_auto_banked_points() throws Throwable {

        rewardsHistory.autoBankedPointsDisplayed();
    }


    @Then("^Rewards history page displays points adjustments for Rewards activity$")
    public void rewardsHistoryPageDisplaysPointsAdjustmentsForRewardsActivity() throws Throwable {

        rewardsHistory.pointsAdjustmentsDisplayed();
    }

}
