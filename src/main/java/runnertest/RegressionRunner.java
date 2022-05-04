package runnertest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(// This creates cucumber reports
        plugin = { "html:target/html-reports/regressiontest-reports.html",
                "json:target/json-reports/regressiontest.json",
                "junit:target/xml-report/regressiontest.xml"},
        features="src/test/resources/features",
        glue="stepdefinitions",
        tags="@all"  ,
        dryRun= false
)


public class RegressionRunner {



}
