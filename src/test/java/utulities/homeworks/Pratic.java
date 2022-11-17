package utulities.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import utulities.WebDriverFactory;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Pratic {

    WebDriver driver;

    @BeforeClass
    public void setUP() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void printTable() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button[text()='Enable']")).click();





        WebDriverWait wait=new WebDriverWait(driver,7);
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));

        wait.until(ExpectedConditions.elementToBeClickable(inputBox));










    }


}