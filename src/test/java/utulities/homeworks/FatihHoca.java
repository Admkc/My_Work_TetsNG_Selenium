package utulities.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FatihHoca {

    /**
     Test Case 1 - Basic navigation task
     1. Open browser
     2. Go to website https://google.com
     3. Save the title in a string variable
     4. Go to https://etsy.com
     5. Save the title in a string variable
     6. Navigate back to previous page
     7. Verify that title is same is in step 3
     8. Navigate forward to previous page
     9. Verify that title is same is in step 5
     */
    @BeforeClass
    public void starting(){
        System.out.println("test case report Starts");
    }


    @Test
    public void open(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        String expected="Google";
        String actual=driver.getTitle();
        Assert.assertEquals(actual,expected);


    }
    @Test
    public void open2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://etsy.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        String exp="Etsy Turkey - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String act=driver.getTitle();
        Assert.assertEquals(act,exp);



    }
    @BeforeMethod
    public void beforeNG(){
        System.out.println("before method");
    }
    @AfterMethod
    public void afterMethodNg(){
        System.out.println("after method");
    }

    @AfterClass
    public void ending(){
        System.out.println("classsss ending");
    }





}
