package com.krafttechnologie.tests.day5_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class withContains {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.hepsiburada.com");

        WebElement searcbox=driver.findElement(By.cssSelector("div[class*='SearchBoxOld-sfM'"));

        searcbox.sendKeys("postman");

    //    WebElement searchClick=driver.findElement(By.cssSelector("input[type*='mit']"));
    //    searchClick.click();   //tekrar etttttttttt





    }
}
