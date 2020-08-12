package pages;

import driverBase.Base;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Properties;

public class DashBoard extends Base {


    public DashBoard(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#currentBalance.alternateColourFont.boldFont")
    private WebElement rewardsPointsColour;

    @FindBy(how = How.LINK_TEXT, using = "View my rewards history")
    private WebElement rewardsHistoryLink;

    @FindBy(how = How.CSS, using = "#currentBalanceSection")
    private WebElement currentBalanceSection;

    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'Browse Gifts')]")
    private WebElement browserGiftLabel;

    @FindBy(how = How.CSS, using = "#rewardCards .col-6")
    private List<WebElement> listOfGiftOptions;

    @FindBy(how = How.CSS, using = "#currentBalanceSection .card-body >p")
    private WebElement dashBoardCardText;

    @FindBy(how = How.LINK_TEXT, using = "About your rewards")
    private WebElement aboutYourRewardsLink;

    @FindBy(how = How.XPATH, using = "//h6[@id ='currentBalance']")
    private WebElement pointsBalance;

    public void pointsColourDashboardPage() throws Exception {

        waitForElementToBeVisible(rewardsPointsColour);
        verifyElementDisplayed(rewardsPointsColour);
    }

    public void rewardsDashBoardPageDisplayed() throws Exception {

        verifyElementDisplayed(currentBalanceSection);
    }

    public void clickMyRewardsHistoryLink() throws Exception {

        clickUsingJSExecutor(rewardsHistoryLink);
    }

    public void browseGiftLabelDisplayed() throws Exception {

        verifyTextContained(browserGiftLabel, "Browse Gifts");
    }

    public void numberOfGiftOptions() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(listOfGiftOptions));
        Assert.assertEquals("Option count error!", listOfGiftOptions.size(), 40);
    }

    public void clickAmazonGiftOption() throws Exception{

        Thread.sleep(2000);
        listOfGiftOptions.get(0).click();
    }

    public void clickTkMAXXGiftOption() throws Exception{

       Thread.sleep(2000);
        listOfGiftOptions.get(6).click();
    }

    public void clickArgosGiftCardOption() throws Exception {

        Thread.sleep(2000);
        listOfGiftOptions.get(5).click();
    }

    public void clickHalfordsGiftCardOption() throws Exception {

        Thread.sleep(2000);
        listOfGiftOptions.get(4).click();
    }

    public void clickGooglePlayGiftCardOption() throws Exception {

        Thread.sleep(2000);
        listOfGiftOptions.get(7).click();
    }

    public void clickCostaGiftCardOption() throws Exception {

        Thread.sleep(2000);
        listOfGiftOptions.get(9).click();
    }

    public void clickAboutYourRewardsLink() throws Exception {

        waitForElementToBeVisible(aboutYourRewardsLink);
        clickUsingJSExecutor(aboutYourRewardsLink);
    }

    public void pointBalanceDisplayed() throws Exception {

        waitForElementToBeVisible(pointsBalance);
        verifyTextContained(pointsBalance,"pts");
    }

    public void egiftTextDisplayed() throws Exception {

        waitForElementToBeVisible(dashBoardCardText);
        verifyTextContained(dashBoardCardText, "You can spend this balance on a variety of eGifts from a wide range of retailers");
    }


}
