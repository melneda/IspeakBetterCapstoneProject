package stepdefinitions;

import base.BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.HelperMethods;

import static base.BasePage.driver;
import static base.BasePage.initializeDriver;


public class LoginSD  extends HelperMethods {

    WebDriver driver=initializeDriver();


    @When("User click log in")
    public void userClickLogIn() {
        driver.findElement(By.id("cmdSiginLink_off")).click();


    }

    @Then("user enter username and password")
    public void userEnterUsernameAndPassword() {
        driver.findElement(By.id("id_identification")).sendKeys("bernabaran@gmail.com");
        driver.findElement(By.id("id_password")).sendKeys("123456");

    }

    @Then("user log in")
    public void userLogIn() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Then("user enter wrong username and  wrong password")
    public void userEnterWrongUsernameAndWrongPassword() {
        driver.findElement(By.id("id_identification")).sendKeys("bernabaran@gmail.com");
        driver.findElement(By.id("id_password")).sendKeys("123456aa");

    }

    @Then("Verify page url")
    public void verifyPageUrl() {
        String url=  driver.getCurrentUrl();
        Assert.assertEquals(url,"https://isb.live-online-classes.com/en/home/");
       // BasePage.tearDown();

    }

    @Then("User get alert")
    public void userGetAlert() {
        isAlertPresent();
      //  BasePage.tearDown();

    }
}
