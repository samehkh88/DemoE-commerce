package stepDefinations;

import CucumberOptions.TestRunnerTest;
import Pages.HomePage;
import Pages.SearchResultPage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchForProductSteps extends TestRunnerTest {

    HomePage homePage;
    SearchResultPage SearchResultPageObj;

    @Given("^user writes Product name \"([^\"]*)\"$")
    public void user_writes_product_name_something(String SerachText) {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        homePage.searchItem(SerachText);
    }

    @When("^user click on search button$")
    public void user_click_on_search_button() {
        homePage.clickSearchButton();
    }

    @Then("^the system show related product and the user can add it to the cart$")
    public void the_system_show_related_product_and_the_user_can_add_it_to_the_cart() {
        SearchResultPageObj = new SearchResultPage(driver);
        Assert.assertEquals(SearchResultPageObj.ProductName.getText(), "Apple MacBook Pro 13-inch");
    }

}
