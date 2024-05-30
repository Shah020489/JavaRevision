package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CountRadioButton {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //wait 10 seconds
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://udyamregistration.gov.in/Udyam_Login.aspx");
        List < WebElement> radioButtonList=driver.findElements(By.xpath("//input[@type='radio']"));

        System.out.println("Total number of radio button on page" +radioButtonList.size());


        driver.close();


    }
}
