package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryListPage extends PageBase {

    @FindBy(id = "attribute-option-15")
    WebElement shoeColor;

    public CategoryListPage(WebDriver driver) {
        super(driver);
    }

    public void SortByRed() {
        ClickButtons(shoeColor);
    }
}
