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
        driver.get("https://www.krafttechexlab.com/javascript/clicks");

        List<WebElement> buttons=driver.findElements(By.xpath("//button[@class='btn btn-primary']"));

        System.out.println("buttons.size() = " + buttons.size());
        Assert.assertEquals(buttons.size(),4);

        for (WebElement btn:buttons){
            System.out.println("btn.getText() = " + btn.getText());
            System.out.println("btn.isDisplayed() = " + btn.isDisplayed());
        }





    }


}
