package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Events {

       public WebDriverWait wait=new WebDriverWait(WBA.getDriver(), Duration.ofSeconds(20));

    //This method is designed for clicking on web elements, typically buttons, links,
    // or any clickable elements, in a Selenium-based automation or testing context.
    public void myClick(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    //This method is designed for interacting with web elements (e.g., input fields)
    // in a Selenium-based automation or testing context.

    public void mySendKeys(WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    //This method uses the JavaScriptExecutor in Selenium to scroll to a specific WebElement on a web page
    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)WBA.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    //This method is designed to verify if the text contained in a specified
    // web element matches the expected value, and if it does, it proceeds
    // to press the "ESC" key to close any open dialog or message boxes.
    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()), "No such text");
        //Press the ESC key to close any open dialog or message box
        new Actions(WBA.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }

   // This method is designed to wait for an element to become clickable before attempting to click it,
   // ensuring the element is fully loaded and ready for interaction
    public void myJsClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        JavascriptExecutor js=(JavascriptExecutor)WBA.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

}
