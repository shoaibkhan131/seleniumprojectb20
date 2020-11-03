package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTask4 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com");


        String actualValue =  driver.findElement(By.linkText("Create a Page")).getAttribute("href");

        String exepectedValue = "registration_form";

        System.out.println(actualValue);
        System.out.println(exepectedValue);

        if (actualValue.contains(exepectedValue)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
