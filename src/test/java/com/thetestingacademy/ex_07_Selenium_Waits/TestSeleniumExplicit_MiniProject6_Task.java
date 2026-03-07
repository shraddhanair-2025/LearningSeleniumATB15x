package com.thetestingacademy.ex_07_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSeleniumExplicit_MiniProject6_Task {

    @Description("Verify that the create account Negative TC")
    @Test
    public void test_login_vwo() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement email_inputbox_wait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));
        email_inputbox_wait.sendKeys("admin@admin.com");

        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("wrongpass@123");

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        //wait
        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());



    }
}