package com.krafttechnologie.tests.day5_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class withFollowingSubling {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.krafttechexlab.com/");
        driver.manage().window().maximize();

        WebElement modul=driver.findElement(By.cssSelector("li[class='nav-item']~li[class='nav-item'] :nth-of-type(1)"));

        modul.click();






    }
}
