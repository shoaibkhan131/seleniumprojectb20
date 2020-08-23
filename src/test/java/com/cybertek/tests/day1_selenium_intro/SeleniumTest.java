package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {


    public static void main(String[] args) throws InterruptedException {

            // setup the driver
        WebDriverManager.chromedriver().setup();



        // create instance of the driver
        WebDriver driver = new ChromeDriver();


        driver.manage().window().fullscreen();

        driver.manage().window().maximize();

        // use the driver instance to test selenium
        driver.get("https://www.cybertekschool.com");

        System.out.println("The title of the page is: "+ driver.getTitle());

        String actualTitle = driver.getTitle();

        System.out.println("Actual Title String: "+actualTitle);

        String actualURL = driver.getCurrentUrl();



        System.out.println("actualURL = " + actualURL);

Thread.sleep(1000);

driver.navigate().back();

Thread.sleep(1000);
driver.navigate().forward();

Thread.sleep(1000);
driver.navigate().refresh();

Thread.sleep(1000);
        driver.navigate().to("https://www.facebook.com");

        String pageSource=driver.getPageSource();

        System.out.println("page source = "+pageSource);



    }
}
