package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonP3Task {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;

        driver.get("https://www.amazon.com");
        WebElement searchBox=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.sendKeys("wooden Box", Keys.ENTER);
        driver.getCurrentUrl();
        String actualTitle = driver.getTitle().toLowerCase();
        String expectedTitle = "wooden box";
        System.out.println(actualTitle);

        if (actualTitle.contains(expectedTitle)) {

            System.out.println("pass");
        }else {
            System.out.println("fail");
        }



    }
}
