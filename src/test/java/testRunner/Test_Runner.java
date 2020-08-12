package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = {"src/test/resources/features"},
        glue = {"steps"},
        plugin =
                {"pretty",
                        "html:target/cucumber-htmlreport",
                        "json:target/cucumber-report.json",
                }
)

public class Test_Runner {

}
