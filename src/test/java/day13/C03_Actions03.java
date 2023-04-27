package day13;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
public class C03_Actions03 extends TestBase {
    @Test
    public void actions() {
        //https://techproeducation.com adresine gidin
        driver.get("https://techproeducation.com");
        bekle(2);
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
        //Sayfanın alt tarafına gidin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        //Sayfanın üst tarafına gidin

    bekle(2);

       actions.sendKeys(Keys.HOME).perform(); //PERFORM  ILE  ACTION OBJEMI  ISLEME ALIR



    }
}
