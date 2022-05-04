package runnertest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(// This creates cucumber reports
        plugin = { "html:target/html-reports/paralleltest2.html",
                "json:target/json-reports/paralleltest2.json",
                "junit:target/xml-report/paralleltest2.xml"},
        features="src/test/resources/features",
        glue="stepdefinitions",
        tags="@parallel2"  ,
        dryRun= false
)
public class Parallel02Runner {
}
