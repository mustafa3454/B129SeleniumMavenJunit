package Day15;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
public class C01_FileUpload extends TestBase {
    @Test
    public void fileUpload() {
        /*
        Bir Web sayfasında upload işlemi yapmamız gerekirse;
            1-Öncelikle upload edeceğimiz webelementi locate ederiz
            2-Upload edeceğimiz dosya yolunu bir string'e assingn ederiz
            3-Locate ettiğimiz webelement'e sendkeys() methodu ile dosyayolunu aldığımız string değişkeni göndeririz
         */
        //https://the-internet.herokuapp.com/upload adresine gidin
        driver.get("https://the-internet.herokuapp.com/upload");
        //b129.txt dosyasını yükleyin(upload)
        WebElement dosyaSecWebElement = driver.findElement(By.id("file-upload"));
        bekle(3);
        String dosyaYolu = "C:\\Users\\kpnkf\\OneDrive\\Bureau\\Nouveau Document Microsoft Word.docx";
     //   "C:\\Users\\kpnkf\\OneDrive\\Bureau\\Nouveau Document Microsoft Word.docx"

        //String dosyaYolu = System.getProperty("user.home")+"\\OneDrive\\Masaüstü\\b129.txt";
        dosyaSecWebElement.sendKeys(dosyaYolu);
        bekle(3);
        driver.findElement(By.id("file-submit")).click();
        //“File Uploaded!” textinin görüntülendiğini test edin
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());
    }
}
