package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class p4_PracticeCybertek_xpath {


    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("http://practice.cybertekschool.com");

        WebElement locate = driver.findElement(By.xpath("//a[@href='/multiple_buttons']"));   //copied xpath from copyxpath

        locate.click();

        WebElement button2= driver.findElement(By.xpath("//button[@name='button2']"));
button2.click();














    }
}
