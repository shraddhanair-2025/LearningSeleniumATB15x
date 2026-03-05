package com.thetestingacademy.ex02_Selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

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
