package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLink {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //wait 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.deadlinkcity.com/");

        //find hyperlink
        List<WebElement> linkList=driver.findElements(By.tagName("a"));

        int resCode=200;
        int bokenLinkCount=0;
        System.out.println("Total link size is "+linkList.size());
        for (WebElement el:linkList){
            String url=el.getAttribute("href");
            try {
                URL url1=new URL(url);
                HttpURLConnection huc=(HttpURLConnection) url1.openConnection();
                huc.setRequestMethod("Head");
                huc.connect();
                resCode=huc.getResponseCode();
                if (resCode>=400){
                    System.out.println(url+"Broken link");
                    bokenLinkCount++;
                }
            }
            catch (MalformedURLException e){

            }
            catch (IOException e) {


            }
        }
        System.out.println("Broken link are in the page"+bokenLinkCount);

    }
}
