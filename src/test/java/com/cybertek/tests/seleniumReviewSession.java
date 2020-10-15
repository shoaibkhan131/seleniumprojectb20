package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class seleniumReviewSession {

    //id
    //name
    // class
    // tag name.
    // linked text\
    // partial linked text
    // CSS
    // Xpath

    @Test
    public void Amazon_seachItem_Test(){
        //step -1: Set-up the browser
        WebDriverManager.chromedriver().setup(); // Help to communicate between Java and windows installed browser
        WebDriver driver1 = new ChromeDriver(); // creating object and opening new chrome browser
        //step 2:
        String webUrl = "https://www.amazon.com";
        String searchIteam = "wooden Spoons";
        driver1.manage().window().maximize();
        driver1.get(webUrl);
        WebElement searchBar = driver1.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys(searchIteam);
        WebElement searchButn = driver1.findElement(By.id("nav-search-submit-text"));
        searchButn.click();
        //  //div[@class="sb_2vdjSJEF sb_34DsdQN_"]/div/div/div/span/span
        //  //div[@class="sb_2vdjSJEF sb_34DsdQN_"]//span/span
        //  //span[@class="sb_3XafbQtX sb_25yic0YU sb_CyFsQ0hU"]
        List<WebElement> resultsList = driver1.findElements(By.xpath("//span[@class=\"sb_3XafbQtX sb_25yic0YU sb_CyFsQ0hU\"]"));

        for( WebElement eachResut : resultsList){
            if(eachResut.getText().toLowerCase().contains(searchIteam.toLowerCase())){
                Assert.assertTrue(true);
            }else {
                Assert.assertTrue(false, "result name does not include-> " + searchIteam);
            }
        }
        driver1.quit();
    }
}
