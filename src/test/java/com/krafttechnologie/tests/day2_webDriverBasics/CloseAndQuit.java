package com.krafttechnologie.tests.day2_webDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.krafttechnologie.com/");

        Thread.sleep(3000);
        driver.close();  //close current tab

        //go to facebook
        //giving new browser tab  //eger yeni browser acılmazsa invalid
        driver=new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.quit();  //close all tab browser ı kapatır





    }
}
