package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        boolean expectedURL = driver.getCurrentUrl().contains("cybertekschool");

        if (expectedURL){
            System.out.println("URL test Passed");
        }else {
            System.out.println("URL test Failed!!!");
        }

        driver.close();

    }
}
