package com.cybertek.tests.practice;

import com.cybertek.MyPracticeUtilities.MyWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElementsTask {

    public static void main(String[] args) {
       WebDriver driver = MyWebDriver.getWebDriver("chrome");
       driver.get("http://practice.cybertekschool.com/forgot_password");
        List<WebElement> listofLinks = driver.findElements(By.xpath("/html/body//a"));
        int Totallinks = 0;

        for (WebElement eachElement: listofLinks){
            System.out.println(eachElement.getText());

        }
        System.out.println(listofLinks.size());


    }
}
