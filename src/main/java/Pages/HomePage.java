package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.util.List;

public class HomePage extends PageBase {

    public Actions actions;

    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(id = "small-searchterms")
    WebElement searchTextField;

    @FindBy(css = ".button-1.search-box-button")
    WebElement searchButton;

    @FindBy(id = "customerCurrency")
    WebElement currencyList;

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

    @FindBy(className = "add-to-wishlist-button")
    List<WebElement> wishListBtn;

    @FindBy(xpath = "//p[@class='content']")
    public WebElement WishListMessage;

    @FindBy(xpath = ".//div[@class='bar-notification success']")
    public WebElement WishListMessageContainer;

    @FindBy(className = "ico-wishlist")
    public WebElement WishlistLink ;

    @FindBy(className = "close")
    public WebElement CloseX ;

    @FindBy(xpath = ".//div[@class='nivo-controlNav']/a[1]")
     WebElement SliderFirst;

    @FindBy(xpath = ".//div[@class='nivo-controlNav']/a[2]")
    WebElement SliderSecond;

    @FindBy(xpath = ".//div[@id='nivo-slider']/a[1]")
    WebElement SliderFirstImage;

    @FindBy(xpath = ".//div[@id='nivo-slider']/a[2]")
    WebElement SliderSecondImage;

    @FindBy(className = "ico-account")
    public WebElement myAccount;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    // open register page
    public void openRegisterPage() {
        ClickButtons(registerLink);
    }

    // open login page
    public void OpenLoginPage() {
        ClickButtons(loginLink);
    }


    // Fun to enter text in search field
    public void searchFun(String itemName) {
        ClickButtons(searchTextField);
        SendValue(searchTextField, itemName);
    }

    // search in home page top
    public void clickSearch() {
        ClickButtons(searchButton);
    }

    // Switch the Currency
    public void switchCurrency() {
        select = new Select(currencyList);
        select.selectByVisibleText("Euro");
    }

    // open cateogry computers and sub Software
    public void hoverComputerMenu() {
        actions = new Actions(driver);
        actions.moveToElement(computers).perform();
        actions.moveToElement(Software).perform();
        actions.click().build().perform();
    }

    // open cateogry apparel  and sub Shoes
    public void OpenSubcateogryShoes() {
        actions = new Actions(driver);
        actions.moveToElement(apparel).perform();
        actions.moveToElement(Shoes).perform();
        actions.click().build().perform();
    }

    // open Social links
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

    // add product to wishlist
    public void clickAddToWishList() throws InterruptedException {
        ClickButtons(wishListBtn.get(2));
        Thread.sleep(2000);
    }
    // close any message
    public void CloseMessgae()
    {
        ClickButtons(CloseX);
    }

    // open Wishlist page
    public void OpenWishListPage()
    {
        ClickButtons(WishlistLink);
    }

    // fun to select slider and open the slider
    public void SelectSlider(String valS) throws InterruptedException {
        if(valS.equalsIgnoreCase("first"))
        {
            ClickButtons(SliderFirst);
            ClickButtons(SliderFirstImage);
        } else if (valS.equalsIgnoreCase("second"))
        {
            ClickButtons(SliderSecond);
            Thread.sleep(1000);
            ClickButtons(SliderSecondImage);
        }
    }


}
