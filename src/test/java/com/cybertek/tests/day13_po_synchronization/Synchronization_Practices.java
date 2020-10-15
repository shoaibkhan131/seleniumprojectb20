package com.cybertek.tests.day13_po_synchronization;

import com.cybertek.pages.Loading7Page;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Synchronization_Practices {

    @Test
    public void p40_dynamic_title_test(){


        String url = "http://practice.cybertekschool.com/dynamic_loading";

        Driver.getDriver().get(url);

        Loading7Page loadiung7Page = new Loading7Page();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    }
}
