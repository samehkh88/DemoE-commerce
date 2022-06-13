package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    @FindBy(id = "Email")
    WebElement emailTxt;
    @FindBy(id = "Password")
    WebElement passwordTxt;
    @FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
    WebElement loginBtn;
    @FindBy(linkText = "Forgot password?")
    WebElement forgotPasswordBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        SendValue(emailTxt, email);
        SendValue(passwordTxt, password);
        ClickButtons(loginBtn);
    }

    public void clickForgotPassword() {
        ClickButtons(forgotPasswordBtn);
    }

}

