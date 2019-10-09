package NopCommercePageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;

public class RegisterUserReferAProductToFriendByEmailPage extends Utils {

    LoadProp props = new LoadProp();



    private By _waitForEmailAFriendButtonElement = By.xpath("//div[@class='email-a-friend']");
    private By _clickOnEmailAFriendButton = By.xpath("//div[@class='email-a-friend']");
    private By _waitForEnterEmailFriendBoxElement = By.xpath("//input[@class='friend-email'] ");
    private By _enterFriendsEmail = By.xpath("//input[@class='friend-email'] ");
    private By _waitForPersonalMSGBoxElement = By.xpath(" //textarea[@placeholder='Enter personal message (optional).'] ");
    private By _enterPersonalMSG = By.xpath(" //textarea[@placeholder='Enter personal message (optional).'] ");
    private By _waitForSendEmailButtonElement = By.name("send-email");
    private By _clickSendEmail = By.name("send-email");


    public void clickOnEmailAFriendButtonElement (){

        // waitForEmailAFriendButtonElement
        waitForClikable(_waitForEmailAFriendButtonElement,30);


        //Email a friend
        clickOnElement(_clickOnEmailAFriendButton);

    }

    public  void registerUserEnterDetailsForReferAProductToFriendByEmail()  {



        //waitForEnterEmailFriendBoxElement
        waitForClikable(_waitForEnterEmailFriendBoxElement,20);


        //Enter Friends email
        enterText(_enterFriendsEmail, props.getProperty("friendemail"));

        //waitForPersonalMSGBoxElement
        waitForClikable(_waitForPersonalMSGBoxElement,20);



        //Personal Message
        enterText(_enterPersonalMSG, props.getProperty("personalmessage"));

        //waitForSendEmailButtonElement
        waitForClikable(_waitForSendEmailButtonElement,20);


        //Click send email
        clickOnElement(_clickSendEmail);





    }





}
