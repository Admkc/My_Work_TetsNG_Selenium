package com.krafttechnologie.tests.day12Actions_FileUpload_Executer;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class JavaScriptExecutor {

    /**
     Selenium ile cözemedigimiz bazı sorunlarda javascript executor kullanarak cözebiliriz.
     clicking , sendkeys , scroll down , scroll up

     JavaScriptExecutor, Selenium Webdriver aracılığıyla JavaScript'in yürütülmesine yardımcı olan bir
     Arayüzdür. JavaScriptExecutor, javascript'i seçilen pencerede veya geçerli sayfada çalıştırmak için
     "executescript" ve "executeAsyncScript" olmak üzere iki yöntem sağlar.
     Seleniumda bir web sayfasinda islemler yapmak icin Webdriver kullaniriz. Bunun icinde
     WebElementlerden faydalaniriz. Ancak bazen bunlar ise yaramaz ve islemleri gerceklestiremeyiz.
     Bu durumlarda JavaScriptExecutor kullaniriz. Selenium javascriptexecutor u desteskler extra bir
     sey yuklemeye ihtiyac yoktur.

     Bizim kursumuzda metodlardan executeScript kullanacagiz.
     Temel JavascriptExecutor syntax:
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript(Script,Arguments);
     Script:Yurutulmesi gereken javascrip.
     Arguments: Komut dosyasinin argumentleri.
     */

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();

    }

    @Test
    public void clickWithJS() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/floating_menu");

        WebElement button= driver.findElement(By.linkText("Elemental Selenium"));


        JavascriptExecutor js= (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true);arguments[0].click()",button);
        Thread.sleep(2000);

        System.out.println("Title :" + js.executeScript("return document.title;").toString());
        System.out.println("Url :" + js.executeScript("return document.URL;").toString());

        String CurrentWindowHandle= driver.getWindowHandle();
        Set<String> windowhandles=driver.getWindowHandles();

        for(String handle: windowhandles){

            if(!handle.equals(CurrentWindowHandle)){
                driver.switchTo().window(handle);


            }

        }
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        String expectedUrl="http://elementalselenium.com/";
        String actualUrl= driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);





    }
        @Test
        public void typeWithJs() {
            /**
             go to  https://selectorshub.com/xpath-practice-page/
             Enter Last name kutusuna soyisim yazdir
             */

            driver.get("https://selectorshub.com/xpath-practice-page");

            WebElement firstname= driver.findElement(By.xpath("//input[@placeholder='First Enter name']"));

            WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Enter Last name']"));


            JavascriptExecutor js= (JavascriptExecutor) driver;

            String name="Ali";
            String surname="Veli";

            js.executeScript("arguments[0].setAttribute('value', '" + name + "')", firstname);
            js.executeScript("arguments[0].setAttribute('value', '" + surname + "')", lastname);

    }
    @Test
    public void scrollDownAndUp() throws InterruptedException {

        driver.get("https://www.krafttechnologie.com/");

        JavascriptExecutor js= (JavascriptExecutor) driver;
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,1200)");
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,-1200)");




    }




    }

