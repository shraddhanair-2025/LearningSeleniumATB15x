package com.thetestingacademy.ex03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_Katalon_Project {

    @Test
    public void test_Cura_Helthcare_Service(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement button_make_appointment = driver.findElement(By.id("btn-make-appointment"));
        button_make_appointment.click();

        WebElement email_input_box = driver.findElement(By.name("username"));
        email_input_box.sendKeys("John Doe");

        WebElement password_input_box = driver.findElement(By.id("txt-password"));
        password_input_box.sendKeys("ThisIsNotAPassword");

        WebElement button_login = driver.findElement(By.id("btn-login"));
        button_login.click();

        String a_tag_make_appointment = driver.findElement(By.tagName("h2")).getText();
        Assert.assertEquals(a_tag_make_appointment,"Make Appointment");

       Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        driver.quit();

    }
}
