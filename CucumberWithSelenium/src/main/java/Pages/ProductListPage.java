package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;

public class ProductListPage extends BrowserDriver {

    public static WebDriver driver;

    public static String cartIcon="//a[@class='shopping_cart_link fa-layers fa-fw']";

    public static void validateCartIcon(){
        driver.findElement(By.xpath("//div[@id='inventory_filter_container']")).isDisplayed();
    }
}
