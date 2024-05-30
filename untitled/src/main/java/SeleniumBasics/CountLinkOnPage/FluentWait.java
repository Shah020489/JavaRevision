package SeleniumBasics.CountLinkOnPage;

import com.google.common.base.Stopwatch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FluentWait<W extends SearchContext> {
    public static void main(String[] args) {

        /**Fluent wait have polling time as well as it can ignore the enception occured.*/

        /**Creating the webdriver object*/
        WebDriver driver;
        /**Setup the web driver manager*/
        WebDriverManager.chromedriver().setup();
        /**Set up the driver with chrome driver*/
        driver=new ChromeDriver();
        /**Maximize the browser window*/
        driver.manage().window().maximize();
        driver.get("https://sellglobal.ebay.in/");
        Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

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
