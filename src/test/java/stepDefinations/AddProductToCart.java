package stepDefinations;

import CucumberOptions.TestRunnerTest;
import Pages.ProductPage;
import Pages.SearchResultPage;
import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AddProductToCart extends TestRunnerTest {

    SearchResultPage SearchResultPageObj;
    ProductPage ProductPageObj;

    @When("^user click to add Product to cart$")
    public void user_click_to_add_product_to_cart() throws Throwable {
        driver = DriverFactory.getDriver();
        SearchResultPageObj = new SearchResultPage(driver);
        SearchResultPageObj.ClickAddToCart();
    }

    @Then("^user can add this item to the shopping cart and a confirmation message will be shown$")
    public void user_can_add_this_item_to_the_shopping_cart_and_a_confirmation_message_will_be_shown() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        ProductPageObj = new ProductPage(driver);
        wait.until(ExpectedConditions.visibilityOf(ProductPageObj.AddToCartButton));
        ProductPageObj.AddProductToCart();
        wait.until(ExpectedConditions.visibilityOf(ProductPageObj.SuccessMessage));
        Assert.assertTrue(ProductPageObj.SuccessMessage.getText().
                contains("The product has been added to your shopping cart"));
        ProductPageObj.closeSuccessMessage();

    }
}
