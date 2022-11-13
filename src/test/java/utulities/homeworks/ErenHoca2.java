package utulities.homeworks;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utulities.WebDriverFactory;

public class ErenHoca2 {
    /**
     *  TEST 1
     1. "https://www.krafttechexlab.com/" sitesine git.
     2. 'Forms' butonuna tıkla.+
     3. 'Radio butonuna tıkla'.+
     4. İlk butonun seçili olduğunu doğrula.+
     5. İlk butonun yanında "Checked Radio 1" yazıyor olduğunu doğrula.+
     6. İlk butonun displayed olduğunu doğrula.+
     7. İkinci butonun seçili olmadığı doğrula.+
     8. İkinci butonun yanında 'Radio 2' yazdığını doğrula.+
     9. İkinci butonun displayed olduğunu doğrula.
     10. Üçüncü butonun seçili olmadığını doğrula.
     11. Üçüncaü butonun disable (enable olmadığını) doğrula.
     12. Üçüncü butonun display olduğunu doğrula.

     TEST :2
     1. "https://www.krafttechexlab.com/" sitesine git.
     2. 'Forms' altındaki Checkbox butonunun displayed olmadığı doğrula.
     3. Forms'a tıkla.
     4. Forms' altındaki Checkbox butonunun displayed olduğunu doğrula.
     5. 'Checkbox' butonuna tıkla.
     6. İlk butonun select olmadığı doğrula.
     7. İlk butonun üzerini tıkla.
     8. İlk butonun select olduğunu doğrula.
     9. İkinci butonun select olduğunu doğrula.


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
    public void test1() throws InterruptedException {

        driver.get("https://www.krafttechexlab.com/");

        driver.findElement(By.xpath("//span[.='Forms']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='Radio']")).click();

        Thread.sleep(1000);

        WebElement radio1=driver.findElement(By.cssSelector("#gridRadios1"));

        Assert.assertTrue(radio1.isSelected());

        WebElement radio1text=driver.findElement(By.xpath("//label[.='Checked Radio 1']"));

        System.out.println("radio1text.getText() = " + radio1text.getText());

        String exp="Checked Radio 1";
        String act=radio1text.getText();

        Assert.assertEquals(act,exp);

        Assert.assertTrue(radio1.isDisplayed());

        WebElement radyo2=driver.findElement(By.cssSelector("label[for='gridRadios2']"));

        System.out.println("radyo2.getText() = " + radyo2.getText());

        String expR2="Radio 2";
        String actR2=radyo2.getText();

        Assert.assertEquals(actR2,expR2);

        Assert.assertFalse(radyo2.isSelected());
        Assert.assertTrue(radyo2.isDisplayed());

        WebElement rad3=driver.findElement(By.cssSelector("label[for='gridRadios3']"));

        System.out.println("rad3.isSelected() = " + rad3.isSelected());
        System.out.println("rad3.isDisplayed() = " + rad3.isDisplayed());
        System.out.println("rad3.isEnabled() = " + rad3.isEnabled());

        Assert.assertFalse(rad3.isSelected());
        Assert.assertTrue(rad3.isDisplayed());
        Assert.assertTrue(rad3.isEnabled());

    }

    @Test
    public void test2() {
        driver.get("https://www.krafttechexlab.com/");

        driver.findElement(By.xpath("//span[.='Forms']"));

        WebElement checkbox=driver.findElement(By.xpath("//span[.='Checkbox']"));
        Assert.assertFalse(checkbox.isDisplayed());

        driver.findElement(By.xpath("//span[.='Forms']")).click();

        Assert.assertFalse(checkbox.isDisplayed());
        checkbox.click();

        WebElement box1=driver.findElement(By.cssSelector("label[for='gridCheck1']"));
        Assert.assertFalse(box1.isSelected());

        box1.click();
        Assert.assertFalse(box1.isSelected());

        WebElement box2=driver.findElement(By.cssSelector("label[for='gridCheck2']"));

        Assert.assertFalse(box2.isSelected());





    }
}
