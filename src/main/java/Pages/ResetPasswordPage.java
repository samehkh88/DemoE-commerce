package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPasswordPage extends PageBase {

    @FindBy(xpath = "//p[@class=\"content\"]")
    public WebElement ResetPasswordMessage;
    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(xpath = "//button[@name=\"send-email\"]")
    WebElement resetButton;

    public ResetPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void ResetPassword(String email) {
        SendValue(emailField, email);
        ClickButtons(resetButton);

    }

    public WebElement getResetPasswordMessage() {
        return ResetPasswordMessage;
    }
}
