package stepDefinations;

import CucumberOptions.TestRunnerTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ResetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ResetPasswordSteps extends TestRunnerTest {

    HomePage homePageObj;
    LoginPage loginPageObj;
    ResetPasswordPage ResetPasswordPageObj;

    @When("^User click on forgot password$")
    public void user_click_on_forgot_password() {
        loginPageObj = new LoginPage(driver);
        loginPageObj.ForgotPasswordFun();
    }

    @And("^user enters his email \"([^\"]*)\" to recover his password$")
    public void user_enters_his_email_something_to_recover_his_password(String Email) {
        ResetPasswordPageObj = new ResetPasswordPage(driver);
        ResetPasswordPageObj.ResetPassword(Email);

    }


    @Then("^The system show Success message that system will send mail to the user$")
    public void the_system_show_success_message_that_system_will_send_mail_to_the_user() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(ResetPasswordPageObj.ResetPasswordMessage));
        Assert.assertTrue(ResetPasswordPageObj.getResetPasswordMessage().getText().
                contains("Email with instructions has been sent to you"));
    }

}
