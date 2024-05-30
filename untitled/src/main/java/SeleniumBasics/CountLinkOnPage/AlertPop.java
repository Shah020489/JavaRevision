package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.xpath("//button[@id='alertButton']")).click();

        //Switch to alert window and accept the alert
        driver.switchTo().alert().accept();

        driver.close();



    }
}
