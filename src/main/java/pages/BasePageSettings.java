package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;

public class BasePageSettings {

    protected WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;
    private static final int TIMEOUT = 5;

    public BasePageSettings(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, TIMEOUT);
        actions = new Actions(this.driver);
    }

    //Custom Wait for elements
    public void waitForWebElement(WebElement element){
       wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Custom WebDriver Methods - Wrappers

    public void click(WebElement element){
        this.waitForWebElement(element);
        element.click();
    }

    public void enterText(WebElement element, String text){
        this.waitForWebElement(element);
        element.sendKeys(text);
    }

}
