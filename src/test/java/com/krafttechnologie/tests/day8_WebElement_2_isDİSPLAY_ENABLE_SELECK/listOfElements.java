package com.krafttechnologie.tests.day8_WebElement_2_isDİSPLAY_ENABLE_SELECK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

import java.util.List;

public class listOfElements {

    /**
     findElements();
     Tek bir locator ile birden çok elementi locate edebilme.
     **Ortak attribute ve value sahip elementleri bir liste halinde locate etmemize yarar
     ArrayList<WebElement> elements = driver.findElements(By...)
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
    public void test() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/javascript/clicks");
        List<WebElement> buttons=driver.findElements(By.xpath("//button[@class='btn btn-primary']"));
        System.out.println("buttons.size() = " + buttons.size());
        Assert.assertEquals(buttons.size(),4);

        for(WebElement button:buttons){
            System.out.println("button.getText() = " + button.getText());
            System.out.println("button.isDisplayed() = " + button.isDisplayed());
        }

        Thread.sleep(3000);
        buttons.get(2).click();
    }
}
