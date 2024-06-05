package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;
import utility.Constant;

public class HomePage extends BrowserDriver {


    public static WebDriver driver;
    public static String email_Field="//input[@name='user-name']";
    public static String password_Field="//input[@name='password']";
    public static String button_location="//input[@id='login-button']";



    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(Constant.URL);
    }

    public static void enterEmailAddress(){
        driver.findElement(By.xpath(email_Field)).sendKeys("standard_user");
    }

    public static void enterPassword(){
        driver.findElement(By.xpath(password_Field)).sendKeys("secret_sauce");
    }

    public static void clickOnLogin(){
        driver.findElement(By.xpath(button_location)).click();
    }



    public static String getValueFromLoginButton(){
        String actual_String=driver.findElement(By.xpath(button_location)).getAttribute("value");
        System.out.println("Actual String  " +actual_String);
        return actual_String;
    }



}
