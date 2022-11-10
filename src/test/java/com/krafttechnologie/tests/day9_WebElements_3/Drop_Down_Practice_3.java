package com.krafttechnologie.tests.day9_WebElements_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

import java.util.List;

public class Drop_Down_Practice_3 {

    /**
    1. go to http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html
    2. Radio Button  kutusundaki elementlerin sayisini bul ve tum elementleri yazdir
    3. Blue elementini sec

        */
    WebDriver driver;
    @BeforeMethod
    public void setUp(){


        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearUp(){
        driver.close();

    }
    @Test
    public void test() throws InterruptedException {
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        List<WebElement> options=driver.findElements(By.xpath("//input[@type='radio'] [@name='color']"));
        System.out.println(options.size());

        options.get(2).click();
        Thread.sleep(3000);

        for (WebElement each:options){
            System.out.println(each.getText());
        }

        WebElement blueBtn=driver.findElement(By.xpath("//input[@value='blue']"));
        blueBtn.click();



        /**

        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        List<WebElement> radioButtons= driver.findElements(By.xpath("//input[@type='radio'] [@name='color']"));
        System.out.println("radioButtons.size() = " + radioButtons.size());
         radioButtons.get(2).click();
         Thread.sleep(3000);
        for (WebElement radio: radioButtons){
            System.out.println("radio.getText() = " + radio.getAttribute("value"));
        }
        WebElement blue= driver.findElement(By.xpath("//input[@value='blue']"));
        blue.click();
         */







    }
}
