package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
    public static void main(String[] args) {

        //Driver instance
        WebDriver driver;
        //Set up WebDriver Manager
        WebDriverManager.chromedriver().setup();
        //inistiate driver to chrome driver
        driver=new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        driver.get("http://uitestpractice.com/Students/Index");
        JavaScriptExecutor js= (JavaScriptExecutor) driver;
        //js.executeScript();
        driver.close();





    }


}
