package com.krafttechnologie.tests.day8_WebElement_2;

import com.github.dockerjava.api.model.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

import java.util.List;

public class karalama {

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

        System.out.println("yesBtn.getAttribute(\"class\") = " + yesBtn.getAttribute("class"));

        System.out.println("yesBtn.getAttribute(\"for\") = " + yesBtn.getAttribute("for"));


    }
}
