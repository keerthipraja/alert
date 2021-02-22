package pages;

import driverBase.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RewardsDetails extends Base {


    public RewardsDetails(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = ".btn")
    private WebElement buyNowButton;

    @FindBy(how = How.CSS, using = "#variableDenominationRange")
    private WebElement denominatorSlider;

    @FindBy(how = How.CSS, using = "#valueCurrency")
    private WebElement amountField;

    @FindBy(how = How.CSS, using = ".variableDenominationContainer")
    private WebElement currencyAmountField;

    @FindBy(how = How.CSS, using = ".row .col-12 >p")
    private WebElement clickedGiftOption;

    @FindBy(how = How.CSS, using = ".card .card-img-top")
    private WebElement selectedGiftOptionImage;

    @FindBy(how = How.CSS, using = "#StaticValues_RewardValues")
    private WebElement selectOptionFromDropdown;

    @FindBy(how = How.CSS, using = ".navbar")
    private WebElement navigationBar;

    @FindBy(how = How.CSS, using = ".navbar-brand")
    private WebElement toggleNavigationBar;

    @FindBy(how = How.CSS, using = ".text-success")
    private WebElement successAlertMessage;

    @FindBy(how = How.XPATH, using = "//img[@class='check']")
    private WebElement greenTickMark;

    @FindBy(how = How.CSS, using = ".col-12 >h4")
    private WebElement buyAmountConfirmed;

    @FindBy(how = How.CSS, using = ".text-highlight")
    private WebElement userEmailLabel;

    @FindBy(how = How.LINK_TEXT, using = "Back to Rewards")
    private WebElement backToRewardsButton;

    @FindBy(how = How.CSS, using = ".btn-group .btn")
    private List<WebElement> desc_terms_Instr_ListBar;

    @FindBy(how = How.CSS, using = "#instructions >h4")
    private WebElement instructionsText;

    @FindBy(how = How.CSS, using = "#description >h4")
    private WebElement descriptionText;

    @FindBy(how = How.CSS, using = "#termsandconditions >h4")
    private WebElement termsText;

    @FindBy(how = How.CSS, using = ".navbar #headerPts")
    private WebElement navBarPoints;

    @FindBy(how = How.XPATH, using = "//h6[@id ='currentBalance']")
    private WebElement pointsBalance;

    @FindBy(how = How.CSS, using = ".notifyjs-corner")
    private WebElement balanceInsufficient;

    @FindBy(how = How.CSS, using = "#headerPts")
    private WebElement pointsValue;


    public void buyNowButtonDisplayed() throws Exception {

        waitForElementToBeVisible(buyNowButton);
        verifyElementDisplayed(buyNowButton);
    }

    public void denominationSliderDisplayed() throws Exception {

        Thread.sleep(1000);
        verifyElementDisplayed(denominatorSlider);
    }

    public void moveSliderToRequiredAmount() throws Exception {

        waitForElementToBeVisible(denominatorSlider);
        denominatorSlider.sendKeys(Keys.ARROW_RIGHT);
        denominatorSlider.sendKeys(Keys.ARROW_LEFT);

    }

    public void moveSliderToMinimumAmount() throws Exception {

        waitForElementToBeVisible(currencyAmountField);
        String previousAmount = currencyAmountField.getText();
        waitForElementToBeVisible(denominatorSlider);
        denominatorSlider.sendKeys(Keys.ARROW_LEFT);
        String currentAmount = currencyAmountField.getText();
        verifySameValuesDisplayed(previousAmount,currentAmount);
    }

    public void minimumAmountSet() throws Exception {

        /*The sysout is just because currency comparison can only be done in requiredAmountSuccessfullyEntered() hence condensing */
        System.out.println("The minimum spendable amount of points is: " + currencyAmountField.getText());
    }

    public void pointsAdjustmentDisplayedDashBoardPage() throws Exception {

        String previousPointsValue = navBarPoints.getText();
        waitForElementToBeVisible(denominatorSlider);
        denominatorSlider.sendKeys(Keys.ARROW_RIGHT);
        actionsMoveToElement(buyNowButton);
        clickAnElement(buyNowButton);
        waitForElementToBeVisible(backToRewardsButton);
        clickAnElement(backToRewardsButton);
        String currentPointValue = pointsBalance.getText();
        System.out.println("Point balance before was " + previousPointsValue + " but now lower at " + currentPointValue);
        verifyDifferentValues(previousPointsValue, currentPointValue);
    }

    public void moveSliderToMaximumValue() throws Exception {

        waitForElementToBeVisible(denominatorSlider);
        actionDragElement(denominatorSlider, 470, 7);
        String currentAmount = currencyAmountField.getText();
        verifyValueEquals("500Points", currentAmount);
        //500Points is hard coded as this is maximum value slider goes to on Halfords Gift card
    }

    public void moveSliderToCoordinate() throws Exception {

        waitForElementToBeVisible(currencyAmountField);
        String previousAmount = currencyAmountField.getText();
        waitForElementToBeVisible(denominatorSlider);
        actionDragElement(denominatorSlider, 5, 10);
        String currentAmount = currencyAmountField.getText();
        verifyDifferentValues(previousAmount, currentAmount);
    }

    public void enterRequiredAmount() throws Exception {

//      As field value defaults to 1, I am sending *5* to assert value of 15Points in RewardsDetails page
        waitForElementToBeVisible(amountField);
        typeGivenValueInto(amountField, "5");
        waitForElementToBeClickable(currencyAmountField);
        clickAnElement(currencyAmountField);
    }

    public void requiredAmountSuccessfullyEntered() throws Exception {

        String currentAmount = currencyAmountField.getText();
        verifyValueEquals(currentAmount, "15 Points");
    }

    public void currencyAmountSet() throws Exception {

        /*The sysout is just because currency comparison can only be done in requiredAmountSuccessfullyEntered() hence condensing */
        System.out.println("The amount of points selected is: " + currencyAmountField.getText());
    }

    public void clickedGiftOptionNameDisplayed() throws Exception {

        waitForElementToBeVisible(clickedGiftOption);
        verifyElementDisplayed(clickedGiftOption);
    }

    public void clickedGiftOptionImageDisplayed() throws Exception {

        waitForElementToBeVisible(selectedGiftOptionImage);
        verifyElementDisplayed(selectedGiftOptionImage);
    }

    public void selectOptionArgosFromDropDown() throws Exception {

        waitForElementToBeVisible(selectOptionFromDropdown);
        selectByIndex(selectOptionFromDropdown, 1);
    }

    public void selectedValueDisplayed() throws Exception {

        waitForElementToBeVisible(selectOptionFromDropdown);
        String selectedGiftCardValueFromDropdown = selectOptionFromDropdown.getAttribute("value");
        verifySelectedIndexValue(selectedGiftCardValueFromDropdown, "10");
    }

    public void clickBuyNowButton() throws Exception {

        actionsMoveToElement(buyNowButton);
        clickAnElement(buyNowButton);
    }

    public void navigationBarDisplayed() throws Exception {

        waitForElementToBeVisible(navigationBar);
        verifyElementDisplayed(navigationBar);
    }

    public void clickNavigationBar() throws Exception {

        waitForElementToBeVisible(toggleNavigationBar);
        clickAnElement(toggleNavigationBar);
    }

    public void navigationBarContainsYourCurrentBalance() throws Exception {

        waitForElementToBeVisible(navigationBar);
        //Thread.sleep(1000);
        verifyTextContained(navigationBar, "Your current balance");
    }

    public void navigationBarContainsYourPointBalance() throws Exception {

        waitForElementToBeVisible(navigationBar);
        verifyTextContained(navigationBar, "pts");
    }

    public void successMessageDisplayed() throws Exception {

        waitForElementToBeVisible(successAlertMessage);
        verifyTextContained(successAlertMessage, "Success!");
    }

    public void greenTickDisplayed() throws Exception {

        waitForElementToBeVisible(greenTickMark);
        verifyElementDisplayed(greenTickMark);
    }

    public void clickBackToRewardsButton() throws Exception {

        waitForElementToBeVisible(buyAmountConfirmed);
        verifyElementDisplayed(buyAmountConfirmed);
        waitForElementToBeVisible(userEmailLabel);
        verifyElementDisplayed(userEmailLabel);
        waitForElementToBeVisible(backToRewardsButton);
        clickAnElement(backToRewardsButton);
    }

    public void clickInstructionsTab() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(desc_terms_Instr_ListBar));
        clickAnElement(desc_terms_Instr_ListBar.get(2));
    }


    public void instructionTextDisplayed() throws Exception {

       waitForElementToBeVisible(instructionsText);
        verifyTextContained(instructionsText, "Instructions");
    }

    public void clickDescriptionsTab() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(desc_terms_Instr_ListBar));
        clickAnElement(desc_terms_Instr_ListBar.get(0));
    }

    public void descriptionTextDisplayed() throws Exception {

        waitForElementToBeVisible(descriptionText);
        verifyTextContained(descriptionText, "Description");
    }

    public void clickTermsTab() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(desc_terms_Instr_ListBar));
        clickAnElement(desc_terms_Instr_ListBar.get(1));
    }

    public void termsTextDisplayed() throws Exception {

        waitForElementToBeVisible(termsText);
        verifyTextContained(termsText, "Terms and Conditions");
    }

    public void selectMaximumMandSValueFromDropDown() throws Exception {

        waitForElementToBeVisible(pointsValue);
        String points = pointsValue.getText();
        waitForElementToBeVisible(selectOptionFromDropdown);
        selectByIndex(selectOptionFromDropdown, 7);
        String selectedGiftCardValueFromDropdown = selectOptionFromDropdown.getAttribute("value");

        int availablePointValue = Integer.parseInt(points);
        int maximumGiftCardValueMandS = Integer.parseInt(selectedGiftCardValueFromDropdown);

        if (availablePointValue<maximumGiftCardValueMandS) {

            clickAnElement(buyNowButton);
        }
        else
        {
            System.out.println("EndUser points is more than Maximum dropdown value so skipping to optimize test env!");
        }
    }

    public void insufficientBalanceMessageDisplayed() throws Exception {

        waitForElementToBeVisible(balanceInsufficient);
        verifyTextContained(balanceInsufficient, "Not enough points to purchase gift");
    }


}
