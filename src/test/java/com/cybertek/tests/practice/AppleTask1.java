package com.cybertek.tests.practice;

import com.cybertek.MyPracticeUtilities.MyWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AppleTask1 {

    public static void main(String[] args) throws InterruptedException {


//    TC #02: FINDELEMENTS_APPLE
//    1.Open Chrome browser
    WebDriver driver = MyWebDriver.getWebDriver("chrome");
    driver.get("https://www.apple.com");

//    2.Go to https://www.apple.com
//    3.Click to iPhone
        Thread.sleep(2000);
        driver.findElement(By.linkText("iPhone")).click();
//    4.Print out the texts of all links
        List<WebElement> listofElements= driver.findElements(By.xpath("//body//a"));

//    5.Print out how many link is missing text
        int linkHasText = 0;
        int linkNoText = 0;
        int TotalLinks = listofElements.size();

        for (WebElement eachlink:listofElements) {
            System.out.println(eachlink.getText());
            if (eachlink.getText().isEmpty()){
                linkNoText+=1;
            }else {
                linkHasText+=1;
            }
        }

        System.out.println("TotalLinks = " + TotalLinks);
        System.out.println("linkHasText = " + linkHasText);
        System.out.println("linkNoText = " + linkNoText);
//    6.Print out how many link has text
//    7.Print out how many total link

driver.close();


}}
