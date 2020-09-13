package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_ZeroBankVerification {

    public static void main(String[] args) {

        //TC #2: Zero Bank link text verification
        // 1.Open Chrome browser
        // 2.Go to http://zero.webappsecurity.com/login.html
        // 3.Verify link text from top left:Expected: “Zero Bank”
        // 4.Verify link hrefattribute value contains:Expected: “index.html”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement zeroBankLinkTopLeft = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLinkTopLeft.getText();

        if (actualLinkText.equals(expectedLinkText)){
            System.out.println("Link Text Verification Passed!");
        }else{
            System.out.println("Link Text Verficiation Failed !!!");
        }


        String expectedInHref = "index.html";
        String actualHrefValue = zeroBankLinkTopLeft.getAttribute("href");

        if (actualHrefValue.contains(expectedInHref)){
            System.out.println("Href value confirmation Passed!");
        }else{
            System.out.println("Href Value confirmation Failed!!!");
        }







    }
}
