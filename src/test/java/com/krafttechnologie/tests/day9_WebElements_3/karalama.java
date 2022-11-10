package com.krafttechnologie.tests.day9_WebElements_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

public class karalama {

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
  //      driver.close();
    }

    @Test
    public void test() throws InterruptedException {


        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebElement uc=driver.findElement(By.cssSelector("input[value='option-3']"));
        uc.click();
        driver.findElement(By.cssSelector("input[value='option-1']")).click();

        driver.findElement(By.cssSelector("input[value='option-4']")).click();

        //**************************************************************************









}
    }
