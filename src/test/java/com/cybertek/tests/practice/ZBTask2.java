package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZBTask2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        String actualLinkText = driver.findElement(By.linkText("Zero Bank")).getText();
        String expectedLInkText = "Zero Bank";

        if (actualLinkText.equalsIgnoreCase(expectedLInkText)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }


        String actualhref = driver.findElement(By.linkText("Zero Bank")).getAttribute("href");
        String exepectedhref = "index.html";

        if (actualhref.contains(exepectedhref)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        driver.close();
    }
}
