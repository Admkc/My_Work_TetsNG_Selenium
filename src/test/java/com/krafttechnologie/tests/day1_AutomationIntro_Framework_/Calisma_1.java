package com.krafttechnologie.tests.day1_AutomationIntro_Framework_;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utulities.WebDriverFactory;

import javax.swing.*;
import java.time.Duration;

public class Calisma_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();

        WebElement sear= driver.findElement(By.xpath("//input[@name='search_query']"));
        sear.sendKeys("yalan yalan");

        WebElement serb= driver.findElement(By.cssSelector("#search-icon-legacy"));
        serb.click();

        driver.findElement(By.xpath("(//img[@class='style-scope yt-img-shadow'])[1]")).click();



    }
       }


