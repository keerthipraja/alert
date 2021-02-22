package pages;

import driverBase.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Login extends Base {

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

    public Login(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#username")
    private WebElement userNameField;

    @FindBy(how = How.CSS, using = "#password")
    private WebElement passwordField;

    @FindBy(how = How.CSS, using = ".btn")
    private WebElement loginButton;

    @FindBy(how = How.CSS, using = ".text-danger.validation-summary-errors")
    private WebElement validationMessage;

    @FindBy(how = How.CSS, using = "#currentBalanceSection")
    private WebElement currentBalanceSection;

    @FindBy(how = How.XPATH, using = "//h4[@class='text-center']")
    private WebElement loginPageLabel;

    @FindBy(how = How.LINK_TEXT, using = "Forgotten Password?")
    private WebElement forgottenPWLink;


    public void navigateToLoginPage() throws Exception{

        driver.manage().deleteAllCookies();
        driver.navigate().to(prop.getProperty("base_url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    public void enterValidLoginCredentials(String username, String password) throws Exception {

        typeGivenValueInto(userNameField, username);
        typeGivenValueInto(passwordField, password);
    }

    public void enterInvalidLoginCredentials(String username, String password) throws Exception {

        typeGivenValueInto(userNameField, username);
        typeGivenValueInto(passwordField, password);
    }

    public void clickLoginButton() throws Exception {

        waitForElementToBeVisible(loginButton);
        clickAnElement(loginButton);
    }

    public void validationMessageDisplayed() throws Exception {

        verifyElementDisplayed(validationMessage);
    }

    public void rewardsLoginPageDisplayed() throws Exception {

        verifyElementDisplayed(loginPageLabel);
    }

    public void clickForgottenPasswordLink() throws Exception {

        clickAnElement(forgottenPWLink);
    }


}


