package com.thetestingacademy.ex03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeelnium15 {

    @Test
    public void test_vwo_com() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // Driver Managing
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        // Locators
        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password and enter the 1234.
        // Step 3 - Find the Submit and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // <input Open Tag
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterEmailID"
        // id="login-username"
        // data-qa="hocewoqisi"
        // placeholder="Enter email ID"
        // l̥fdprocessedid="nhg1k">l̥
        // >Close Tag

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        // 2. Find the password inputbox and enter the password
        //<input
        // type="password" class="
        // text-input W(100%) Pend(36px)"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterPassword"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // placeholder="Enter password"
        // fdprocessedid="nx818v">
        WebElement password_inpur_box = driver.findElement(By.name("password"));
        password_inpur_box.sendKeys("wrongpassword@123");

        // 3. Find the submit button and click on it.
        // <button
        // type="submit"
        // id="js-login-btn"
       // class="btn btn--primary btn--inverted W(100%) Mb(24px) Mb(0):lc" onclick="login.login(event)"
       // data-qa="sibequkica"
      // fdprocessedid="ti96qd"> <span class="icon loader D(n)"
      // data-qa="zuyezasugu"></span> <span
      // data-qa="ezazsuguuy"
      // vwo-html-translate="login:signIn"
      // >Sign in</span> </button>

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        // Step 4 - Wait some time.
        Thread.sleep(5000);

        // Step 5 - Verify the message error message.
        // id="js-notification-box"
        // data-qa="tozemoxine">
        // <div class="notification-box-icon T(2px)"
        // data-qa="rukubazewo"
        // > <svg ng-attr-width="{{iconWidth}}"
        // ng-attr-height="{{iconHeight}}"
        // class="icon"
        // data-qa="beqidawixu"
        // id="js-notification-warning-icon"
        // <div class="notification-box-content"
        // data-qa="miqunuyohi">
        // <div class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">Your email, password, IP address or location did not match</div>
        // </div> </div>

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();

    }
}
