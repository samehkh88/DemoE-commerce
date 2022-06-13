package stepDefinations;

import CucumberOptions.TestRunnerTest;
import Pages.CategoryListPage;
import Pages.HomePage;
import Pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SortByColorSteps extends TestRunnerTest {

    HomePage homePage;
    CategoryListPage CategoryListPageObj;
    SearchResultPage SearchResultPageObj;

    @Given("^user navigates to Apparel & shoes$")
    public void user_navigates_to_apparel_shoes() {
        homePage = new HomePage(driver);
        homePage.OpenSubcateogryShoes();
    }

    @When("^User selects the red shoes$")
    public void user_selects_the_red_shoes() {
        SearchResultPageObj = new SearchResultPage(driver);
        int BeforeSort = SearchResultPageObj.NumOfProducts.size();
        Assert.assertEquals(BeforeSort, 3);

        CategoryListPageObj = new CategoryListPage(driver);
        CategoryListPageObj.SortByRed();
    }

    @Then("^user could see one product only$")
    public void user_could_see_one_product_only() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
        int AfterSort = SearchResultPageObj.NumOfProducts.size();
        Assert.assertEquals(AfterSort, 1);

    }
}
