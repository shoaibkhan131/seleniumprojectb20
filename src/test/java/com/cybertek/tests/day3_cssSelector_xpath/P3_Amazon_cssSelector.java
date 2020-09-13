package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_cssSelector {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("https://www.amazon.com");

        //WebElement searchBox = driver.findElement(By.cssSelector("[input id='twotabsearchtextbox']"));
        WebElement searchBox1 = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));


       // searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
        searchBox1.sendKeys("wooden spoon"+ Keys.ENTER);
    }
}
