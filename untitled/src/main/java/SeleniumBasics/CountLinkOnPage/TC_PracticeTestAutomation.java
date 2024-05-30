package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_PracticeTestAutomation {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        String currentUrl=driver.getCurrentUrl();
        if (currentUrl.equals("https://practicetestautomation.com/logged-in-successfully/"))
        {
            System.out.println("Passed");
        }
        else {

        }

        String text= driver.findElement(By.xpath("//p[@class='has-text-align-center']")).getText();
        System.out.println(text);
        if (text.equals("Congratulations student. You successfully logged in!")){
            System.out.println("Pass");
        }
        else {

        }

        String buttonText=driver.findElement(By.xpath("//a[text()='Log out']")).getText();
        if (buttonText.equals("Log out")){
            System.out.println("Pass");
        }
        else {

        }

        driver.quit();

    }
}
