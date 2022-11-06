package com.krafttechnologie.tests.day6_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class GetAttibute {
    public static void main(String[] args) throws InterruptedException {


        String email="mike@gmail.com";

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");



        Thread.sleep(1000);


        WebElement emailInputBox=driver.findElement(By.id("email"));
       // emailInputBox.sendKeys(email);

        String value=emailInputBox.getAttribute("class");
        System.out.println("value = " + value);

        driver.close();





    }
}
