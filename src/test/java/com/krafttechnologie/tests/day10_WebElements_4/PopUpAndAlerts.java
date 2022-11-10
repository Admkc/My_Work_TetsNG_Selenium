package com.krafttechnologie.tests.day10_WebElements_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

public class PopUpAndAlerts {

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
    public void PopUp() throws InterruptedException {
        driver.get("http://primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=73437");

        //click the confirm button
        driver.findElement(By.xpath("(//span[text()='Confirm'])[1]")).click();
        //click 'Yes'
        driver.findElement(By.xpath("(//span[text()='Yes'])[2]")).click();

        Thread.sleep(2000);

        //verify that confirm is accepted
        String expectedMessage="You have accepted";
        WebElement actualMessage = driver.findElement(By.xpath("//p[text()='You have accepted']"));

        Assert.assertEquals(actualMessage.getText(),expectedMessage);

    }
    @Test
    public void jsAlert(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }



}
