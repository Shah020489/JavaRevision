package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NewTabAndWindow {
    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("first page"+ driver.getTitle());
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com");
        System.out.println("Second page"+driver.getTitle());

        //get window handles of open page
        Set<String> windowHales= driver.getWindowHandles();
        List<String> handles=new ArrayList<String>();
        handles.addAll(windowHales);
        driver.close();
        driver.switchTo().window(handles.get(0));
        System.out.println("first page"+driver.getTitle());



    }
}
