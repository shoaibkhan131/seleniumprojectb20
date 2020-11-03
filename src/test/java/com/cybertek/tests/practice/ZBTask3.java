package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZBTask3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password", Keys.ENTER);
        driver.findElement(By.linkText("Account Activity")).click();
        driver.getCurrentUrl();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero - Account Activity";

        System.out.println(actualTitle);

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

        driver.navigate().back();
        driver.findElement(By.linkText("Transfer Funds")).click();
        driver.getCurrentUrl();

        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Zero - Transfer Funds";

        System.out.println(actualTitle1);

        if (actualTitle1.equalsIgnoreCase(expectedTitle1)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

        driver.navigate().back();

        driver.findElement(By.linkText("Pay Bills")).click();
        driver.getCurrentUrl();

        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Zero - Pay Bills";

        System.out.println(actualTitle2);

        if (actualTitle2.equalsIgnoreCase(expectedTitle2)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

        driver.navigate().back();
        driver.findElement(By.linkText("My Money Map")).click();
        driver.getCurrentUrl();

        String actualTitle3 = driver.getTitle();
        String expectedTitle3 = "Zero - My Money Map";

        System.out.println(actualTitle3);

        if (actualTitle3.equalsIgnoreCase(expectedTitle3)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        driver.navigate().back();
        driver.findElement(By.linkText("Online Statements")).click();
        driver.getCurrentUrl();

        String actualTitle4 = driver.getTitle();
        String expectedTitle4 = "Zero - Online Statements";

        System.out.println(actualTitle4);

        if (actualTitle4.equalsIgnoreCase(expectedTitle4)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

driver.close();
    }
}
