package SeleniumBasics.CountLinkOnPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        //find source and target webElement
        WebElement source=driver.findElement(By.id("box6"));
        WebElement target=driver.findElement(By.id("box106"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,target).perform();

        driver.close();



    }
}
