package stepdefinitions;

import base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    @Before
    public void start(){
        System.out.println("start");
        BasePage.initializeDriver();

    }

    @After
    public void tearDown(Scenario scenario){

        final byte[] screenshot=((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.BYTES);
        //if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        //}
        BasePage.driver.close();
    }

}
