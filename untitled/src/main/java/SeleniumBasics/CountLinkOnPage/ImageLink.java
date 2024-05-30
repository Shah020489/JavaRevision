package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImageLink {
    public static void main(String[] args) {


        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.opencart.com/index.php?route=account/register");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get("https://www.opencart.com/index.php?route=cms/demo");
        driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();

        if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
        {
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }

        driver.close();



    }
}
