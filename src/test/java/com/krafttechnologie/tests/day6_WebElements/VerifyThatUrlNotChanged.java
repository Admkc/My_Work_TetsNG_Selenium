package com.krafttechnologie.tests.day6_WebElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyThatUrlNotChanged {
    public static void main(String[] args) {

        /** Class Task
         * open the chrome browser
         * go to https://www.krafttechexlab.com/login
         * click on login button
         * verify that url did not changed
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.krafttechexlab.com/login");

      //  String  expectedUrl="https://www.krafttechexlab.com/login"
        String expectedUrl=driver.getCurrentUrl();

        WebElement loginBtn=driver.findElement(By.cssSelector("button[class='btn btn-primary w-100'"));
        loginBtn.click();

        String actual=driver.getCurrentUrl();

        System.out.println(actual);

        if (expectedUrl.equals(actual)){
            System.out.println("passs");
        }else{
            System.out.println("faied");
        }

        driver.close();





    }




}
