package com.krafttechnologie.tests.day2_webDriverBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndGetUrl {
    public static void main(String[] args) {

        //task
        //open chrome and navigate to "https://www.krafttechnologie.com
        // get title

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.krafttechnologie.com/");

        //getting title with selenium

        System.out.println("driver.getTitle() = " + driver.getTitle());
        String title=driver.getTitle();
        System.out.println(title);

        // get the url from browser

        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);

        //get the source of pace

        String pageSource=driver.getPageSource();
        System.out.println(pageSource);





    }
}
