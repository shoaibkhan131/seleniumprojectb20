package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownTasks {


    WebDriver driver;
    @BeforeMethod

    public void setupMethod(){
        driver = WebDriverFactory.getdriver("chrome");


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");






    }

    @Test
    public void test2_verify_state_dropdown() throws  InterruptedException{


        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        //3. Select Illinois --> selecting by visible text
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia --> selecting by value
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");

        //5. Select California --> select by index
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);
        //6. Verify final selected option is California.
        String expectedResult = "California";
        String actualResult = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualResult, expectedResult, "Actual vs expected is not equal!");

        //Use all Select options. (visible text, value, index)
    }

    @Test

    public void test3_date_dropdown_verification(){


        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));



        yearDropdown.selectByVisibleText("1921");

        monthDropdown.selectByValue("11");

        dayDropdown.selectByIndex(0);


        String expectedYear = "1921";
        String expectedMonth = "December";
        String expectedDay = "1";



        String actulYear= yearDropdown.getFirstSelectedOption().getText();
        String actulMonth= monthDropdown.getFirstSelectedOption().getText();
        String actualDay= dayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actulYear,expectedYear,"Actual year VS expected year not equal");
        Assert.assertEquals(actulMonth,actulMonth,"Actual Month VS expected Month not equal");
        Assert.assertTrue(actualDay.equals(expectedDay),"actual day vs expected day not equal");
    }

    @Test
    public void test4_multiple_value_select_dropdown() throws InterruptedException{


        Select multipleSelectDropdown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        List<WebElement> allOptions=multipleSelectDropdown.getOptions();

        for (WebElement eachOption: allOptions)  {

            Thread.sleep(500);

            eachOption.click();
            System.out.println("selected"+ eachOption.getText());

            Assert.assertTrue(eachOption.isSelected(),"the option is not selected");
        }

        //5. Deselect all values.
        multipleSelectDropdown.deselectAll();

        for(WebElement eachOption : allOptions){
            //Assert.assertTrue(!eachOption.isSelected()); //it will be false boolean value, with ! we make it "true"

            // assertFalse method looks for "false" boolean value to pass the test.
            Assert.assertFalse(eachOption.isSelected());
        }
    }
}
