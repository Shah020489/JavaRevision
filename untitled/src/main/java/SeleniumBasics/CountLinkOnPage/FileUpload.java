package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/upload-download");

        /*When WebElement type is file then we will used the item*/

        driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\ShakeelAhmed\\OneDrive - Enterprise64\\Desktop\\Screenshot_1.png");

        /** When we do not have type=file and we will do Robot class in it */
       // WebElement button= driver.findElement(By.xpath("//input[@id='uploadFile']"));
                //.sendKeys("C:\\Users\\ShakeelAhmed\\OneDrive - Enterprise64\\Desktop\\Screenshot_1.png");

 //       Actions actions=new Actions(driver);
 //       actions.moveToElement(button).click().perform();

//        Robot rb=new Robot();
//         rb.delay(2000);
//
//
//         StringSelection ss=new StringSelection("C:\\\\Users\\\\ShakeelAhmed\\\\OneDrive - Enterprise64\\\\Desktop\\\\Screenshot_1.png");
//         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
//
//         rb.keyPress(KeyEvent.VK_CONTROL);
//        rb.keyPress(KeyEvent.VK_V);
//
//        rb.keyRelease(KeyEvent.VK_CONTROL);
//        rb.keyRelease(KeyEvent.VK_V);
//
//        rb.keyPress(KeyEvent.VK_ENTER);
//        rb.keyRelease(KeyEvent.VK_ENTER);



    }
}
