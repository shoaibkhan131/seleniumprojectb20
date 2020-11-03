package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.manage().window().maximize();

        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = driver.findElement(By.tagName("h3")).getText();


        if (actualHeader.equalsIgnoreCase(expectedHeader)){
            System.out.println("test Passed ");
        }else {
            System.out.println("test failed");
        }

        driver.close();
    }
}
