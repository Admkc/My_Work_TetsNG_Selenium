package utulities.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Pratic {

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");


    }
    @Test
    public void test1(){

        System.out.println("test1");
        String email="kocadem997103@gmail.com";
        Assert.assertTrue(email.contains("koc"));
    }
    @Test
    public void test2(){
        System.out.println("test2");
        String act="galatasaray";
        String exp="galatasaray";
     //   Assert.assertEquals(act,exp,"passssssssssssss");
     //   Assert.assertTrue(act.contains(exp),"esitlik var");


        Assert.assertFalse(5<9,"istlik");
        Assert.assertEquals(5,5);

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
