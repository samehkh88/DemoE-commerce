package CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(features = "src/test/java/features"
//,dryRun = true
        , monochrome = true
        , glue = {"stepDefinations", "hooks"},
        plugin = {"html:target/cucumber.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failed_scenarios.txt"})

public class TestRunnerTest extends AbstractTestNGCucumberTests {
    public static WebDriver driver;

}
	
   

