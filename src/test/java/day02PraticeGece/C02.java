package day02PraticeGece;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02 {


    public static void main(String[] args) throws InterruptedException {



        WebDriverManager.chromedriver().setup();// web driver  objesi ile yapiyoruz.

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//div[@class='QS5gu sy4vM']")).click();


        // sayfa baslıgının "Google" kelimesini icerdigini test edin

        String googleTitle = driver.getTitle();

        if(googleTitle.contains("Google")){
            System.out.println("Title Google iceriyor");
        }else{
            System.out.println("Title Google icermiyor");
        }

        Thread.sleep(2000);

























    }
}
