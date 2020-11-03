package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTask1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com");

        String actualTitle = driver.getTitle();
        String exepectedTitle = "Facebook - Log In or Sign Up";

        if (actualTitle.equalsIgnoreCase(exepectedTitle)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        driver.close();






    }
}
