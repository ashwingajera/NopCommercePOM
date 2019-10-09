package NopCommercePageObjectModel;

import org.openqa.selenium.By;

import java.util.Random;
import org.junit.Assert;

public class RegistrationPage extends Utils {


    LoadProp props = new LoadProp();

 //Storing all web-element for registration detail in string
    private By _firstName = By.xpath("//input[@id='FirstName']");
    private By _lastName = By.id("LastName");
    private  By _dateOfBirthDay = By.name("DateOfBirthDay");
    private  By _dateOfBirthMonth = By.name("DateOfBirthMonth");
    private By _dateOfBirthYear = By.name("DateOfBirthYear");
    private  By _email = By.xpath("//input[@id=\"Email\"] ");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private  By _confirmPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private  By _registerButton = By.id("register-button");


    //random email creation
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(100000);
    //    private static String timestamp = createTimestamp();

    public void verifyUserIsOnRegisterPage(){

        assertURL("register");
    }


    public void userEnterRegistrationDetails() {


        //First Name
        enterText(_firstName, props.getProperty("firstname"));


        //Last name
        enterText(_lastName, props.getProperty("lastname"));


        //Date of birth selection
        selectByVisibleText(_dateOfBirthDay, props.getProperty("day"));


        //Month drop box select
        selectByValue(_dateOfBirthMonth, props.getProperty("month"));


        //Birth year drop box select
        selectByIndex(_dateOfBirthYear, Integer.parseInt(props.getProperty("i")));


        //Email
        enterText(_email, "chabra" + randomInt + "@gmail.com");


        //Password Entry
        enterText(_password, props.getProperty("password"));


        //Confirm Password
        enterText(_confirmPassword, props.getProperty("confirmpassword"));

        //Click Register button which is on register page
        clickOnElement(_registerButton);
    }
}
