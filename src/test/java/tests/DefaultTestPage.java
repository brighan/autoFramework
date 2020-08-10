package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DefaultPage;
import settings.BaseTestSettings;

public class DefaultTestPage extends BaseTestSettings {

    private DefaultPage defaultPage;

    @BeforeTest
    private void setup(){
        defaultPage = new DefaultPage(this.driver);
    }

    @Test(priority = 1)
    public void testClickOverLogo(){
        defaultPage.clickLogo();
    }
}
