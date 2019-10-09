package NopCommercePageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;

public class RegisterUserReferAProductToFriendByEmailResultPage extends Utils {


    private By _waitForElementOfSuccessMSGOfReferAProductToFriend = By.xpath("//*[@class=\"result\"]");
    private By _actualSuccessMSGForReferAProductToFriend = By.xpath("//*[@class=\"result\"]");


    public void verifyRegisterUserSeeReferAProductSuccessMassage(){

    //waitForElementOfSuccessMSGOfReferAProductToFriend

    waitForClikable(_waitForElementOfSuccessMSGOfReferAProductToFriend,20);


    //Test Pass or Fail


        assertTextMessage("Your message has been sent.",_actualSuccessMSGForReferAProductToFriend);


    }

}
