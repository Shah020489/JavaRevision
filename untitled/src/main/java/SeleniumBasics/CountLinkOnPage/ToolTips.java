package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTips {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.manage().window().maximize();
        /**
        driver.get("https://www.google.com/");

        String txt=driver.findElement(By.name("q")).getAttribute("title");

        String expectedTooltips="Search";

        if (txt.equals(expectedTooltips)){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test is not Passed");
        }
         */

        driver.get("https://www.facebook.com/");

        String currentToolTip=driver.findElement(By.xpath("//a[text()='Sign Up']")).getAttribute("title");
        String expectedToolTip="Sign up for Facebook";
        if (expectedToolTip==currentToolTip){
            System.out.println("Tooltip is matched");
        }
        else {
            System.out.println("Tooltips is not matched");
        }

        driver.quit();
    }
}
