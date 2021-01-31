package uk.nhs.nhsbsa.services.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/***
 * Created by Vinay
 */


public class BasePage {

    public static WebDriver driver;

    public BasePage() {
        PageFactory.initElements(driver, this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java" +
                "/uk/nhs/nhsbsa/services/resources/propertyfile/log4j.properties");
    }

}
