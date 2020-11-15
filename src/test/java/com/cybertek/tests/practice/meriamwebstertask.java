package com.cybertek.tests.practice;

import com.cybertek.MyPracticeUtilities.MyWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class meriamwebstertask {

    //TC #2: FINDELEMENTS
    //1. Open Chrome browser
    public static void main(String[] args) {


    WebDriver driver = MyWebDriver.getWebDriver("chrome");
    driver.get("https://www.merriam-webster.com/");
        List<WebElement> listofElement = driver.findElements(By.xpath("//body//a"));

        for (WebElement eachElement: listofElement) {

            System.out.println(eachElement.getText());
        }

        int totalLinks = listofElement.size();

        int emptyLinks = 0;

        for (WebElement each:listofElement) {
            if (each.getText().isEmpty()){
                emptyLinks+=1;
            }
        }
         int linksWithText = totalLinks-emptyLinks;

        System.out.println("totalLinks = " + totalLinks);
        System.out.println("emptyLinks = " + emptyLinks);
        System.out.println("linksWithText = " + linksWithText);


        //2. Go to https://www.merriam-webster.com/
    //3. Print out the texts of all links
    //Locating all of the web elements on the page and storing in a list of WebElement
    //4. Print out how many link is missing text
    //5. Print out how many link has text
    //6. Print out how many total link

}}
