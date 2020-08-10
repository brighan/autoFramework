package settings;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTestSettings {

    protected WebDriver driver;

    @BeforeSuite
    public void testSetup(){
        this.driver = new DriverSetup("CHROME").getDriver();
        this.driver.get("WEB_APP_URL");
    }
}
