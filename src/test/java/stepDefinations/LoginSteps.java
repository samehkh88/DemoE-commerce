package stepDefinations;

import CucumberOptions.TestRunnerTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class LoginSteps extends TestRunnerTest {

    HomePage homePage;
    LoginPage loginPageObj;
    RegisterPage registerPageObj;

    @Given("^the User in home page and navigate to login page$")
    public void the_user_in_home_page_and_navigate_to_login_page() {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        homePage.clickOnLogin();
    }

    @Given("^user enter valid Username and valid password and click login$")
    public void user_enter_valid_username_and_valid_password_and_click_login(DataTable data) {
        loginPageObj = new LoginPage(driver);
        List<List<String>> obj = data.asLists();
        loginPageObj.login(obj.get(0).get(0), obj.get(0).get(1));
    }

    @Then("^the system redirect to the home page and log out appear$")
    public void the_system_redirect_to_the_home_page_and_log_out_appear() throws Throwable {
        registerPageObj = new RegisterPage(driver);
        String logOut = registerPageObj.getLogoutBtn().getText();
        Assert.assertTrue(logOut.equals("Log out"));


    }


}
