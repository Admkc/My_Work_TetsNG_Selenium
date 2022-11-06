package utulities.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ErenHocaTestNG {


    /** Test 1
     *  Amazon'a git
     ** Arama çubuğuna'Selenium' yazdır
     ** Arama butonuna tıkla
     ** Sonuçların sayısının olduğu metni yazdır*/


         /** Test 2
          * Ebay'e git
                ** Arama çubuğuna 'Selenium' yazdır
                ** Arama butonuna tıkla
               ** Title'ın Selenium içerdiğini doğrula.*/

       @BeforeClass
    public void beforeClas(){

           System.out.println("before class");
       }
       @Test
    public void test1(){
           WebDriverManager .chromedriver().setup();
           WebDriver driver=new ChromeDriver();
           driver.get("http://www.amazon.com");
           driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium");

           driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();

           WebElement text=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
           System.out.println("text.getText() = " + text.getText());
       }

       @Test
    public void test2(){
           WebDriverManager.chromedriver().setup();
           WebDriver driver=new ChromeDriver();
           driver.get("http://www.ebay.com");

           driver.findElement(By.cssSelector("input[autocomplete='off']")).sendKeys("selenium");

           driver.findElement(By.cssSelector("input[id='gh-btn']")).click();

           WebElement text=driver.findElement(By.xpath("//span[contains(text(),'selenium')][1]"));
           System.out.println("text.getText() = " + text.getText());

           String exp="selenium";
           String act=text.getText();
           Assert.assertEquals(act,exp);


       }


}
