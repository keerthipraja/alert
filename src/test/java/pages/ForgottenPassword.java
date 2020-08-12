package pages;

import driverBase.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgottenPassword extends Base {


    public ForgottenPassword(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//h4[@class='text-center']")
    private WebElement forgottenPWPageLabel;

    @FindBy(how = How.CSS, using = "#Email")
    private WebElement emailField;

    @FindBy(how = How.CSS, using = ".text-danger.validation-summary-errors")
    private WebElement validationMessage;

    @FindBy(how = How.CSS, using = ".btn")
    private WebElement resetPasswordButton;

    public void forgottenPasswordPageDisplayed() throws Exception {

        verifyElementDisplayed(forgottenPWPageLabel);
    }

    public void enterInvalidLEmail(String email) throws Exception {

        typeGivenValueInto(emailField, email);
    }

    public void clickResetPasswordButton() throws Exception {

        waitForElementToBeVisible(resetPasswordButton);
        clickAnElement(resetPasswordButton);
    }

    public void validationMessageDisplayed() throws Exception {

        verifyElementDisplayed(validationMessage);
    }






}
