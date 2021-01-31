package uk.nhs.nhsbsa.services.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.nhs.nhsbsa.services.basepage.BasePage;
import uk.nhs.nhsbsa.services.browserselector.BrowserSelector;
import uk.nhs.nhsbsa.services.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;


/**
 * Created by Vinay
 */
public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");

    String browser = loadProperty.getProperty("browser");

    @Before
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        Reporter.assignAuthor("Software", "Testing");
    }

    @After
    public void tearDown() {

        driver.quit();
    }
}


