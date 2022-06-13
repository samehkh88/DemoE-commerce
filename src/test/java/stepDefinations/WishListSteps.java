package stepDefinations;

import CucumberOptions.TestRunnerTest;
import Pages.HomePage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WishListSteps extends TestRunnerTest {

    HomePage home;

    @Given("^User in homepage and add product to his wishlist$")
    public void user_in_homepage_and_add_product_to_his_wishlist() {
        driver = DriverFactory.getDriver();
        home = new HomePage(driver);
        home.clickAddToWishList();
    }

    @Then("^the system show green success message$")
    public void the_system_show_green_success_message() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(home.addedToWishListMsg));
        Assert.assertEquals(home.addedToWishListMsg.getText(), "The product has been added to your wishlist");
        Assert.assertEquals(home.addedToWishListMsg.getCssValue("background-color"), "rgba(76, 177, 124, 1)");
    }


    @When("^user go to his Wishlist$")
    public void user_go_to_his_wishlist() {

    }

    @Then("^The User find his Product in the Wishlist$")
    public void the_user_find_his_product_in_the_wishlist() {

    }

}
