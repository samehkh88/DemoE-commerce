package stepDefinations;

import CucumberOptions.TestRunnerTest;
import Pages.HomePage;
import Pages.SearchResultPage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchForProductSteps extends TestRunnerTest {

    HomePage homePage;
    SearchResultPage SearchResultPageObj;

    @Given("^user writes Product name \"([^\"]*)\"$")
    public void user_writes_product_name_something(String SerachText) {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        homePage.searchFun(SerachText);
    }

    @When("^user click on search button$")
    public void user_click_on_search_button() {
        homePage.clickSearch();
    }

    @Then("^the system show related product that include \"([^\"]*)\"$")
    public void the_system_show_related_product_that_include_something(String strArg1) throws InterruptedException {
        SearchResultPageObj = new SearchResultPage(driver);
        Thread.sleep(1000);
        SearchResultPageObj.checkProductName(strArg1);
    }

}
