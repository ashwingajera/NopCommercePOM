package NopCommercePageObjectModel;

import org.junit.Test;

public class TestSuit extends BaseTest{
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    RegisteredHomePage registeredHomePage = new RegisteredHomePage();
    RegisterUserReferAProductToFriendByEmailPage referAProductToFriendByEmailPage = new RegisterUserReferAProductToFriendByEmailPage();
    RegisterUserReferAProductToFriendByEmailResultPage referAProductToFriendByEmailResultPage = new RegisterUserReferAProductToFriendByEmailResultPage();
    UnRegisterUserReferAProductToFriendByEmailPage unregisterUserReferAProductToFriendByEmailPage = new UnRegisterUserReferAProductToFriendByEmailPage();
    UnRegisterUserReferAProductToFriendByEmailResultPage unRegisterUserReferAProductToFriendByEmailResultPage = new UnRegisterUserReferAProductToFriendByEmailResultPage();
    BookCategoryShoppingCartPage bookCategoryShoppingCartPage = new BookCategoryShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();



    @Test

    public void userShouldAbleToRegisterSuccessfully(){
        homePage.clickOnRegisterButtonOnHomePage();
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMassage();
    }


        @Test
        public  void registeredUserShouldBeAbleToReferAProductToFriendByEmail () {
        homePage.clickOnRegisterButtonOnHomePage();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMassage();
        registeredHomePage.clickOnProductForReferToFriend();
        referAProductToFriendByEmailPage.clickOnEmailAFriendButtonElement();
        referAProductToFriendByEmailPage.registerUserEnterDetailsForReferAProductToFriendByEmail();
        referAProductToFriendByEmailResultPage.verifyRegisterUserSeeReferAProductSuccessMassage();

    }

    @Test
    public void unRegisteredUserShouldNotAbleToReferAProductToFriendByEmail(){
        homePage.clickOnProductForReferToFriend();
        unregisterUserReferAProductToFriendByEmailPage.clickOnEmailAFriendButtonElement();
        unregisterUserReferAProductToFriendByEmailPage.unregisterUserEnterDetailsForReferAProductToFriendByEmail();
        unRegisterUserReferAProductToFriendByEmailResultPage.verifyUnRegisterUserSeeReferAProductErrorMassage();
    }



    @Test
    public void addSelectedProductToCart ()throws InterruptedException {
        homePage.clickOnRegisterButtonOnHomePage();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMassage();
        bookCategoryShoppingCartPage.addSelectedProductToCart();
        checkOutPage.shoppingCheckout();
        checkOutPage.selectionForPaymentMethod();
        checkOutPage.paymentDetailEnter();


    }







    }

