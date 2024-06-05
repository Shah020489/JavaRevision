package stepDefination;

import Pages.HomePage;
import Pages.ProductListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;

public class HomePageStep extends BrowserDriver {




    @Given("User navigate to the login page")
    public void user_navigate_to_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //System.out.println("Hello World");
        HomePage.openBrowser();
    }

    @When("User enter email address")
    public void user_enter_email_address() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //System.out.println("Hello World");
        HomePage.enterEmailAddress();
    }

    @When("User enter password")
    public void user_enter_password() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //System.out.println("Hello World");
       HomePage.enterPassword();
    }

    @Then("User validate {string} text")
    public void user_validate_text(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //System.out.println("Hello World");
        System.out.println("string   "+string);
        String actualString=HomePage.getValueFromLoginButton();
        Assert.assertEquals(actualString,string);


    }

    @Then("User click on login Button")
    public void user_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        //System.out.println("Hello World");
        HomePage.clickOnLogin();
    }

    @Then("User view the product list page")
    public void user_view_the_product_list_page() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        //System.out.println("Hello World");

        ProductListPage.validateCartIcon();
    }

}
