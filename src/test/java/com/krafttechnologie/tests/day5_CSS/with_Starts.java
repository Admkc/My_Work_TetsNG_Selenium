package com.krafttechnologie.tests.day5_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class with_Starts {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");

        WebElement searhBox=driver.findElement(By.cssSelector("input[id^='twotabsearchtext']"));
        searhBox.sendKeys("cucumber");

        WebElement searcBtn=driver.findElement(By.cssSelector("input[id^='nav-search-']"));
        searcBtn.click();


    }
}
