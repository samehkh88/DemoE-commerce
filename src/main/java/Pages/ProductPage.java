package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase {

    @FindBy(id = "add-to-cart-button-4")
    public WebElement AddToCartButton;

    // use it direct in TC for verify
    @FindBy(xpath = "//p[@class='content']")
    public WebElement SuccessMessage;

    @FindBy(className = "close")
    WebElement CloseMessage;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void AddProductToCart() {
        ClickButtons(AddToCartButton);
    }

    public void closeSuccessMessage() {
        ClickButtons(CloseMessage);
    }

}
