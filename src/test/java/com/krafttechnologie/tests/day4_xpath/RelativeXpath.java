package com.krafttechnologie.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utulities.WebDriverFactory;

public class RelativeXpath {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.hepsiburada.com/");

        String text1=driver.findElement(By.xpath("(//a[@href='https://www.hepsiburada.com/cozummerkezi'])[1]")).getText();

        String text=driver.findElement(By.xpath("(//a[@*='https://www.hepsiburada.com/cozummerkezi'])[1]")).getText();
                                                                 // attribute yerine * koyuyoruz.

        System.out.println(text1);

        System.out.println("text = " + text);




    }
}
