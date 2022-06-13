package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {


    public Actions actions;

    @FindBy(linkText = "Register")
    WebElement registrationLink;

    @FindBy(linkText = "Log in")
    WebElement loginBtn;

    @FindBy(id = "small-searchterms")
    WebElement searchTxt;

    @FindBy(css = ".button-1.search-box-button")
    WebElement searchBtn;

    @FindBy(id = "customerCurrency")
    WebElement currencyDropList;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]")
    WebElement computers;
    @FindBy(xpath = "//ul[@class='sublist first-level']/li[3]")
    WebElement Software;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]")
    WebElement apparel;
    @FindBy(linkText = "Shoes")
    WebElement Shoes;

    @FindBy(xpath = "//li[@class='facebook']/a")
    WebElement Facebook;

    @FindBy(xpath = "//li[@class='twitter']/a")
    WebElement Twitter;

    @FindBy(xpath = "//li[@class='rss']/a")
    WebElement RSS;

    @FindBy(xpath = "//li[@class='youtube']/a")
    WebElement Youtube;

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement macAppel;
    @FindBy(id = "add-to-wishlist-button-4")
    WebElement wishListBtn;
    @FindBy(xpath = "//p[@class=\"content\"]")
    WebElement addedToWishListMsg;
    @FindBy(id = "add-to-cart-button-4")
    WebElement addToCartBtn;
    @FindBy(xpath = "//p[@class=\"content\"]")
    WebElement addedToCartMsg;

    //@FindBy(css = "button.button-2.add-to-compare-list-button")
    //WebElement addToCompareListBtn;

    @FindBy(xpath = "//p[@class=\"content\"]")
    WebElement addedToCompareListMsg;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickRegistration() {
        registrationLink.click();
    }

    public void clickOnLogin() {
        loginBtn.click();
    }


    public void searchItem(String itemName) {
        ClickButtons(searchTxt);
        SendValue(searchTxt, itemName);
    }

    public void clickSearchButton() {
        ClickButtons(searchBtn);
    }

    public void switchCurrency() {
        select = new Select(currencyDropList);
        select.selectByVisibleText("Euro");
    }

    public void hoverComputerMenu() {
        actions = new Actions(driver);
        actions.moveToElement(computers).perform();
        actions.moveToElement(Software).perform();
        actions.click().build().perform();
    }

    public void OpenSubcateogryShoes() {
        actions = new Actions(driver);
        actions.moveToElement(apparel).perform();
        actions.moveToElement(Shoes).perform();
        actions.click().build().perform();
    }

    public void OpenSocialLinks(String val) {
        if (val.equalsIgnoreCase("Facebook")) {
            ClickButtons(Facebook);
        } else if (val.equalsIgnoreCase("Twitter")) {
            ClickButtons(Twitter);
        } else if (val.equalsIgnoreCase("RSS")) {
            ClickButtons(RSS);
        } else if (val.equalsIgnoreCase("Youtube")) {
            ClickButtons(Youtube);
        }
    }

    public void clickApparel() {
        apparel.click();
    }

    public void clickOnMacApple() {
        macAppel.click();

    }

    public void clickAddToWishList() {
        wishListBtn.click();
    }

    public void clickAddToCart() {
        addToCartBtn.click();
    }

    public void clickAddToCompareL() {
        // addToCompareListBtn.click();
    }


    public WebElement getAddedToWishListMsg() {
        return addedToWishListMsg;
    }

    public WebElement getAddedToCartMsg() {
        return addedToCartMsg;
    }

    public WebElement getAddedToCompareListMsg() {
        return addedToCompareListMsg;
    }
}
