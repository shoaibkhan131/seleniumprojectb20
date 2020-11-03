package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTask2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("skafridi@usa.com");
        driver.findElement(By.id("pass")).sendKeys("abcd1234");
        driver.findElement(By.name("login")).click();
        driver.getCurrentUrl();
        String actualTitle =  driver.getTitle();


        String exepectedTitle = "Log into Facebook | Facebook";

       System.out.println(actualTitle);
        System.out.println(exepectedTitle);

        if (actualTitle.equalsIgnoreCase(exepectedTitle)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        driver.close();

    }
}
