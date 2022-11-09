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
/**


jh
gdfhgmldmhdlhşgjnmfj

*/
public class Calisma_1 {
    public static void main(String[] args) throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.youtube.com");
                    driver.manage().window().maximize();



            driver.findElement(By.xpath("//div[@class='style-scope ytd-searchbox' and @id='container']")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='search']")).sendKeys("ahmet kaya");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

            Thread.sleep(5000);

            driver.findElement(By.xpath("(//div[@id='dismissible' and @class='style-scope ytd-video-renderer'])[1]")).click();

        }


    }




