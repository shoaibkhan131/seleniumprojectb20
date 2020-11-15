package com.cybertek.tests.practice;

import com.cybertek.MyPracticeUtilities.MyWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxTask2 {

    public static void main(String[] args) throws InterruptedException {

        //        TC	#3:	SeleniumEasyCheckboxVerification–Section2
//        1.Open	Chrome	browser
        WebDriver driver= MyWebDriver.getWebDriver("chrome");

//         2.Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
//        // 3.Verify	“Check	All”	button	text	is	“Check	All”
        WebElement checkButton = driver.findElement(By.id("check1"));
        String actualbuttonText = checkButton.getAttribute("value");
        String expectedText = "Check All";


//        // 4.Click	to	“Check	All”	button

        if (actualbuttonText.equals(expectedText)){
            System.out.println("Check All is same.. Passed!!!");
        }else {
            System.out.println("Failed!!!");
        }
//        // 5.Verify	all	check	boxes	are	checked

        checkButton.click();
        Thread.sleep(3000);
        List<WebElement> listofCheckBox = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        int boxnum = 1;

        for (WebElement eachbox: listofCheckBox ) {

            if (eachbox.isSelected()){
                System.out.println("Checkbox No: "+boxnum+" is selected");
                boxnum++;
            }else {
                System.out.println("Checkbox No: "+boxnum+" is not selected");
                boxnum++;
            }

        }
//        // 6.Verify	button	text	changed	to	“Uncheck All"
        checkButton.click();
        System.out.println("check Button is not selected : "+ (!checkButton.isSelected()));

        driver.close();
    }

}


