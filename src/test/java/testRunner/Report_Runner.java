package testRunner;

import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}
        ,plugin = {"com.cucumber.listener.ExtentCucumberFormatter",
        "pretty",
        "html:target/cucumber-htmlreport",
        "json:target/cucumber-report.json",}
        ,glue = {"steps"}

)

public class Report_Runner {

    @BeforeClass
    public static void setUp()
    {
        String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
        String timeNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());

        String fileName = String.format("./report/%s/report_%s.html", dateNow, timeNow);

        ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File(fileName));

        ExtentCucumberFormatter.loadConfig(new File("src/test/java/utilities/extent-config.xml"));
    }
}
