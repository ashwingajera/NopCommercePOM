package NopCommercePageObjectModel;

import org.openqa.selenium.By;

import javax.print.DocFlavor;

public class HomePage extends Utils {

    //Click on register button  on homepage web-element stored in string

    private By _ClickOnRegister = By.xpath("//a[@class='ico-register']");
    private By _clickOnMacBook = By.xpath("//div/a[@title=\"Show details for Apple MacBook Pro 13-inch\"]");
    private By _clickOnBookCategoryButtonOnHomepage = By.linkText("Books");




public void clickOnRegisterButtonOnHomePage(){

    // click on register button on homepage

     clickOnElement(_ClickOnRegister);
}

    public void clickOnProductForReferToFriend(){

        //click on Mac-book from homepage
        clickOnElement(_clickOnMacBook);
    }

    public void clickOnBookCategoryButtonOnHomepage (){

        //Go to book category
        clickOnElement(_clickOnBookCategoryButtonOnHomepage);



    }


}
