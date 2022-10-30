package utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class WebDriverFactory {
    //Task
//    Write a static method that takes a string parameter name:BrowserType
//    It will setup the bwowser
//    the method will return chrome driver or firedriwer
//    name of the method:getDriver


    public static WebDriver getDriver(String browserType){
        WebDriver driver=null;
        switch (browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;



        }
        return driver;



    }
}

