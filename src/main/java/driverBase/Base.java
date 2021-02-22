package driverBase;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base {

    public static WebDriver driver;
    private static Select select;


    public static void typeGivenValueInto(WebElement element, String text) throws Exception {

        element.clear();
        element.sendKeys(text);
    }

    public static void clickAnElement(WebElement element) throws Exception {

        element.click();
    }

    public static void verifyElementDisplayed(WebElement element) throws Exception {


        Assert.assertTrue("Error! Element is not displayed!Check UI(HTML) for changes", element.isDisplayed());
    }

    public static void verifyTextNotDisplayed(WebElement element, String text) throws Exception {

        String textValue = element.getText();
        System.out.println(textValue);
        Assert.assertFalse("Error! Text is displayed, Typo or Check UI(HTML) for changes", textValue.contains(text));
    }

    public static void actionDragElement(WebElement element, int x, int y) throws Exception {

        Actions actions = new Actions(driver);
        actions.clickAndHold(element).moveByOffset(x, y).release().perform();
    }

    public static void actionsMoveToElement(WebElement element) throws Exception {

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public static void verifySelectedIndexValue(String element, String amount) throws Exception {

        Assert.assertEquals("Error! Typo or Check UI(HTML) dropdown to see if any changes", element, amount);
    }

    public static void verifyValueEquals(String element, String value) throws Exception {

        Assert.assertEquals("Error! Typo or Check UI(HTML) to see if any changes", element, value);
    }

    public static void clickUsingJSExecutor(WebElement element) throws Exception {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public static void waitForElementToBeVisible(WebElement element) throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementToBeClickable(WebElement element) throws Exception {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void verifyTextContained(WebElement element, String text) throws Exception {

        String textValue = element.getText();
        System.out.println(textValue);
        Assert.assertTrue("Error! Text value is not correct. Typo or check for change in html code", textValue.contains(text));
    }

    public static void selectByIndex(WebElement element, int index) throws Exception {

        select = new Select(element);
        select.selectByIndex(index);
    }

    public static void verifyDifferentValues(String str1, String str2) throws Exception {

        Assert.assertNotSame(str1, str2);
    }

    public static void verifySameValuesDisplayed(String x, String y) throws Exception {

        Assert.assertEquals("Check values on Details page or Typo in method",x,y);
    }


}
