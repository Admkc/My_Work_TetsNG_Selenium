package com.krafttechnologie.tests.day8_WebElement_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

public class isSelectedRadioButton {

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
    public void test() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/forms/radio");

        WebElement radio1=driver.findElement(By.cssSelector("#gridRadios1"));
        WebElement radio2=driver.findElement(By.cssSelector("#gridRadios2"));

        System.out.println("radio1.isSelected() = " + radio1.isSelected());
        System.out.println("radio2.isSelected() = " + radio2.isSelected());

        radio2.click();

        Assert.assertFalse(radio1.isSelected(),"fail");
        Assert.assertTrue(radio2.isSelected(),"fail");


    }
    }