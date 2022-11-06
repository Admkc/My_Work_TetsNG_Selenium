package com.krafttechnologie.tests.day5_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class with_NTH_OF_Type {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.krafttechexlab.com/");

        WebElement text=driver.findElement(By.cssSelector("div[class='row']:nth-of-type(1)"));

        System.out.println("text" +text.getText());




    }
}
