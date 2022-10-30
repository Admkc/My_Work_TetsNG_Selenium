package com.krafttechnologie.tests.day1_AutomationIntro_Framework_;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        /*
        1- pom xml e yukledigimiz  webdrivermanager kütüphanesinden chromu hazır hale getirmesini isteyecegiz.
        2-Web driver clasından driver ı hazır hale getirmesini isteyecegiz.
        3-nesneme testini yapacagımız web sayfasına beni goturmesini isteyecegiz.

         */
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver=new FirefoxDriver();

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.krafttechnologie.com/");
       // driver.manage().window().maximize();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        String expectedTitle="Kraft Technologie | Yazılım ve Bilişim Eğitimleri – Uzaktan Canlı Eğitim";

        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Baslik bekledigi gibi geldi.Dogrulama gecti");
        }else {
            System.out.println("Baslik beklendigi gibi GELMEDI. Dogrulama GECMEDI");
        }
    }
}






