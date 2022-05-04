package runnertest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(// This creates cucumber reports
        plugin = { "html:target/html-reports/paralleltest1.html",
                "json:target/json-reports/paralleltest1.json",
                "junit:target/xml-report/paralleltest1.xml"},
        features="src/test/resources/features",
        glue="stepdefinitions",
        tags="@parallel1"  ,
        dryRun= false
)
public class Parallel01Runner {


}
