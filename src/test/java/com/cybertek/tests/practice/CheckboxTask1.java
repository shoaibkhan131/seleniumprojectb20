package com.cybertek.tests.practice;

import com.cybertek.MyPracticeUtilities.MyWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxTask1 {

    public static void main(String[] args) {
        // TC#2:	SeleniumEasy	CheckboxVerification–Section1
        // 1.Open	Chrome	browser

        WebDriver driver = MyWebDriver.getWebDriver("chrome");
        // 2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        // 3.Verify	“Success–Check	box	is	checked”	message	is	NOTdisplayed.
        WebElement successCheckBox = driver.findElement(By.id("isAgeSelected"));


        WebElement successMessage = driver.findElement(By.id("txtAge"));

        if (!successMessage.isDisplayed()){
            System.out.println("CheckBox not selected Verification Passed!!!");
        }else {
            System.out.println("CheckBox is selected Verification Failed!!!");
        }

//        try {
//            System.out.println("CheckBox is selected Verification Failed!!!");
//        }catch (NoSuchElementException e){
//            if (!successMessage.isDisplayed()){
//                System.out.println("CheckBox not selected Verification Passed!!!");
//            }
//        }

        // 4.Click	to	checkbox	under	“Single	Checkbox	Demo”	section

        successCheckBox.click();
        // 5.Verify	“Success	–Check	box	is	checked”	message	isdisplayed.
        if (successMessage.isDisplayed()){
            System.out.println("CheckBox is selected Verification Passed!!!");
        }else {
            System.out.println("CheckBox is not selected Verification Failed!!!");
        }











    }
}
