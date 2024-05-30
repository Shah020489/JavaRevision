package SeleniumBasics.CountLinkOnPage;

import com.google.common.base.Stopwatch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sellglobal.ebay.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Stopwatch stopwatch=null;
        try {
            stopwatch=Stopwatch.createStarted();
            driver.findElement(By.linkText("Start Sell")).click();
        }
        catch (Exception e){
            stopwatch.stop();
            System.out.println(e);
            System.out.println(stopwatch.elapsed(TimeUnit.SECONDS)+" seconds");
        }


        driver.quit();


    }
}
