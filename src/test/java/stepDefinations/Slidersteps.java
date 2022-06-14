package stepDefinations;

import CucumberOptions.TestRunnerTest;
import Pages.HomePage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Slidersteps extends TestRunnerTest {

    HomePage home ;

    @Given("^User in home page and click on  \"([^\"]*)\"$")
    public void user_in_home_page_and_click_on_something(String slider) throws InterruptedException {
        driver = DriverFactory.getDriver();
        home = new HomePage(driver);
        home.SelectSlider(slider);

    }

    @Then("^user verify that \"([^\"]*)\" for Slider correct$")
    public void user_verify_that_something_for_slider_correct(String url) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase(url));
    }

}

