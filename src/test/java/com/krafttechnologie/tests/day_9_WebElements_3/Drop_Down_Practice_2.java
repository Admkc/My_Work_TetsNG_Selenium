package com.krafttechnologie.tests.day_9_WebElements_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

public class Drop_Down_Practice_2 {

    /**
    1. go to http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
    2. Checkboxes kutusundan sadece option 1  ve 4 u sec*/

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
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement option3Btn=driver.findElement(By.xpath("//input[@value='option-3']"));
        option3Btn.click();

        WebElement option1Btn=driver.findElement(By.xpath("//input[@value='option-1']"));
        option1Btn.click();

        WebElement option4Btn= driver.findElement(By.cssSelector("input[value='option-4']"));
        option4Btn.click();






    }


}


