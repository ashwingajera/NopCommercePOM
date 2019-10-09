package NopCommercePageObjectModel;

import org.openqa.selenium.By;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;


public class UnRegisterUserReferAProductToFriendByEmailResultPage extends Utils{

   // SoftAssert softAssert = new SoftAssert();



    private By _waitForClickableToErrorMSGElement = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");
    private By _actualErrorMSGForReferAProductToFriendForNonUser = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");

    public void verifyUnRegisterUserSeeReferAProductErrorMassage(){



        waitForClikable(_waitForClickableToErrorMSGElement,30);

        //Test pass or fail (if fail why)
        assertTextMessage("Your message has been sent.",_actualErrorMSGForReferAProductToFriendForNonUser);



       // String expected_referAProductToFriendMSG = "Your message has been sent.";
       // String actual_referAProductToFriendMSG = getTextFromElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));


       // softassertTextMessage("Your message has been sent.",_actualErrorMSGForReferAProductToFriendForNonUser,"Only registered customers can use email a friend feature");
       // softAssert.assertEquals(_actualErrorMSGForReferAProductToFriendForNonUser,"Your message has been sent.","Only registered customers can use email a friend feature");

    }
}
