package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DefaultPage extends BasePageSettings {
    public DefaultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "ID_OF_ELEMENT")
    private WebElement logo;

    public void clickLogo(){
        this.click(logo);
    }


}
