package NopCommercePageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;

import static NopCommercePageObjectModel.LoadProp.props;
import static NopCommercePageObjectModel.Utils_BackUp.*;
import static NopCommercePageObjectModel.Utils_BackUp.clickOnElement;

public class CheckOutPage extends Utils {

    LoadProp prop = new LoadProp();

    private By _paymentMethodSelect = By.id("paymentmethod_1");
    private By _continue_3Button = By.xpath("//input[@onclick=\"PaymentMethod.save()\"]");
    private By _cardTypeSelect = By.className("dropdownlists");
    private By _cardNameField = By.id("CardholderName");
    private By _cardNumberField = By.id("CardNumber");
    private By _expiryMonthSelect = By.xpath("//*[@id=\"ExpireMonth\"]");
    private By _expiryYearSelect = By.id("ExpireYear");
    private By _CVVField = By.id("CardCode");
    private By _continue_4Button = By.xpath("//input[@onclick=\"PaymentInfo.save()\"]");
    private By _confirmButton = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input");




    public void shoppingCheckout() throws InterruptedException{

        selectByValue(By.id("BillingNewAddress_CountryId"),prop.getProperty("country"));

        enterText(By.id("BillingNewAddress_City"),prop.getProperty("city"));

        enterText(By.id("BillingNewAddress_Address1"),prop.getProperty("address1"));

        enterText(By.id("BillingNewAddress_ZipPostalCode"),prop.getProperty("postalcode"));

        enterText(By.id("BillingNewAddress_PhoneNumber"),prop.getProperty("phonenumber"));

        clickOnElement(By.id("billing-buttons-container"));

        Thread.sleep(2000);

        clickOnElement(By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]"));

    }
    public void selectionForPaymentMethod() throws InterruptedException{

        Thread.sleep(2000);
        clickOnElement(_paymentMethodSelect);
        waitAndClick(_continue_3Button,7);
    }

    public void paymentDetailEnter() throws InterruptedException{
        Thread.sleep(2000);
        selectByValue(_cardTypeSelect,prop.getProperty("card"));
        Thread.sleep(2000);
        enterText(_cardNameField,prop.getProperty("Cardname"));
        Thread.sleep(2000);
        enterText(_cardNumberField,prop.getProperty("CardNumber"));
        Thread.sleep(2000);
        selectByValue(_expiryMonthSelect,prop.getProperty("expiryMonth"));
        Thread.sleep(2000);
        selectByVisibleText(_expiryYearSelect, prop.getProperty("expiryYear"));
        Thread.sleep(2000);
        enterText(_CVVField,prop.getProperty("CVV"));
        waitAndClick(_continue_4Button,6);
        waitAndClick(_confirmButton,7);

    }











}
