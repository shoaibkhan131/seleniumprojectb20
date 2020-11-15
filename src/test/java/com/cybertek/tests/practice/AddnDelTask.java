package com.cybertek.tests.practice;

import com.cybertek.MyPracticeUtilities.MyWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddnDelTask {
    public static void main(String[] args) throws InterruptedException {

//
//        TC #3: PracticeCybertek.com_AddRemoveElements WebElement verification
//    1. Open Chrome browser
        WebDriver driver = MyWebDriver.getWebDriver("chrome");
        driver.manage().window().maximize();

//    2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
//        // 3. Click to “Add Element” button 50 times
        WebElement addbutton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        for (int i= 1 ; i<=50; i++){
         addbutton.click();
        }

        List<WebElement> listofDeleteButton = driver.findElements(By.xpath("//button[@class='added-manually']"));


//        // 4. Verify 50 “Delete” button is displayed after clicking.
        System.out.println("total no. of delete Button: "+listofDeleteButton.size());
        // 5. Click to ALL “Delete” buttons to delete them.


        for (int i = 0 ; i <=listofDeleteButton.size()-1;i++){
            listofDeleteButton.get(i).click();
            listofDeleteButton.remove(i);
        }
        System.out.println(listofDeleteButton.size());
//        for (WebElement eachbutton:listofDeleteButton) {
//            if (eachbutton.isDisplayed()){
//
//                eachbutton.click();
//
//            }else {
//                System.out.println("Delete Button is not Displayed... Test Passed!!!");
//            }





//        // 6. Verify “Delete” button is NOT displayed after clicking.
//        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

//        WebElement deletebutton = driver.findElement(By.xpath("//button[@class='added-manually']"));
//
//
//
//        try {
//            if (deletebutton.isDisplayed()){
//                System.out.println("delete button is displayed, verification failed");
//            }
//        }catch (NoSuchElementException e){
//            e.getMessage();
//            System.out.println("delete Button is not displayed, verification passed");
//
//        }
//        Thread.sleep(3000);

        if (listofDeleteButton.isEmpty()){
            System.out.println("delete button is displayed, verification failed");
        }else {
            System.out.println("delete Button is not displayed, verification passed");
        }

//        try {
//
//        }catch (Exception e){
//        }
driver.close();
        }
    }

