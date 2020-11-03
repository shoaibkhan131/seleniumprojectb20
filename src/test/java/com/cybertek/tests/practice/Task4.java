package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    //TC #4: Google search
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Write “apple” in search box
    //4- Click google search button
    //5- Verify title:
    //Expected: Title should start with “apple” word


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Apple"+ Keys.ENTER);
//        driver.findElement(By.name("btnK")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Apple - Google Search";

        if (expectedTitle.equalsIgnoreCase(actualTitle)) {

            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        driver.close();




    }


}
