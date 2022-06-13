package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends PageBase{

    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@class='qty-input']")
    public WebElement Qty ;

    @FindBy(xpath = "//td[@class='product']/a")
    public WebElement ProductName;
}
