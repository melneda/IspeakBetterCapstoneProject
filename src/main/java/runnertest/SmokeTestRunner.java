package runnertest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(// This creates cucumber reports
        plugin = { "html:target/html-reports/smoketest-reports.html",
                "json:target/json-reports/smoketest.json",
                "junit:target/xml-report/smoketest.xml"},
        features="src/test/resources/features",
        glue="stepdefinitions",
        tags="@smoke"  ,
        dryRun= false
)
public class SmokeTestRunner {
}
