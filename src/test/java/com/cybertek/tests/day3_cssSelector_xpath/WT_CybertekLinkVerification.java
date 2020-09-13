package com.cybertek.tests.day3_cssSelector_xpath;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
TC #3: PracticeCybertek/ForgotPassword
URL verification1.Open Chrome browser2.
Go to http://practice.cybertekschool.com/forgot_password3.
Enter any email into input box4.Click on Retrieve password5.
Verify URL contains: Expected: “email_sent”
6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”
 */
public class WT_CybertekLinkVerification {
    public static void main(String[] args) {


//        WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//
WebDriver driver = WebDriverFactory.getdriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

       // driver.findElement(By.name("email")).sendKeys("anyemail@domain.com");


        WebElement emailInputBox = driver.findElement(By.name("email"));
        emailInputBox.sendKeys("anyemail@domain.com");


        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        retrievePasswordButton.click();

        String expectedURL = "email_sent";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification passed");
        }else{
            System.out.println("URL verification failed!!!");
        }


        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));

        String actualText = confirmationMessage.getText();

        String expextedText = "Your e-mail's been sent!";

        System.out.println("actualText = " + actualText);
        System.out.println("expextedText = " + expextedText);

        if (actualText.equals(expextedText)){
            System.out.println("Header Text value verification passed!");
        }else {
            System.out.println("Header Text value verification failed!!!");
        }


        if (confirmationMessage.isDisplayed()){
            System.out.println("confirmation message is displayed verification passed!");
        }else{
            System.out.println("confirmation message is not displayed , verification failed !!!");
        }

        driver.close();
    }
}
