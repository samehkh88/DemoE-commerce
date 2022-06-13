package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends PageBase {

    @FindBy(xpath = "//h2[@class='product-title']")
    public WebElement ProductName;

    @FindBy(className = "product-item")
    public List<WebElement> NumOfProducts;

    @FindBy(xpath = "//span[@class='price actual-price']")
    public WebElement euroIcon;

    @FindBy(xpath = "//button[@class='button-2 product-box-add-to-cart-button']")
    WebElement addToCartBtn;

    @FindBy(xpath = ".//*[@class='page-title']/h1")
    public WebElement PageTitle;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddToCartBtn() {
        return addToCartBtn;
    }

    public void ClickAddToCart() {
        ClickButtons(addToCartBtn);
    }


}
