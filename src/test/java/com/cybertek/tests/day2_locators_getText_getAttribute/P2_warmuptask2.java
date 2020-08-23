package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_warmuptask2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");


        String expectedInWeb = "cybertekschool";
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains(expectedInWeb)){
            System.out.println("URL verification is passed");
        }else {
            System.out.println("URL verfication failed");
        }


        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title verification is Passed");
        }else{
            System.out.println("Title verification failed");
        }
    }
}
