package NopCommercePageObjectModel;

import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage{

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp props = new LoadProp();

    @Before
    public void setUpBrowser(){
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
        driver.manage().window().fullscreen();
        driver.get(props.getProperty("url"));
    }

//    @After
//    public void closeBrowser(){
//        driver.close();
//    }


}
