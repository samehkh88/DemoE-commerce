package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
    WebElement loginButton;

    @FindBy(linkText = "Forgot password?")
    WebElement forgotPasswordButton;

    // use it direct in TC for verify
    @FindBy(xpath = ".//div[@class='message-error validation-summary-errors']")
    public WebElement errorMessage ;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginFun(String email, String password) {
        SendValue(emailField, email);
        SendValue(passwordField, password);
        ClickButtons(loginButton);
    }

    public void ForgotPasswordFun() {
        ClickButtons(forgotPasswordButton);
    }

}

