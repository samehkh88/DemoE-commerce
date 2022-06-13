package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase {

    @FindBy(id = "gender-male")
    WebElement genderMale;
    @FindBy(id = "gender-female")
    WebElement genderFemale;
    @FindBy(id = "FirstName")
    WebElement firstNameText;
    @FindBy(id = "LastName")
    WebElement lastNameText;
    @FindBy(id = "Email")
    WebElement emailText;
    @FindBy(id = "Password")
    WebElement passwordText;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordText;
    @FindBy(id = "register-button")
    WebElement registerBtn;
    @FindBy(css = "div.result")
    WebElement rigsteredMsg;
    @FindBy(xpath = "//a[@class=\"ico-logout\"]")
    WebElement logoutBtn;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void register(String gender, String firstName, String lastName, String email,
                         String password, String confirmPassword) {
        if (gender == "Male") {
            ClickButtons(genderMale);
        } else {
            ClickButtons(genderFemale);
        }
        SendValue(firstNameText, firstName);
        SendValue(lastNameText, lastName);

        Select Day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        Day.selectByIndex(10);

        Select Month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        Month.selectByIndex(3);

        SendValue(emailText, email);
        SendValue(passwordText, password);
        SendValue(confirmPasswordText, confirmPassword);
        ClickButtons(registerBtn);
    }

    public void logOut() {
        ClickButtons(logoutBtn);
    }

    public WebElement getRigsteredMsg() {
        return rigsteredMsg;
    }

    public WebElement getLogoutBtn() {
        return logoutBtn;
    }
}
