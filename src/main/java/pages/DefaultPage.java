package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefaultPage extends BasePageSettings {
    public DefaultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ID_OF_ELEMENT")
    private WebElement logo;

    public void clickLogo(){
        this.click(logo);
    }


}
