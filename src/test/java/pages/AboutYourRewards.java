package pages;

import driverBase.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class AboutYourRewards extends Base {

    public AboutYourRewards(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.XPATH, using = "//h4[contains(text(),'About rewards')]")
    private WebElement aboutYourRewardsPageLabel;

    @FindBy(how = How.CSS, using = ".about")
    private WebElement aboutPageText;


    public void pageLabelDisplayed() throws Exception {

        verifyElementDisplayed(aboutYourRewardsPageLabel);
    }

    public void versionNumberDisplayed() throws Exception {

        verifyTextContained(aboutPageText, "Version:");
    }

    public void copyrightComplianceDisplayed() throws Exception {

        verifyTextContained(aboutPageText, "Copyright © 2020 IMS");
    }
}
