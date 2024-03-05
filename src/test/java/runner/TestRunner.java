package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",//Directory for our .feature files)
        glue = "steps", //Steps Definitions Directory
        plugin = { "pretty", "html:target/cucumber-reports" },
        tags="@Navigation")

public class TestRunner {
        @AfterClass
        public static void cleanBrowser(){
                BasePage.closeBrowser();
        }        
}
