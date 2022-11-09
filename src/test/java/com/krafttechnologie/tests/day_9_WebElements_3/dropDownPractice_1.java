package com.krafttechnologie.tests.day_9_WebElements_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

public class dropDownPractice_1 {

           /**1. go to http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
            2. DropDowns Menusunden SQL,TestNG ve CSS sec*/

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

        WebElement btnSQL=driver.findElement(By.cssSelector("#dropdowm-menu-1"));
        Select selectOptions=new Select(btnSQL);
        selectOptions.selectByValue("aql");


        Thread.sleep(3000);

        WebElement btnTestNg=driver.findElement(By.cssSelector("#dropdowm-menu-2"));
        Select selectOptions2=new Select(btnTestNg);
        selectOptions2.selectByIndex(2);

        WebElement btnCSS=driver.findElement(By.cssSelector("#dropdowm-menu-3"));
        Select selectOptions3=new Select(btnCSS);
        selectOptions3.selectByVisibleText("CSS");


    }
    }