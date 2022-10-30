package com.krafttechnologie.tests.day3_basic_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class NameLocaterTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        Thread.sleep(3000);

        WebElement emailInPutBox=driver.findElement(By.name("email"));
        emailInPutBox.sendKeys("mike@gmail.com");

        //1.yol

        WebElement passwordInPutBox=driver.findElement(By.name("password"));
        passwordInPutBox.sendKeys("12345");

        //2. yol -LAZY WAY
        //  driver.findElement(By.name("password")).sendKeys("12345");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".btn.btn-primary.w-100")).click();

        Thread.sleep(2000);

        driver.close();

    }



}
