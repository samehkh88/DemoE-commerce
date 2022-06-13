package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class MyHooks {

    private WebDriver driver;

    @Before
    public void before() {
        driver = DriverFactory.initiaLizeDriver("Chrome");
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterStep
    public void AddScreenshot(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            //screenshot
            File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
            scenario.attach(fileContent, "image/png", "image");

        }
    }

    @After
    public void after() {
        driver.quit();
    }
}

