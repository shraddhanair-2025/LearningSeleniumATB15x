package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;


import java.net.CacheRequest;

public class TestSelenium09_Assertion_TestNG {

    @Test
    public void test_selenium_01(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        //TestNG
       // Assert.assertEquals(driver.getCurrentUrl(),"\"https://google.com\"");
        Assert.assertEquals(driver.getTitle(), "Google");

        //AssertJ
     assertThat(driver.getTitle())
             .isNotBlank()
             .isNotEmpty()
             .isNotNull()
             .isEqualTo("Google");


        driver.quit();

    }
}
