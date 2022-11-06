package com.krafttechnologie.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utulities.WebDriverFactory;

public class xpathWithText {
    public static void main(String[] args) throws InterruptedException {

        // html de text ler siyah olur

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.krafttechnologie.com/");

        //text ile

        String text=driver.findElement(By.xpath("//h1[text()='Eğitimlerimiz']")).getText();

        // . ile

        String text2=driver.findElement(By.xpath("//h1[.='Eğitimlerimiz']")).getText();

        // * ile

        String text3=driver.findElement(By.xpath("//*[.='Eğitimlerimiz']")).getText();



        System.out.println("text = " + text);

        System.out.println("text2" +text2);

        System.out.println("text3 "  +text3);

    }

}
