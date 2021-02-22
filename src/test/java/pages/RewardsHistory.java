package pages;

import driverBase.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RewardsHistory extends Base {


    public RewardsHistory(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#currentBalance.alternateColourFont.boldFont")
    private WebElement rewardsPointsColour;

    @FindBy(how = How.CSS, using = ".pb-3 .text-center")
    private WebElement rewardsHistoryPageLabel;

    @FindBy(how = How.CSS, using = "#history-list")
    private List<WebElement> historyList;

    @FindBy(how = How.CSS, using = "#loadHistory")
    private WebElement loadMoreButton;

    @FindBy(how = How.CSS, using = ".text-red")
    private WebElement ptsDeductions;


    public void rewardsHistoryPageDisplayed() throws Exception {

        //Thread.sleep(3000);
        verifyElementDisplayed(rewardsHistoryPageLabel);
    }

    public void clickLoadMoreButton() throws Exception {

        waitForElementToBeVisible(loadMoreButton);
        clickAnElement(loadMoreButton);
        waitForElementToBeVisible(loadMoreButton);
        clickAnElement(loadMoreButton);
        clickAnElement(loadMoreButton);
        waitForElementToBeVisible(loadMoreButton);
        clickAnElement(loadMoreButton);
        clickAnElement(loadMoreButton);
        waitForElementToBeVisible(loadMoreButton);
        clickAnElement(loadMoreButton);
        clickAnElement(loadMoreButton);
    }

    public void timeStampDisplayed() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);
      //  wait.until(ExpectedConditions.visibilityOfAllElements(historyList));

        for (WebElement val : historyList) {

            String text = val.getText();
            Assert.assertTrue("Error!! Something is wrong", text.contains("-"));
        }

    }

    public void giftClaimedDisplayed() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.visibilityOfAllElements(historyList));

        for (WebElement val : historyList) {

            String text = val.getText();
            Assert.assertTrue("Text value is not correct. Typo or check for change in html code", text.contains("-"));
        }

    }

    public void autoBankedPointsDisplayed() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.visibilityOfAllElements(historyList));

        for (WebElement val : historyList) {

            String text = val.getText();
            Assert.assertTrue("Error!! <Text> might be out of range", text.contains("Auto Banked Points"));
        }

    }

    public void pointsAdjustmentsDisplayed() throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.visibilityOf(ptsDeductions));
        verifyTextContained(ptsDeductions, "pts");
    }

}
