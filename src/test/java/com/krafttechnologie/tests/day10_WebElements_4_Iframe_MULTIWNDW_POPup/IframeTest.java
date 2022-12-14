package com.krafttechnologie.tests.day10_WebElements_4_Iframe_MULTIWNDW_POPup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

public class IframeTest {
    /**
     Frames  HTML İÇİNDE HTML
     Frames kullanarak HTML'nin içine koyabiliriz.
     Frame varsa, selenyum frame içinde ne olduğunu kontrol edemez.
     Önce iframe'i değiştirmeliyiz.
     iframe'e geçtiğimizde, selenium biz geri değiştirene kadar default/varsayılan sayfayı göremez,
     Bir seferde sadece bir frame değiştirebiliriz ve torunlara doğrudan geçilmez.
     kardeş/sibling arası geçiş/switch olmaz sadece ebeveynden çocuğa/parentchild.

     Parent To child
     driver.switchTo().frame(...)
     1. int index
     2. String id or name
     3. Webelement locator

     ** bütün geçişler parent to child ve child to parent
     ** siblings(kardeşler) arası geçiş söz konusu değil

     Child to Parent
     driver.switchTo().parentFrame(); --> bir üste götürür
     driver.switchTo().defaultContent(); --> en üste götürür
     */

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void iframe() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/iframe");


        // how to switch the frame

        // first way using NAME or ID

        driver.switchTo().frame("mce_0_ifr");

        WebElement textArea = driver.findElement(By.cssSelector("#tinymce"));
        textArea.clear();
        Thread.sleep(2000);
        textArea.sendKeys("Batch 2 was here");

        //second way switching INDEX

        driver.switchTo().parentFrame();// first we should go back to parent
        driver.switchTo().frame(0);
        textArea.clear();
        textArea.sendKeys("Batch 2 was here Two times");


        driver.switchTo().parentFrame();
        Thread.sleep(2000);


        // third way using WEB ELEMENT

        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
        textArea.clear();
        textArea.sendKeys("This is third way");

    }
    @Test
    public void nestedIframe(){
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        // switch to middle frame and get MIDDLE text

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        System.out.println("driver.findElement(By.cssSelector(\"#content\")).getText() = "
                + driver.findElement(By.cssSelector("#content")).getText());


        // got to Right frame and get text

        // driver.switchTo().parentFrame(); // selenium switch to parent

        driver.switchTo().defaultContent(); // selenium switch the top
        driver.switchTo().frame("frame-top"); // if we use defaultContent(), we should start first step

        driver.switchTo().frame(2);
        System.out.println("driver.findElement(By.tagName(\"Body\")).getText() = "
                + driver.findElement(By.tagName("Body")).getText());

        // go to bottom frame and get text

        driver.switchTo().defaultContent();
        // driver.switchTo().parentFrame().switchTo().parentFrame(); // another way to go grandparent
        driver.switchTo().frame("frame-bottom");
        System.out.println("driver.findElement(By.tagName(\"Body\")).getText() = "
                + driver.findElement(By.tagName("Body")).getText());


    }

    @Test
    public void testPratic() throws InterruptedException {

        driver.get("https://www.krafttechexlab.com/components/iframe");

        WebElement iframe= driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(iframe);
        Thread.sleep(2000);

        WebElement box=driver.findElement(By.xpath("(//button[@class='btn-close btn-close-white'])[1]"));
        box.click();

        driver.switchTo().defaultContent();

        WebElement title= driver.findElement(By.xpath("//h1[.='Iframe']"));

        System.out.println("title.getText() = " + title.getText());
        Thread.sleep(2000);


    }
    }


