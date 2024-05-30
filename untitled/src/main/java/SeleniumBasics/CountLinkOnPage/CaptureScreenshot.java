package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot {
    public static void main(String[] args) throws IOException {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/alerts");

        TakesScreenshot screenshot= ((TakesScreenshot) driver);
        File src= screenshot.getScreenshotAs(OutputType.FILE);
        File dest= new File("C:\\Learning\\Automation-Sessions\\JavaRevision\\untitled\\src\\main\\resources\\Fullscreen.png");


        FileUtils.copyFile(src,dest);



    }
}
