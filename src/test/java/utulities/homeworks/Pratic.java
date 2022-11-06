package utulities.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Pratic {

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");

    }
    @Test
    public void test1(){

        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }

    @AfterMethod
    public void afterMetod(){
        System.out.println("after metot");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }
}
