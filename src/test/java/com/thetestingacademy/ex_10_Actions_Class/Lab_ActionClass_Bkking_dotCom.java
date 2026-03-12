package com.thetestingacademy.ex_10_Actions_Class;

import com.thetestingacademy.CommonToAll;
import com.thetestingacademy.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;

public class Lab_ActionClass_Bkking_dotCom extends CommonToAll {

    @Test
    public void test_Booking_dot_Com() {
        WebDriver driver = new ChromeDriver();
        String URL = "https://www.booking.com/index.en-gb.html?label=en-in-booking-desktop-SoQWfYhAMBURf0HSQntj1AS652796016141%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-334108349%3Alp1007765%3Ali%3Adec%3Adm&gclid=CjwKCAjwpcTNBhA5EiwAdO1S9vhpJHzH_CDB0FrVDHxfsUukqHsrxF2KSfGn8aMLFPCxF8_Txcc9QhoCxGIQAvD_BwE&aid=2311236&ws=&gad_source=1&gad_campaignid=19655505510&gbraid=0AAAAAD_Ls1L7jd4nzKdafCUEvndGM4akB&chal_t=1773247535596&force_referer=https%3A%2F%2Fwww.google.com%2F";
        driver.get(URL);

        WaitHelpers.checkVisibility(driver,By.xpath("//button[@aria-label=\"Dismiss sign in information.\"]"),5);

        WebElement Gunius_Modal = driver.findElement(By.xpath("//button[@aria-label=\"Dismiss sign in information.\"]"));
        Gunius_Modal.click();

        WebElement Goto_Flight = driver.findElement(By.xpath("//a[@id=\"flights\"]"));
        Goto_Flight.click();

        WebElement destination = driver.findElement(By.xpath("//button[@data-ui-name='input_location_to_segment_0']"));
        destination.click();

        Actions actions = new Actions(driver);

        actions
                .moveToElement(destination).click()
                .sendKeys(destination,"BLR")
                .pause(Duration.ofSeconds(5))
                .keyDown(Keys.TAB).keyUp(Keys.TAB)
                .keyDown(Keys.ENTER).keyUp(Keys.ENTER)
                .build().perform();

        WebElement Search = driver.findElement(By.xpath("//button[@data-ui-name='button_search_submit']"));
        Search.click();

        closeBrowser(driver);


    }

}
