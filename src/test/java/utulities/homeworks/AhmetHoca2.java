package utulities.homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

import java.util.List;

public class AhmetHoca2 {
    /**
     1.	https://the-internet.herokuapp.com/dropdown Links to an external site.sitesine git
     Dropdown List den Option 2 yi sectir.

     2.	https://demoqa.com/checkbox sitesine git
     Home klasorunu ac.
     Desktop ve Download klasorlerini check yaptir
     Check yapildigini da verify yaptir

     3.	https://www.krafttechexlab.com/forms/radio Links to an external site.sitesine git
     Radio 2 yi sectir.

     4.	https://demoqa.com/links Links to an external site.sitesine git
     li tag indeki tum elementlerin size ni aldir ve assert yaptir(expectedSize =32 olacak).
     */
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();

    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDown=driver.findElement(By.cssSelector("select#dropdown"));

        dropDown.click();

        Thread.sleep(3000);

        Select select=new Select(dropDown);

        Thread.sleep(2000);

        select.selectByVisibleText("Option 2");

        Thread.sleep(2000);

        select.selectByVisibleText("Option 1");
        select.selectByIndex(0);
    }
    @Test
    public void test2() throws InterruptedException {
        /*


     Desktop ve Download klasorlerini check yaptir
     Check yapildigini da verify yaptir
         */

        driver.get("https://demoqa.com/checkbox");

        driver.findElement(By.cssSelector("svg[class='rct-icon rct-icon-expand-close']")).click();

        Thread.sleep(1000);



        WebElement deskkutu = driver.findElement(By.xpath("(//button[@type='button'])[5]"));

        deskkutu.click();
        Thread.sleep(1000);

        Assert.assertTrue(deskkutu.isSelected());

        WebElement downKutu=driver.findElement(By.xpath("(//button[@type='button'])[7]"));

        downKutu.click();

        Assert.assertTrue(downKutu.isSelected());
        Thread.sleep(1000);





    }

    @Test
    public void test3() throws InterruptedException {
        driver.get("https://www.krafttechexlab.com/forms/radio");

        driver.findElement(By.cssSelector("#gridRadios2")).click();
        Thread.sleep(2000);

    }

    @Test
    public void test4() {
        driver.get("https://demoqa.com/links");

        List<WebElement> elments=driver.findElements(By.tagName("li"));

        System.out.println("elments.size() = " + elments.size());

        int exp=33;
        int act=elments.size();

        Assert.assertEquals(act,exp);


    }
}
