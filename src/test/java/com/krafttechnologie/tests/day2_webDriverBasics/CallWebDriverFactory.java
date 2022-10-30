package com.krafttechnologie.tests.day2_webDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utulities.WebDriverFactory;

public class CallWebDriverFactory {
    public static void main(String[] args) throws InterruptedException {

    WebDriver driver= WebDriverFactory.getDriver("chrome");



    driver.close();


       /*  * Task
          * go to http://www.krafttechexlab.com/  website
         * expected title = Dashboard- Kraft Techex Lab - aFm
         * get title and verify that expected title equal actual title
                */



        driver.get("http://www.krafttechexlab.com");

        String expectedTitle="Dashboard - Kraft Techex Lab - aFm";
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("expectedTitle = " + expectedTitle);

        if (driver.getTitle()==expectedTitle){
            System.out.println("islem basarili");
        }else{
            System.out.println("islem basarisiz");
        }




    }

}
