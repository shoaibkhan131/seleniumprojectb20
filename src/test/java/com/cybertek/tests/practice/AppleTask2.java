package com.cybertek.tests.practice;

import com.cybertek.MyPracticeUtilities.MyWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AppleTask2 {

    //    TC #03: FINDELEMENTS_APPLE
//    1.Open Chrome browser
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = MyWebDriver.getWebDriver("chrome");

//    2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
//            3.Click to all of the headers one by one
//            a.Mac, iPad, iPhone, Watch, TV, Music, Support
        Thread.sleep(2000);
        driver.findElement(By.linkText("Mac")).click();
        driver.getCurrentUrl();
        System.out.println("Title = " + driver.getTitle());
        List<WebElement> listofElements1= driver.findElements(By.xpath("//body//a"));
        int linkHasText1 = 0;
        int linkNoText1 = 0;
        int TotalLinks1 = listofElements1.size();

        for (WebElement eachlink:listofElements1) {
            System.out.println(eachlink.getText());
            if (eachlink.getText().isEmpty()){
                linkNoText1+=1;
            }else {
                linkHasText1+=1;
            }
        }

        System.out.println("TotalLinks = " + TotalLinks1);
        System.out.println("linkHasText = " + linkHasText1);
        System.out.println("linkNoText = " + linkNoText1);

        driver.findElement(By.linkText("iPad")).click();
        driver.getCurrentUrl();
        System.out.println("Title = " + driver.getTitle());
        List<WebElement> listofElements2= driver.findElements(By.xpath("//body//a"));
        int linkHasText2 = 0;
        int linkNoText2 = 0;
        int TotalLinks2 = listofElements2.size();

        for (WebElement eachlink:listofElements2) {
            System.out.println(eachlink.getText());
            if (eachlink.getText().isEmpty()){
                linkNoText2+=1;
            }else {
                linkHasText2+=1;
            }
        }

        System.out.println("TotalLinks = " + TotalLinks2);
        System.out.println("linkHasText = " + linkHasText2);
        System.out.println("linkNoText = " + linkNoText2);

        Thread.sleep(3000);
        driver.findElement(By.linkText("iPhone")).click();
        driver.getCurrentUrl();
        System.out.println("Title = " + driver.getTitle());
        List<WebElement> listofElements3= driver.findElements(By.xpath("//body//a"));
        int linkHasText3 = 0;
        int linkNoText3 = 0;
        int TotalLinks3 = listofElements3.size();

        for (WebElement eachlink:listofElements3) {
            System.out.println(eachlink.getText());
            if (eachlink.getText().isEmpty()){
                linkNoText3+=1;
            }else {
                linkHasText3+=1;
            }
        }

        System.out.println("TotalLinks = " + TotalLinks3);
        System.out.println("linkHasText = " + linkHasText3);
        System.out.println("linkNoText = " + linkNoText3);

        Thread.sleep(3000);
        driver.findElement(By.linkText("Watch")).click();
        driver.getCurrentUrl();
        System.out.println("Title = " + driver.getTitle());
        List<WebElement> listofElements4= driver.findElements(By.xpath("//body//a"));
        int linkHasText4 = 0;
        int linkNoText4= 0;
        int TotalLinks4 = listofElements4.size();

        for (WebElement eachlink:listofElements4) {
            System.out.println(eachlink.getText());
            if (eachlink.getText().isEmpty()){
                linkNoText4+=1;
            }else {
                linkHasText4+=1;
            }
        }

        System.out.println("TotalLinks = " + TotalLinks4);
        System.out.println("linkHasText = " + linkHasText4);
        System.out.println("linkNoText = " + linkNoText4);

        Thread.sleep(3000);
        driver.findElement(By.linkText("TV")).click();
        driver.getCurrentUrl();
        System.out.println("Title = " + driver.getTitle());
        List<WebElement> listofElements5= driver.findElements(By.xpath("//body//a"));
        int linkHasText5 = 0;
        int linkNoText5= 0;
        int TotalLinks5 = listofElements5.size();

        for (WebElement eachlink:listofElements5) {
            System.out.println(eachlink.getText());
            if (eachlink.getText().isEmpty()){
                linkNoText5+=1;
            }else {
                linkHasText5+=1;
            }
        }

        System.out.println("TotalLinks = " + TotalLinks5);
        System.out.println("linkHasText = " + linkHasText5);
        System.out.println("linkNoText = " + linkNoText5);

        Thread.sleep(3000);
        driver.findElement(By.linkText("Music")).click();
        driver.getCurrentUrl();
        System.out.println("Title = " + driver.getTitle());
        List<WebElement> listofElements6= driver.findElements(By.xpath("//body//a"));
        int linkHasText6 = 0;
        int linkNoText6 = 0;
        int TotalLinks6 = listofElements6.size();

        for (WebElement eachlink:listofElements6) {
            System.out.println(eachlink.getText());
            if (eachlink.getText().isEmpty()){
                linkNoText6+=1;
            }else {
                linkHasText6+=1;
            }
        }

        System.out.println("TotalLinks = " + TotalLinks6);
        System.out.println("linkHasText = " + linkHasText6);
        System.out.println("linkNoText = " + linkNoText6);

        Thread.sleep(3000);
        driver.findElement(By.linkText("Support")).click();
        driver.getCurrentUrl();
        System.out.println("Title = " + driver.getTitle());
        List<WebElement> listofElements7= driver.findElements(By.xpath("//body//a"));
        int linkHasText7 = 0;
        int linkNoText7 = 0;
        int TotalLinks7 = listofElements7.size();

        for (WebElement eachlink:listofElements7) {
            System.out.println(eachlink.getText());
            if (eachlink.getText().isEmpty()){
                linkNoText7+=1;
            }else {
                linkHasText7+=1;
            }
        }

        System.out.println("TotalLinks = " + TotalLinks7);
        System.out.println("linkHasText = " + linkHasText7);
        System.out.println("linkNoText = " + linkNoText7);
//    4.Printout how many links on each pagewiththe titles of the pages
//    5.Loop through all
//    6.Print out how many link is missing textTOTAL
//    7.Print out how many link has textTOTAL
//    8.Print out how many total linkTOTAL
    }
}