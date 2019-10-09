package NopCommercePageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils {

    private By _actualMSGForRegistrationSuccess = By.xpath("//div[@class=\"result\"]");

    public void verifyUserSeeRegistrationSuccessMassage(){


//Registration successful (Test Pass or Fail)

        assertTextMessage("Your registration completed", _actualMSGForRegistrationSuccess);



        //Click on Continue
        clickOnElement(By.name("register-continue"));

    }


}
