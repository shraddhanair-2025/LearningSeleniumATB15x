package com.thetestingacademy.ex_07_Selenium_Waits;

import com.thetestingacademy.CommonToAll;
import com.thetestingacademy.WaitHelpers;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class TestSeleniumExplicit_MiniProject5 extends CommonToAll {

    @Description("Verify  makemytrip opens with modal")
    @Test
    public void testCloseModal(){

        WebDriver driver = new ChromeDriver();
        opnBrowser(driver,"https://www.makemytrip.com/");
        waitForVisibility(driver,3,"//span[@data-cy='closeModal");
        clickelwmentFound("//span[@data-cy='closeModal");

        //Static
        WaitHelpers.waitJVM(10000);
        closeBrowser(driver);
    }
}
