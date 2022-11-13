package utulities.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AhmetHoca1 {

    /* task: 1   //test 1  de yapıldı
     1.	https://www.krafttechexlab.com/Links to an external site. sayfasina git
     2.	Components module git
     3.	Alert segmesini ac
     4.	Acilan sayfadaki Alerts basligini yazdir.
     */

    /** Task : 2
     1. https://www.hepsiburada.com/Links to an external site. sayfasina git
     2.	Search box a Test Automation kelimesini yazdir
     3.	Arama butonuna click yaptir
     4.	“Test Automation ile ilgili 4 ürün bulduk” yazisini yazdir.*/


    @BeforeClass
    public void befClass(){
        System.out.println("before classssssss");
    }
    @BeforeMethod
    public void befMethod(){

        System.out.println("before method");
    }
    @AfterMethod
    public void aftMethod(){

        System.out.println("after methoddddd");
    }
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.krafttechexlab.com");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[.='Components']")).click();
        driver.findElement(By.xpath("(//span[.='Alerts'])[1]")).click();

        WebElement text=driver.findElement(By.xpath("(//span[.='Alerts'])[1]"));

        System.out.println("text.getText() = " + text.getText());
    }

    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("button[id='onetrust-accept-btn-handler'")).click();

        driver.findElement(By.className("desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b")).sendKeys("Test Automation");

        driver.findElement(By.cssSelector("div[class='SearchBoxOld-cHxjyU99nxdIaAbGyX7F'")).click();

        WebElement text=driver.findElement(By.xpath("//div[@class='searchResultSummaryBar-CbyZhv5896ASVcYBLKmx']"));

        System.out.println("text.getText() = " + text.getText());
    }

}
