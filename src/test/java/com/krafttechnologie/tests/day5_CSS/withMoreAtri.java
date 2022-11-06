package com.krafttechnologie.tests.day5_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utulities.WebDriverFactory;

public class withMoreAtri {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.krafttechexlab.com/");

        WebElement componentText= driver.findElement(By.cssSelector("div[class='row']>div[class='col-md-4']"));
        System.out.println("componentText.getText() = " + componentText.getText());


    }
}
