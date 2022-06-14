package stepDefinations;

import CucumberOptions.TestRunnerTest;
import Pages.HomePage;
import Pages.WishlistPage;
import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WishListSteps extends TestRunnerTest {

    HomePage home;
    WishlistPage WishlistPageObj ;

    @Given("^User in homepage and add product to his wishlist$")
    public void user_in_homepage_and_add_product_to_his_wishlist() throws InterruptedException {
        driver = DriverFactory.getDriver();
        home = new HomePage(driver);
        home.clickAddToWishList();
    }

    @And("^the system show green success message$")
    public void the_system_show_green_success_message() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(home.WishListMessage));
        Assert.assertEquals(home.WishListMessage.getText(), "The product has been added to your wishlist");
        Assert.assertEquals(home.WishListMessageContainer.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
    }


    @When("^user go to his Wishlist$")
    public void user_go_to_his_wishlist() {
        home.CloseMessgae();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(home.WishlistLink));
        home.OpenWishListPage();
    }

    @Then("^The User find Product \"([^\"]*)\" in the Wishlist$")
    public void the_user_find_product_something_in_the_wishlist(String strArg1) {
        WishlistPageObj = new WishlistPage(driver);
        Assert.assertEquals(WishlistPageObj.ProductName.getText().equalsIgnoreCase(strArg1) , true);
        Assert.assertTrue(WishlistPageObj.Qty.getAttribute("value").equalsIgnoreCase("1"));

    }

}
