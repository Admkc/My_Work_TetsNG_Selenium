package com.krafttechnologie.tests.day4_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utulities.WebDriverFactory;

public class xpathWithContains {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://www.krafttechexlab.com/");

        String text= driver.findElement(By.xpath("//li[contains(text(),'Users')]")).getText();


        // 2.ornek

        driver.get("https://www.krafttechnologie.com/");

        String text2=driver.findElement(By.xpath("//h2[contains(text(),'Bilişim alanında kariyer')]")).getText();

        System.out.println(text2);


    }






}
