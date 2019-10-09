package NopCommercePageObjectModel;

import org.junit.Test;
import org.openqa.selenium.By;

import static NopCommercePageObjectModel.Utils_BackUp.clickOnElement;

public class BookCategoryShoppingCartPage extends Utils {

    LoadProp props = new LoadProp();

    private By _clickOnBookCategoryElement = By.linkText("Books");
    private By _addSelectedBookToCart = By.xpath("//input[@type='button' and contains(@onclick, '38/1/1')]");
    private By _clickOnShoppingCartBar = By.xpath("//a[text()=\"shopping cart\"]");
    private By _termOfServicesBox = By.xpath("//input[@id=\"termsofservice\"]");
    private By _clickOnCheckOut = By.id("checkout");

    public void addSelectedProductToCart () throws InterruptedException{

        //Go to book category
        clickOnElement(_clickOnBookCategoryElement);

        //Add selected book to cart
        clickOnElement(_addSelectedBookToCart);
        //driver.findElement(By.xpath("//input[@type='button' and contains(@onclick, '38/1/1')]")).click();


        Thread.sleep(2000);

        //waitForClikable(By.className("\"ico-cart\""),30);

        //Click on shopping cart
        //clickOnElement(By.xpath("//span[@class=\"cart-label\"]"));
        clickOnElement(_clickOnShoppingCartBar);

       //click on term of services box
        clickOnElement(_termOfServicesBox);


        //click on checkout
        clickOnElement(_clickOnCheckOut);

    }


}
