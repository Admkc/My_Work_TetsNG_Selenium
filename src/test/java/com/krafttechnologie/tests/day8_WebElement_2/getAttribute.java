package com.krafttechnologie.tests.day8_WebElement_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

public class getAttribute {

    // attribute value sunu getirir.
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
        driver.get("https://demoqa.com/radio-button");
        WebElement yesBtn=driver.findElement(By.cssSelector("#yesRadio"));

        System.out.println("yesBtn.getAttribute(\"type\") = " + yesBtn.getAttribute("type"));
        System.out.println("yesBtn.getAttribute(\"name\") = " + yesBtn.getAttribute("name"));
    }
}
