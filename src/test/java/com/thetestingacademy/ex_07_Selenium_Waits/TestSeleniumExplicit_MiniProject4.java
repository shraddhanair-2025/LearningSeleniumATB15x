package com.thetestingacademy.ex_07_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSeleniumExplicit_MiniProject4 {

    @Description("Verify makemytrip opens with model")
    @Test
    public void testCloseModel() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        // //span[@data-cy='closeModel']
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModel']")));

        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy='closeModel']"));
        closeModel.click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}