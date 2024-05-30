package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountLinkOnPage {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.calculator.net/");

        List<WebElement> hyperlinkList=driver.findElements(By.tagName("a"));
        System.out.println("Size of list is "+hyperlinkList.size());

        int count=1;
        for (WebElement el :hyperlinkList){
            System.out.println(count+el.getText());
            count++;
        }
        driver.quit();


    }
}
