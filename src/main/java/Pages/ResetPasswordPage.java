package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPasswordPage extends PageBase {

    @FindBy(xpath = "//p[@class=\"content\"]")
    public WebElement recoverMessage;
    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(xpath = "//button[@name=\"send-email\"]")
    WebElement recoverButton;

    public ResetPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void recoverPassword(String email) {
        SendValue(emailField, email);
        ClickButtons(recoverButton);

    }

    public WebElement getRecoverMessage() {
        return recoverMessage;
    }
}
