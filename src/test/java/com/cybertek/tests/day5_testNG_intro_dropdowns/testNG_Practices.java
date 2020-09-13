package com.cybertek.tests.day5_testNG_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNG_Practices {

    WebDriver driver;


    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getdriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test

    public void google_Title_verification(){


        driver.get("https://www.google.com");

        String expectedTitle = "Google";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle,"titles are not matching");
    }



    @Test
    public void google_title_verification(){
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple"+ Keys.ENTER);

        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle), "Title does not contain search value.");

    }



    @AfterMethod
    public void tearDownMethod() throws InterruptedException{
        Thread.sleep(1000);
        driver.close();
    }

}

