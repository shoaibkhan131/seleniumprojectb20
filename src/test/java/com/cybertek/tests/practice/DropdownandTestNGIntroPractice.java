package com.cybertek.tests.practice;

import com.cybertek.MyPracticeUtilities.MyWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownandTestNGIntroPractice {

    //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
    //2. Go to http://practice.cybertekschool.com/dropdown
    //3. Verify “Simple dropdown” default selected value is correct
    //Expected: “Please select an option”
    //  WE MUST LOCATE THE DROPDOWN THEN PASS IT INTO SELECT CONSTRUCTOR
    //return type is web element
    //4. Verify “State selection” default selected value is correct
    //Expected: “Select a State”
WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= MyWebDriver.getWebDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void dropDownTesting() throws InterruptedException {
        WebElement simpledropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select selectoption = new Select(simpledropdown);
        String actualvaule= selectoption.getFirstSelectedOption().getText();
        String expectedOptionValue = "Please select an option";
        Assert.assertEquals(actualvaule,expectedOptionValue);
        Thread.sleep(1000);
        selectoption.selectByValue("2");

        WebElement stateSelect = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateSelectOption = new Select(stateSelect);
        String actualDefaultText = stateSelectOption.getFirstSelectedOption().getText();
        String ExpectedStateText = "Select a State";
        Assert.assertEquals(actualDefaultText,ExpectedStateText,"Select a state text is not matching");
    }

@Test
    public void selectStateTest() throws InterruptedException {
    //TC #2: Selecting state from State dropdown and verifyingresult
    // 1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Select Illinois
    // 4.Select Virginia
    // 5.Select California
    // 6.Verify final selected option is California.Use all Select options.(visible text, value, index)
    WebElement stateDropdownLocator = driver.findElement(By.xpath("//select[@id='state']"));
    Select stateDropdown = new Select(stateDropdownLocator);
    stateDropdown.selectByValue("IL");
    Thread.sleep(1000);
    stateDropdown.selectByVisibleText("Virginia");
    Thread.sleep(1000);
    stateDropdown.selectByIndex(5);
String actualoptionText = stateDropdown.getFirstSelectedOption().getText();
String expectedOptionText = "California";
Assert.assertEquals(actualoptionText,expectedOptionText);
}

@Test
    public void selectDateTest(){
    //TC #3: Selecting date on dropdown and verifying
    // 1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Select “December 1st, 1921” and verify it is selected.
    // Select year using: visible textSelect month using : value attributeSelect day using: index number

WebElement yearlocator = driver.findElement(By.xpath("//select[@id='year']"));
WebElement monthlocator = driver.findElement(By.xpath("//select[@id='month']"));
WebElement datelocator = driver.findElement(By.xpath("//select[@id='day']"));

Select yearSelector = new Select(yearlocator);
Select monthselector = new Select(monthlocator);
Select daySelector = new Select(datelocator);

 yearSelector.selectByVisibleText("1921");
monthselector.selectByValue("11");
daySelector.selectByIndex(0);

Assert.assertEquals(yearSelector.getFirstSelectedOption().getText(),"1921");
Assert.assertEquals(monthselector.getFirstSelectedOption().getText(),"December");
Assert.assertEquals(daySelector.getFirstSelectedOption().getText(),"1");
}

@Test
    public void selectMultipleDropdown() throws InterruptedException {

        WebElement multiplelocatior = driver.findElement(By.xpath("//select[@name='Languages']"));
        Select languageDropdown = new Select(multiplelocatior);

        List<WebElement> listOfLanguages = languageDropdown.getOptions();

    for (WebElement eachLanguage:listOfLanguages) {

        eachLanguage.click();
        Thread.sleep(1000);
        System.out.println(eachLanguage.getText() +" is selected : "  + eachLanguage.isSelected());
        Assert.assertTrue(eachLanguage.isSelected(), "option is not selected");

    }
    languageDropdown.deselectAll();

    for (WebElement eachLanguage:listOfLanguages) {
        Assert.assertFalse(eachLanguage.isSelected(), "Option is selected");
    }
}


@Test
    public void nonSelectDropdown(){
        WebElement nonSelectDropDown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        nonSelectDropDown.click();
        driver.findElement(By.linkText("Facebook")).click();
        driver.getCurrentUrl();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";

        Assert.assertEquals(actualTitle,expectedTitle, "Title doesnot Match");





}

}
