package com.krafttechnologie.tests.day5_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class withMultipleAttribu {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.hepsiburada.com");

        WebElement searc=driver.findElement(By.cssSelector("input[class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b'][type='text']"));

        searc.sendKeys("database");

        WebElement click=driver.findElement(By.cssSelector("div[class='SearchBoxOld-cHxjyU99nxdIaAbGyX7F'"));
        click.click();

    }
}
