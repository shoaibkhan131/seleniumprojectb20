package com.cybertek.tests.practice;

import com.cybertek.MyPracticeUtilities.MyWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPracticeTask {

    public static void main(String[] args) throws InterruptedException {


        //Practice: Cybertek Checkboxes
        //1. Go to http://practice.cybertekschool.com/checkboxes

        WebDriver driver = MyWebDriver.getWebDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        //Locating the first checkbox

        WebElement firstbox = driver.findElement(By.xpath("//form/input[1]"));
        //Locating the second checkbox
        WebElement secondbox = driver.findElement(By.xpath("//form/input[2]"));

        //2. Confirm checkbox #1 is NOT selected by default
if (!firstbox.isSelected()){
    System.out.println("1 checkbox not selected");
}

        //3. Confirm checkbox #2 is SELECTED by default.
        if (secondbox.isSelected()){
            System.out.println("2 checkbox selected");
        }

        //4. Click checkbox #1 to select it.
firstbox.click();
        //5. Click checkbox #2 to deselect it.
secondbox.click();

        //6. Confirm checkbox #1 is SELECTED.
        if (firstbox.isSelected()){
            System.out.println("1 checkbox selected");
        }

        //7. Confirm checkbox #2 is NOT selected.
        if (!secondbox.isSelected()){
            System.out.println("2 checkbox not selected");
        }

        //homeLink.click();
        driver.findElement(By.linkText("Home")).click();

        //Thread.sleep(1000);
Thread.sleep(2000);
        ///driver.navigate().back();

        driver.navigate().back();


    }
}
