package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_HeaderVerification {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = driver.findElement(By.tagName("h3")).getText();

        if (expectedHeader.equals(actualHeader)){
            System.out.println("Header verification passed");
        }else{
            System.out.println("Header Verification failed");
        }



        driver.close();
    }
}
