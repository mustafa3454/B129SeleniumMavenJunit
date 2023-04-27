package PRTICE129.day03gunduz;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C05 {


    //http://demo.guru99.com/test/delete_customer.php adresine gidin
    //customer id kısmına 53920 yazın
    //submit butonuna tıklayın
    //cıkan alert mesajını yazdırın
    //alerti kabul edin
    //cıkan 2. alert mesajını yazdırın
    //cıkan 2. alerti kabul edin

static WebDriver driver;
    @BeforeClass
    public static void beforeClass() throws Exception {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }



    @AfterClass
    public static void afterClass() throws Exception {

    }

    @Test
    public void name() {
        //http://demo.guru99.com/test/delete_customer.php adresine gidin
   driver.get("http://demo.guru99.com/test/delete_customer.php");



        //customer id kısmına 53920 yazın





        //submit butonuna tıklayın
        //cıkan alert mesajını yazdırın
        //alerti kabul edin
        //cıkan 2. alert mesajını yazdırın
        //cıkan 2. alerti kabul edin




    }
}
