package stepDefinations;

import CucumberOptions.TestRunnerTest;
import Pages.HomePage;
import Pages.SearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ChangeCurrenciesSteps extends TestRunnerTest {

    HomePage homePage;
    SearchResultPage SearchResultPageObj;

    @When("^user selects Euro from currency dropdown list$")
    public void user_selects_euro_from_currency_dropdown_list() {
        SearchResultPageObj = new SearchResultPage(driver);
        Assert.assertTrue(SearchResultPageObj.euroIcon.getText().contains("$"));
        homePage = new HomePage(driver);
        homePage.switchCurrency();
    }

    @Then("^the system change the system currency$")
    public void the_system_change_the_system_currency() {
        Assert.assertTrue(SearchResultPageObj.euroIcon.getText().contains("€"));
    }

}


