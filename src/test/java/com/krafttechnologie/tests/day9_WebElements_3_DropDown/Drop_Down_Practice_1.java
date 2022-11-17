package com.krafttechnologie.tests.day9_WebElements_3_DropDown;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

public class Drop_Down_Practice_1 {

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
    public void jsAlerts() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(1000);

        //e.g.:1 click - Click For JS Alert Button
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        // switch to JS alert pop up
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);
        //click OK
        alert.accept();


        //e.g:2 click - Click For JS Confirm
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(2000);
        //click CANCEL
        alert.dismiss();

        //e.g.:1 click - Click for JS Prompt
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        //send keys to JS Prompt
        alert.sendKeys("KraftTech Batch 2 was here");
        Thread.sleep(4000);
        System.out.println("alert.getText() = " + alert.getText());
        alert.accept();

        //Task : verify all result above JS Alerts

    }


    }
