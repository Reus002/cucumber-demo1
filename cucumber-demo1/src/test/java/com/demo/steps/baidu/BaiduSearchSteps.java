package com.demo.steps.baidu;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by youyong.li on 6/28/2018.
 */
public class BaiduSearchSteps {

    private WebDriver driver;

    @Before
    public void openBrowser(){
//        System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver.exe");
//        driver = new FirefoxDriver();
//        System.setProperty("webdriver.ie.driver", driverPath + "IEDriverServer.exe");
//        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//        capabilities.setCapability("ignoreProtectedModeSettings", true);
//        driver = new InternetExplorerDriver(capabilities);
        System.setProperty("webdriver.chrome.driver",  "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Open Browser...");
    }

    @After
    public void closeBrowser(Scenario scenario){
        try {
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");

        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        driver.quit();
        System.out.println("Close Browser...");
    }

    @Given("^go to baidu home$")
    public void goToBaiduHome() throws Throwable {
        driver.get("https://www.baidu.com");
    }

    @And("^search \"([^\"]*)\"$")
    public void search(String arg0) throws Throwable {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='kw']")).sendKeys(arg0);
    }

    @And("^click the search button$")
    public void clickTheSearchButton() throws Throwable {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='su']")).click();
    }

    @Then("^the url contains \"([^\"]*)\"$")
    public void theUrlContains(String arg0) throws Throwable {
        Thread.sleep(4000);
        String url = driver.getCurrentUrl();
        System.out.println("current url is: " + url);
        Assert.assertTrue(url.contains(arg0));


        driver.findElement(By.id("kw")).sendKeys();
        driver.findElement(By.name("wd")).sendKeys();
        driver.findElement(By.xpath("//*[@id='kw']")).sendKeys();
    }
}
