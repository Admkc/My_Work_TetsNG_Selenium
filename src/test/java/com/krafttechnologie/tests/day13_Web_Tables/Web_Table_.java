package com.krafttechnologie.tests.day13_Web_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import utulities.WebDriverFactory;

import java.util.List;

public class Web_Table_ {

    WebDriver driver;

    @BeforeClass
    public void setUP() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://webdriveruniversity.com/Data-Table/index.html");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void printTable(){

        WebElement table= driver.findElement(By.xpath("//table[@class='table table-light traversal-table']"));

        System.out.println("table.getText() = " + table.getText());

    }
    @Test
    public void printAllheaders(){

        WebElement headers= driver.findElement(By.xpath("//table[@class='table table-light traversal-table']//thead"));
        System.out.println("headers.getText() = " + headers.getText());

    }
    @Test
    public void printTableSize(){
        //th tag indeki elementlerin size ni alalim

        List<WebElement> thSize= driver.findElements(By.xpath("//table[@class='table table-light traversal-table'] //th"));
        System.out.println("thSize= " + thSize.size());

        //rows(satirların) size ni bulalım

        List<WebElement> rwSize=driver.findElements(By.xpath("//table[@class='table table-light traversal-table'] //tr"));

        System.out.println("rwSize.size() = " + rwSize.size());

        //headers (Basliklar) hariç rows un size

        List<WebElement>  allRowsWithOutHeaders=driver.findElements(By.xpath("//table[@class='table table-light traversal-table']//tbody//tr"));


    }
    @Test
    public void getRow(){
        WebElement row2= driver.findElement(By.xpath("//table[@class='table table-light traversal-table']//tbody//tr[2]"));

        System.out.println("row2.getText() = " + row2.getText());
    }

    @Test
    public void getAllRows() throws InterruptedException {

        List<WebElement> allRows=driver.findElements(By.xpath("//table[@class='table table-light traversal-table']//tbody//tr"));

        Thread.sleep(3000);

        for (int i=1;i<= allRows.size();i++){
            WebElement row=driver.findElement(By.xpath("//table[@class='table table-light traversal-table']//tbody//tr["+i+"]"));
            System.out.println("row.getText() = " + row.getText());
        }

    }

    @Test
    public void getAllCellsOneRow() {

        List<WebElement>allcells=driver.findElements(By.xpath("//table[@class='table table-light traversal-table']//tbody//tr[2]/td"));

        for(WebElement element: allcells){
            System.out.println("element.getText() = " + element.getText());
        }

        WebElement jacops=driver.findElement(By.xpath("//table[@class='table table-light traversal-table']//tbody//tr[2]/td[1]"));
        System.out.println("jacops.getText() = " + jacops.getText());

        WebElement scot=driver.findElement(By.xpath("//table[@class='table table-light traversal-table']//tbody//tr[3]/td[2]"));
        System.out.println("scot.getText() = " + scot.getText());


    }
}




