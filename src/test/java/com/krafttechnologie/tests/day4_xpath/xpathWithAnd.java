package com.krafttechnologie.tests.day4_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class xpathWithAnd {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");

        ;


        driver.get("https://www.hepsiburada.com");

        // and ile

        WebElement seachBox=driver.findElement(By.xpath("//input[@type='text'] [@maxlength='150']"));

        //burda end lullanılır

        WebElement seachBox2=driver.findElement(By.xpath("//input[@type='text' and @maxlength='150']"));


        //or ile

        WebElement seachbox2= driver.findElement(By.xpath("//input[@type='text' or" +
                " @class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']"));



        seachBox.sendKeys("java");




    }



}
