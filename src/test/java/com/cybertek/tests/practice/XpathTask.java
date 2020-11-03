package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;

        driver.get("http://practice.cybertekschool.com/forgot_password");
        boolean homeButtton = driver.findElement(By.xpath("//a[.='Home']")).isDisplayed();
        System.out.println(" header displayed = "+  homeButtton);


        boolean header = driver.findElement(By.xpath("//h2[.='Forgot Password']")).isDisplayed();
        System.out.println(" header displayed = "+  header);

        boolean headeremail = driver.findElement(By.xpath("//label[.='E-mail']")).isDisplayed();
        System.out.println(" header displayed = "+  headeremail);

        boolean inpuBox = driver.findElement(By.xpath("//*[@name='email']")).isDisplayed();
        System.out.println(" header displayed = "+  inpuBox);

        boolean retrievePasswordButton = driver.findElement(By.xpath("//*[@id='form_submit']")).isDisplayed();
        System.out.println(" header displayed = "+  retrievePasswordButton);



        boolean poweredByDiv = driver.findElement(By.xpath("//div[@style='text-align: center;']")).isDisplayed();
        System.out.println(" header displayed = "+  poweredByDiv);








//        if ()) {
//
//            System.out.println("pass");
//        }else {
//            System.out.println("fail");
//        }


    }
}
