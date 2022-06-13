package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class SearchResultPage extends PageBase {

    @FindBy(xpath = "//h2[@class='product-title']")
    public WebElement ProductName;

    @FindBy(xpath = "//h2[@class='product-title']/a")
    List<WebElement> ProductNames;

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

    public void ClickAddToCart() {
        ClickButtons(addToCartBtn);
    }

    public void checkProductName(String CheckText)
    {
        for(int i = 0 ; i < ProductNames.size() ; i++)
        {
            String name = ProductNames.get(i).getText();
            Assert.assertTrue(name.contains(CheckText));
        }
    }


}
