package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase {

    @FindBy(id = "gender-male")
    WebElement Male;

    @FindBy(id = "gender-female")
    WebElement Female;

    @FindBy(id = "FirstName")
    WebElement firstName;

    @FindBy(id = "LastName")
    WebElement lastName;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordText;

    @FindBy(css = "div.result")
    WebElement RigsteredMessage;

    @FindBy(xpath = "//a[@class=\"ico-logout\"]")
    WebElement logout;

    @FindBy(id = "register-button")
    WebElement SubmitButton;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void register(String gender, String firstName, String lastName, String email, String password, String confirmPassword) {
        if (gender == "Male") {
            ClickButtons(Male);
        } else {
            ClickButtons(Female);
        }
        SendValue(this.firstName, firstName);
        SendValue(this.lastName, lastName);

        Select Day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        Day.selectByIndex(10);

        Select Month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        Month.selectByIndex(3);

        SendValue(emailField, email);
        SendValue(passwordField, password);
        SendValue(confirmPasswordText, confirmPassword);
        ClickButtons(SubmitButton);
    }

    public void logOut() {
        ClickButtons(logout);
    }

    public WebElement getRigsteredMsg() {
        return RigsteredMessage;
    }



    public WebElement getLogout() {
        return logout;
    }
}
