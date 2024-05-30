package SeleniumBasics.CountLinkOnPage;

import com.google.common.base.Stopwatch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sellglobal.ebay.in/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Stopwatch stopwatch=null;
        /**Explict wait for items*/
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        try {
            stopwatch=Stopwatch.createStarted();
            //driver.findElement(By.linkText("Start Sell")).click();
           WebElement webElement= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELL")));
           webElement.click();
        }
        catch (Exception e){
            stopwatch.stop();
            System.out.println(e);
            System.out.println(stopwatch.elapsed(TimeUnit.SECONDS)+" seconds");
        }


        driver.quit();


    }
}
