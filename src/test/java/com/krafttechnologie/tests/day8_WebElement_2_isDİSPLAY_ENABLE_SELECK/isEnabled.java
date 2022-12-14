package com.krafttechnologie.tests.day8_WebElement_2_isDİSPLAY_ENABLE_SELECK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

public class isEnabled {

    /**
     * elementin kullanıp kullanılmadıgı,etkin olup olmadıgı

     */

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){


        driver.close();
    }
    @Test
    public void test(){

        
        WebElement checkBox=driver.findElement(By.cssSelector("#gridCheck3"));

        System.out.println("checkBox.isEnabled() = " + checkBox.isEnabled());

        Assert.assertFalse(checkBox.isEnabled(),"Fail");

        WebElement checkbox2=driver.findElement(By.cssSelector("#gridCheck2"));


        System.out.println("checkbox2.isEnabled()"  +checkbox2.isEnabled());

        Assert.assertTrue(checkbox2.isEnabled(),"Fail");

    }
}
