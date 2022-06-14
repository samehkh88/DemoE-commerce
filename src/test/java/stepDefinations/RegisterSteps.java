package stepDefinations;


import CucumberOptions.TestRunnerTest;
import Pages.HomePage;
import Pages.RegisterPage;
import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class RegisterSteps extends TestRunnerTest {

    HomePage Home;
    RegisterPage RegisterPageobj;


    @Given("^the User in home page and naviagte to register page$")
    public void the_user_in_home_page_and_naviagte_to_register_page() {
        driver = DriverFactory.getDriver();
        Home = new HomePage(driver);
        Home.openRegisterPage();
    }

    @When("^user enter the required date \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" then click register$")
    public void user_enter_the_required_date_something_and_something_and_something_and_something_and_something_then_click_register(String gender, String firstname, String lastname, String email, String password) {
        RegisterPageobj = new RegisterPage(driver);
        RegisterPageobj.register(gender, firstname, lastname, email, password, password);

    }

    @Then("^the system show success message$")
    public void the_system_show_success_message() {
        String message = RegisterPageobj.Message.getText();
        String GreenColor = RegisterPageobj.Message.getCssValue("color");
        Assert.assertTrue(message.contains("Your registration completed"));
        Assert.assertEquals("rgba(76, 177, 124, 1)", GreenColor);
    }

    @And("^log out$")
    public void log_out() {
        RegisterPageobj = new RegisterPage(driver);
        RegisterPageobj.logOut();
    }

}
