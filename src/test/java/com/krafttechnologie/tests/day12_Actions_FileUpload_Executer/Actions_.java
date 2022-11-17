package com.krafttechnologie.tests.day12_Actions_FileUpload_Executer;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

import java.util.List;

public class Actions_ {

    /**

     //Action class ileri duzey etkilesimler sunar.
     //doubleclick, dragganddropp, hover, rightclick..vb
     //Action Class Seleniumdan gelir. Webdriver constructor gibi parametre olarak atanir.
     //Cunku driveri browserla etkilesime gecebilmesi icin
     //perform()----> action tamamlamak icin kullanilir.
     */



    WebDriver driver;



    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();

    }

    @Test
    public void doubleClick() throws InterruptedException {

        
        driver.get("https://webdriveruniversity.com/Actions/index.html");

        WebElement twolick=driver.findElement(By.id("double-click"));

        Actions actions=new Actions(driver);

        Thread.sleep(2000);

        actions.doubleClick(twolick).perform();

        Thread.sleep(2000);
    }

    @Test
    public void dragAndDropp() throws InterruptedException {

        driver.get("https://webdriveruniversity.com/Actions/index.html");

        WebElement drag=driver.findElement(By.id("draggable"));

        WebElement drop=driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);

        Thread.sleep(2000);

        actions.dragAndDrop(drag,drop).perform();

        Thread.sleep(2000);

        // 2.way

        actions.moveToElement(drag).clickAndHold().moveToElement(drop).release().perform();

    }

    @Test
    public void dragAndDropp2() {
        /**
     go to  https://www.krafttechexlab.com/javascript/droppable
     Drag Me to my target elementini Drop here elementinin uzerine surukle birak

     */
        driver.get("https://www.krafttechexlab.com/javascript/droppable");

        WebElement drag=driver.findElement(By.id("draggable"));

        WebElement drop=driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);

        actions.dragAndDrop(drag,drop).perform();

        System.out.println("drop.getText() = " + drop.getText());

        String exp="Dropped!";

        Assert.assertEquals(drop.getText(),exp);


    }@Test
    public void hover1() throws InterruptedException {
        driver.get("https://webdriveruniversity.com/Actions/index.html");

        WebElement hoverMe=driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));

        WebElement link1=driver.findElement(By.xpath("//a[.='Link 1']"));

        Actions actions=new Actions(driver);
        actions.moveToElement(hoverMe).perform();

        Assert.assertTrue(link1.isDisplayed());
        link1.click();

        Alert alert=driver.switchTo().alert();

        System.out.println("alert.getText() = " + alert.getText());

        String actualtext= alert.getText();
        String expectedText= "Well done you clicked on the link!";

        Assert.assertEquals(actualtext,expectedText);

        Thread.sleep(2000);

        alert.accept();

    }
    @Test
    public void hover2() throws InterruptedException {
        /**
    go to  https://www.krafttechexlab.com/components/tooltips
    Tooltip on top elementine hover yap
    sonrasinda diger elementleri de tek tek hover yap
     */
        driver.get("https://www.krafttechexlab.com/components/tooltips");

        WebElement hovertool= driver.findElement(By.xpath("(//button[@class='btn btn-secondary'])[1]"));

        WebElement ontop= driver.findElement(By.xpath("//button[@data-bs-placement='top']"));

        Actions actions=new Actions(driver);
        actions.moveToElement(hovertool).perform();
        Thread.sleep(2000);

        String expected="top";

        String actual=ontop.getAttribute("data-bs-placement");

        Assert.assertEquals(actual,expected);

        List<WebElement> hovers= driver.findElements(By.xpath("//button[@class='btn btn-secondary']"));
                                                                            // *** aynılarını alıyoruz
        for(WebElement hover: hovers){
            actions.moveToElement(hover).pause(2000).perform();
        }
    }

    @Test
    public void rightClick() throws InterruptedException {
/**
     go to https://demoqa.com/buttons
     Right Click Me elementine sag click yap ve
     Assert et
     */

        driver.get("https://demoqa.com/buttons");

        WebElement right=driver.findElement(By.id("rightClickBtn"));

        Actions actions= new Actions(driver);

        actions.contextClick(right).perform();

        Thread.sleep(2000);

        WebElement msj= driver.findElement(By.id("rightClickMessage"));

        String expected= "You have done a right click";
        String actual= msj.getText();

        Assert.assertEquals(actual,expected,"FAIL");

    }


    }


