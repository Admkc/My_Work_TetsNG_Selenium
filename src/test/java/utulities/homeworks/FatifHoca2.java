package utulities.homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import utulities.WebDriverFactory;

public class FatifHoca2 {
    /** Test Case 2 - Basic login and locator task
     1. Open browser
     2. Go to website https:Test Case 2 - Basic login and locator task
     1. Open browser
     2. Go to website https://www.saucedemo.com/
     3. Verify title equals : String expectedTitle = "Swag Labs"

     Day06-Task 3
     4. Enter username: provided from page
     5. Enter password: provided from page
     6. Click “Login” button
     7. Verify title equals: String expectedProductPageTitle = "Swag Labs"
     8. add 6 products to cart from the top
     9. Verify that the products are on the cart
     10. remove all the products from the cart
     Hint : You should use different locator each time//www.saucedemo.com/

     */
    @BeforeClass
    public void start(){
        System.out.println("start class");

    }
    @BeforeMethod
    public void beforeMtd(){
        System.out.println("before method");
    }
    @AfterMethod
    public void afterMtd(){
        System.out.println("after method");
    }

    @Test
    public void test1(){
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.saucedemo.com/");

        String expectedTitle = "Swag Labs";
        String actTitle=driver.getTitle();
        Assert.assertEquals(actTitle,expectedTitle);
    }
    @Test
    public void test2(){
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard_user");

        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secret_sauce");

        driver.findElement(By.cssSelector("input[class='submit-button btn_action']")).click();

        String actTitle=driver.getTitle();
        String expectedProductPageTitle = "Swag Labs";
        Assert.assertEquals(actTitle,expectedProductPageTitle);
    }

    @Test
    public void test3() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard_user");

        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secret_sauce");

        driver.findElement(By.cssSelector("input[class='submit-button btn_action']")).click();

        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("a[class='shopping_cart_link']")).click();

        WebElement text=driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        String act=text.getText();

        String exp="6";

        Assert.assertEquals(act,exp);
        Thread.sleep(2000);

        driver.findElement(By.name("remove-sauce-labs-bike-light")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("remove-test.allthethings()-t-shirt-(red)")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("remove-sauce-labs-onesie")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("remove-sauce-labs-backpack")).click();

        driver.close();














    }









    @AfterClass
    public void afterClass(){
        System.out.println( "after class");

    }


}
