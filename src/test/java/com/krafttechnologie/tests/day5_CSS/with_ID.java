package com.krafttechnologie.tests.day5_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class with_ID {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");

        //id            #

        WebElement searchBox=driver.findElement(By.cssSelector("#twotabsearchtextbox"));

        searchBox.sendKeys("css");

        WebElement cssClick=driver.findElement(By.cssSelector("#nav-search-submit-button"));
        cssClick.click();

        driver.close();
    }
}
