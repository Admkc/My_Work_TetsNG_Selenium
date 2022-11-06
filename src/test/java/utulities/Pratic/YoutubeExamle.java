package utulities.Pratic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YoutubeExamle {


    WebDriver driver;

    @BeforeAll
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com.tr");
        driver.manage().window().maximize();
    }

    @Test
    public void select(){
        driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'][1]")).sendKeys("ferrari");


    }


    @AfterMethod
    public void tearDown(){

        driver.quit();
    }



}
