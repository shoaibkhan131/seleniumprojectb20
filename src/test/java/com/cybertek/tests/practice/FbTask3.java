package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTask3 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com");


        String actualHeader =  driver.findElement(By.tagName("h2")).getText();

        String exepectedHeader = "Connect with friends and the world around you on Facebook.";

        System.out.println(actualHeader);
        System.out.println(exepectedHeader);

        if (actualHeader.equalsIgnoreCase(exepectedHeader)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        driver.close();

    }
}
