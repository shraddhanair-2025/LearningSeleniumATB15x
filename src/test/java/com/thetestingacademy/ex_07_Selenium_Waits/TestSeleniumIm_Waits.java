package com.thetestingacademy.ex_07_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSeleniumIm_Waits {

    @Description("Verify Ebay Print the prices (iMac)")
    @Test
    public void test_verify_print_imac_price(){

        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://app.vwo.com");

        WebElement emailInput = driver.findElement(By.id("login-username"));
        emailInput.sendKeys("admin@admin.com");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("password@321");

        WebElement buttonSubmmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmmit.click();
    }
}

