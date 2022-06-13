package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(features = "@target/failed_scenarios.txt"
        , monochrome = true
        , glue = {"stepDefinations", "hooks"}
        , plugin = {"html:target/cucumber.html", "json:target/cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FailedTestRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver;
}
