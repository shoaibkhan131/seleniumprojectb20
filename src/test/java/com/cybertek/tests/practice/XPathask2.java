package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathask2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        System.out.println("Page Loaded");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[.='Add Element']")).click();


        Thread.sleep(3000);

        if (driver.findElement(By.className("added-manually")).isDisplayed()){
            System.out.println("Delete button is displayed");
        }
        Thread.sleep(2000);
        WebElement deleteButton=   driver.findElement(By.className("added-manually"));
        deleteButton.click();
        System.out.println("delete button clicked");
        Thread.sleep(2000);



Thread.sleep(2000);

try {
    if (deleteButton.isDisplayed()){
        System.out.println("Delete Button is Displayed...Test Failed");
}}catch (StaleElementReferenceException e){

    System.out.println("Delete Button is not Displayed...Test Passed");
        }


driver.close();

    }
}
