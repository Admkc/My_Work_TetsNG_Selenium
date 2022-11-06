package com.krafttechnologie.tests.day5_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class with_Class {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.cssSelector("input[id$='textbox']"));
        searchBox.sendKeys("API");
        WebElement searchButton=driver.findElement(By.cssSelector("input[id$='-button']"));

        searchButton.click();

        driver.close();








    }





}
