package com.krafttechnologie.tests.day8_WebElement_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

public class isSelected_Checkbox {

    //checkbbox kutusu seçili mi degil mi  hepsini secebilirsin



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
        driver.get("https://www.krafttechexlab.com/forms/checkbox");

        WebElement checkBox1=driver.findElement(By.cssSelector("#gridCheck1"));
        WebElement checkBox2=driver.findElement(By.cssSelector("#gridCheck1"));

        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());



        Thread.sleep(3000);
        checkBox1.click();

        Assert.assertFalse(checkBox1.isSelected(),"Fail");
        Assert.assertTrue(checkBox2.isSelected(),"Fail");

        checkBox1.click();


    }
}
