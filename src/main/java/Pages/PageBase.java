package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

    static protected Select select;
    protected WebDriver driver;
    
    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void ClickButtons(WebElement button) {
        button.click();
    }

    protected void SendValue(WebElement field, String value) {
        field.sendKeys(value);
    }


}
