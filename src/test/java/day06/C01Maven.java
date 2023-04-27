package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01Maven {



        /*
        https://www.amazon.com/ sayfasına gidelim
        Arama kutusunu locate edelim
        "Samsung headphones" ile arama yapalım
        Bulunan sonuç sayısını yazdıralım
        İlk ürünü tıklayalım
        Sayfadaki tüm başlıkları yazdıralım
         */
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        https://www.amazon.com/ sayfasına gidelim
            driver.get("https://www.amazon.com/");



              //        Arama kutusunu locate edelim


   //        "Samsung headphones" ile arama yapalım
  //        Bulunan sonuç sayısını yazdıralım
//        İlk ürünü tıklayalım
//        Sayfadaki tüm başlıkları yazdıralım






        }
    }


