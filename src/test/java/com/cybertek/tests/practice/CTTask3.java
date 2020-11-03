package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CTTask3 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.findElement(By.name("email")).sendKeys("abcd@1234.com");
        driver.findElement(By.id("form_submit")).click();
        boolean verifyURl= driver.getCurrentUrl().contains("email_sent");
        if (verifyURl){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

        String actualTextBox = driver.findElement(By.name("confirmation_message")).getText();
        String expectedText = "Your e-mail's been sent!";

        if (actualTextBox.equalsIgnoreCase(expectedText)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }


    }
}
