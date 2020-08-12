package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashBoard;
import pages.RewardsDetails;

import static driverBase.Base.driver;

public class RewardsDetails_StepDef {


    DashBoard dashBoard = new DashBoard(driver);
    RewardsDetails rewardsDetails = new RewardsDetails(driver);


    @Then("^Variable denomination slider is displayed$")
    public void variable_denomination_slider_is_displayed() throws Throwable {

        rewardsDetails.denominationSliderDisplayed();
    }

    @And("^User drags slider across to right using x and y coordinates$")
    public void userDragsSliderAcrossToRightUsingXAndYCoordinates() throws Throwable {

        rewardsDetails.moveSliderToCoordinate();
    }

    @Then("^Variable denomination amount and point is correctly selected$")
    public void variableDenominationAmountAndPointIsCorrectlySelected() throws Throwable {

        rewardsDetails.currencyAmountSet();
    }

    @Then("^GiftCard name is displayed on page$")
    public void giftcardNameIsDisplayedOnPage() throws Throwable {

        rewardsDetails.selectedGiftOptionNameDisplayed();
    }

    @Then("^Giftcard image displayed on Rewards details page$")
    public void giftcardImageDisplayedOnRewardsDetailsPage() throws Throwable {

        rewardsDetails.selectedGiftOptionImageDisplayed();
    }

    @Then("^Navigation bar is displayed on Reward Details page$")
    public void navigationBarIsDisplayedOnRewardDetailsPage() throws Throwable {

        rewardsDetails.navigationBarDisplayed();
    }

    @And("^User clicks Green Navigation bar$")
    public void userClicksGreenNavigationBar() throws Throwable {

        rewardsDetails.clickNavigationBar();
    }

    @Then("^Dashboard page is displayed$")
    public void dashboardPageIsDisplayed() throws Throwable {

        dashBoard.rewardsDashBoardPageDisplayed();
    }

    @Then("^Navigation bar contains Your current balance$")
    public void navigationBarContainsYourCurrentBalance() throws Throwable {

        rewardsDetails.navigationBarContainsYourCurrentBalance();
    }

    @Then("^Navigation bar contains points balance$")
    public void navigationBarContainsPointsBalance() throws Throwable {

        rewardsDetails.navigationBarContainsYourPointBalance();
    }

    @When("^User enters required Gift Card value in Amount field$")
    public void user_enters_required_Gift_Card_value_in_Amount_field() throws Throwable {

        rewardsDetails.enterRequiredAmount();
    }

    @Then("^Gift card value successfully entered$")
    public void gift_card_value_successfully_entered() throws Throwable {

        rewardsDetails.requiredAmountSuccessfullyEntered();
    }

    @When("^User clicks on Argos Gift option$")
    public void user_clicks_on_Argos_Gift_option() throws Throwable {

        dashBoard.clickArgosGiftCardOption();
    }

    @When("^User selects giftcard value from dropdown$")
    public void user_selects_giftcard_value_from_dropdown() throws Throwable {

        rewardsDetails.selectOptionArgosFromDropDown();
    }

    @And("^User moves slider to get required amount$")
    public void userMovesSliderToGetRequiredAmount() throws Throwable {

        rewardsDetails.moveSliderToRequiredAmount();
    }

    @Then("^Points are adjusted after completing purchase$")
    public void points_are_adjusted_after_completing_purchase() throws Throwable {

        rewardsDetails.pointsAdjustmentDisplayedDashBoardPage();
    }

    @When("^User moves slider to get minimum spend$")
    public void user_moves_slider_to_get_minimum_spend() throws Throwable {

        rewardsDetails.moveSliderToMinimumAmount();
    }

    @Then("^Slider shows minimum value as one pound$")
    public void slider_shows_minimum_value_as_one_pound() throws Throwable {

        rewardsDetails.minimumAmountSet();
    }

    @When("^User clicks Buy Now button$")
    public void user_clicks_Buy_Now_button() throws Throwable {

        rewardsDetails.clickBuyNowButton();
    }

    @Then("^Success Message is displayed on screen$")
    public void success_Message_is_displayed_on_screen() throws Throwable {

        rewardsDetails.successMessageDisplayed();
    }

    @And("^Green tick mark displayed along GiftCard image$")
    public void greenTickMarkDisplayedAlongGiftCardImage() throws Throwable{

        rewardsDetails.greenTickDisplayed();
    }

    @Then("^Selected index value is displayed in dropdown$")
    public void selectedIndexValueIsDisplayedInDropdown() throws Throwable{

        rewardsDetails.selectedValueDisplayed();
    }

    @When("^User clicks on Halfords Gift option$")
    public void user_clicks_on_Halfords_Gift_option() throws Throwable {

        dashBoard.clickHalfordsGiftCardOption();
    }

    @When("^User clicks Back to Rewards button$")
    public void user_clicks_Back_to_Rewards_button() throws Throwable {

        rewardsDetails.clickBackToRewardsButton();
    }

    @When("^User clicks on TK Maxx Gift Card option$")
    public void user_clicks_on_TK_Maxx_Gift_Card_option() throws Throwable {

        dashBoard.clickTkMAXXGiftOption();
    }

    @When("^User clicks Description tab on Rewards Details page$")
    public void user_clicks_Description_tab_on_Rewards_Details_page() throws Throwable {

        rewardsDetails.clickDescriptionsTab();
    }

    @Then("^Gift Card description text is displayed$")
    public void gift_Card_description_text_is_displayed() throws Throwable {

        rewardsDetails.descriptionTextDisplayed();
    }

    @And("^User clicks Instructions tab on Rewards Details page$")
    public void userClicksInstructionsTabOnRewardsDetailsPage() throws Throwable{

        rewardsDetails.clickInstructionsTab();
    }

    @Then("^Gift Card Instructions text is displayed$")
    public void giftCardInstructionsTextIsDisplayed() throws Throwable {

        rewardsDetails.instructionTextDisplayed();
    }

    @When("^User clicks Terms tab on Rewards Details page$")
    public void user_clicks_Terms_tab_on_Rewards_Details_page() throws Throwable {

        rewardsDetails.clickTermsTab();
    }

    @Then("^Gift Card Terms text is displayed$")
    public void gift_Card_Terms_text_is_displayed() throws Throwable {

        rewardsDetails.termsTextDisplayed();
    }


    @When("^User clicks on Google Play Gift Card option$")
    public void userClicksOnGooglePlayGiftCardOption() throws Throwable {

        dashBoard.clickGooglePlayGiftCardOption();
    }

    @When("^User clicks on Costa Gift option$")
    public void user_clicks_on_Costa_Gift_option() throws Throwable {

        dashBoard.clickCostaGiftCardOption();
    }


}
