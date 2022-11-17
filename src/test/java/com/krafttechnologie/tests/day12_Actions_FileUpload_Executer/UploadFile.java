package com.krafttechnologie.tests.day12Actions_FileUpload_Executer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class UploadFile {

    /**

     //choose file elementini locate ediyoruz
     //sonrasinda sendKeys(file path)
     //File Path:
     //Windows icin: shift tusu+ dosya uzerinde sag click yapip Copy asPath(yol olarak) seciyoruz

     */

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();

    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://demoqa.com/upload-download");



        WebElement chooseFile= driver.findElement(By.id("uploadFile"));
        Thread.sleep(2000);

        chooseFile.sendKeys("C:\\Users\\admin\\Desktop\\Deneme Text.pdf");

        WebElement testmsj= driver.findElement(By.cssSelector("#uploadedFilePath"));

        System.out.println("testmsj = " + testmsj.getText());

        String actual= testmsj.getText();
        String expected="Deneme Text.pdf";

        Assert.assertTrue(actual.contains(expected));

    }




    }

