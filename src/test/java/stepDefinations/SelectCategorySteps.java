package stepDefinations;

import CucumberOptions.TestRunnerTest;
import Pages.HomePage;
import Pages.SearchResultPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SelectCategorySteps extends TestRunnerTest {

    HomePage homePage;
    SearchResultPage SearchResultPageObj;

    @When("^user can hover on computer category and selects sub category notebook$")
    public void user_can_hover_on_computer_category_and_selects_sub_category_notebook() {
        homePage = new HomePage(driver);
        homePage.hoverComputerMenu();
    }

    @Then("^the system show all sub category products$")
    public void the_system_show_all_sub_category_products() {
        SearchResultPageObj = new SearchResultPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(SearchResultPageObj.PageTitle));
        Assert.assertEquals(SearchResultPageObj.PageTitle.getText(), "Software");
    }

}



