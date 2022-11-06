package com.krafttechnologie.tests.day6_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class BrowserStackTask {
    public static void main(String[] args) {
        /** Class Task
         *  go to the url -  "https://www.browserstack.com/users/sign_up"
         *  maximize the window
         *  accept cookies if any ,
         *  fill in the blanks with the faker class
         *  click "Term of service" checkbox
         *  and close the window
         *
         *  hint: u can use any locator you want
         *
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.browserstack.com/users/sign_up");

        driver.manage().window().maximize();

        driver.findElement(By.id("accept-cookie-notification-cross-icon")).click();

        driver.findElement(By.cssSelector("input[id='user_full_name']")).sendKeys("adem");

        driver.findElement(By.cssSelector("input[id='user_email_login']")).sendKeys("kocadem99@gmail.com");

        driver.findElement(By.cssSelector("input[id='user_password'")).sendKeys("1236458");

        driver.findElement(By.cssSelector("input[id='tnc_checkbox'")).click();

        driver.close();


    }




}
