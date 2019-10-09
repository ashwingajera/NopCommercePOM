package NopCommercePageObjectModel;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Assert;


import static com.sun.deploy.cache.Cache.copyFile;

public class Utils extends BasePage {



//To enter text

    public  void enterText(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }
    //To get Text from the Element
    public static String getTextFromElement(By by)  {

        String text =  driver.findElement(by).getText();

        return text;

    }
    //To click an Element

    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //Wait for element to be clickable
    public  void waitForClikable(By by,long time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    //Wait for element to be visible
    public  void waitForElementVisible(By by,long time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));}

    //Wait for element to be alertpresent
    public  void waitForAlertPresent(long time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until((ExpectedConditions.alertIsPresent()));
    }

    public void clearTextFromInputBox (By by) {
        driver.findElement(by).clear();
    }

//To select by Visible Text

    public void selectByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }
    //To select by Value

    public void selectByValue(By by, String value) {

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
        select.getFirstSelectedOption();

    }

    //To select by Index

    public void selectByIndex (By by, int i) {

        //Select select = new Select(driver.findElement(by));
        //select.selectByIndex(index);

        WebElement mySelectElm = driver.findElement(by);
        Select mySelect= new Select(mySelectElm);
        mySelect.selectByIndex(i);
    }
    //To clear text and enter text
    public static void clearAndEnterText(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);}

    //Waiting for the element to be Invisible

    public  void waitForElementToBeInvisible(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));}

    // Wait method
    public  void sleep(final long millis) {
        System.out.println((String.format("sleeping %d ms", millis)));
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }


    }

    // For Time stamp
    public static String timeStamp() {
        DateFormat format = new SimpleDateFormat("ddMMyyHHmmSS");
        return format.format(new Date());
    }
    // Waiting for the Element to Load
    public static void waitForElementToLoad(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // Waiting for the Element to be displayed
    public static void waitForElementToBeDisplayed(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }

    // To wait and click
    public  void waitAndClick(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).click();
    }

    // To check Text present in DOM
    public  void textPresentInDom() {
        if (driver.getPageSource().contains("Text to check")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
    }

    public static String getTextFromTitle() {
        return driver.getTitle();
    }

    public static String getAttribute(By by, String text) {
        return driver.findElement(by).getAttribute(text);
    }

    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {

        //Convert webdriver object to take screenshot
        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

        //call getscreehshotas method to create image file
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new location
        File DestFile = new File(fileWithPath);

        //copy file at destination
        PolicyUtils.IO FileUtils;
        copyFile(srcFile, DestFile);

    }

    public static void takeScreenShotOfBrowser(PolicyUtils.IO FileUtils) {

        File scrFile5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {

            copyFile(scrFile5, new File("C:\\test.jpg"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String getCSSValue(By by, String text) {
        return driver.findElement(by).getCssValue(text);
    }

    public static void assertTextMessage (String expected, By by) {
        String actual = getTextFromElement(by);
        Assert.assertEquals(expected,actual);

    }

    public static String softassertTextMessage (String expected,By by, String text){
        String actual = getTextFromElement(by);
        return text;


    }

    public static void assertURL (String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    public static void assertCurrentURL (String url){
        Assert.assertTrue(driver.getCurrentUrl().equals(url));
    }





}
