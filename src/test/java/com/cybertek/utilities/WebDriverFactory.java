package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverFactory {

    /* Task: New method creation
        Method name: get driver
        Static method
        Accepts String argument: browser type --> will determine what browser opens
        -> if chrome = chrome browser
        -> if firefox = firefox browser
        return type: WebDriver
         */


    public static WebDriver getdriver(String browserType) {

        String str = browserType;

        if (str.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (str.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if (str.equalsIgnoreCase("opera")) {
            WebDriverManager.operadriver().setup();
            return new OperaDriver();
        }else if (str.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }else if (str.equalsIgnoreCase("ie")){
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        }else {
            System.out.println("given browser doesnot exists");
            return null;
        }

    }
}
