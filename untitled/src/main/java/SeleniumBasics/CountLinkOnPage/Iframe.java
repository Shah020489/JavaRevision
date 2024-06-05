package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        /**
         * How to switch to iframe
         * 1. By id or by name
         * 2. By webelement
         * 3. By index **/

        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");
        driver.switchTo().frame("moneyiframe");
        String nsindex= driver.findElement(By.id("nseindex")).getText();
        System.out.println(nsindex);
        driver.quit();


    }
}
