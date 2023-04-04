package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterStepDefinitions {
    WebDriver driver;
    @Given("^user able to Open Browser$")
    public void user_able_to_Open_Browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^Enter URL$")
    public void enter_URL() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("^user clicks on Register Link$")
    public void user_clicks_on_Register_Link() {
        driver.findElement(By.className("ico-register")).click();
    }

    @Then("^user on Register Page$")
    public void user_on_Register_Page() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("nopCommerce demo store. Register",title);

    }

    @Then("^user enters Gender$")
    public void user_enters_Gender() {
        driver.findElement(By.id("gender-female")).click();
    }

    @Then("^First Name and Last Name$")
    public void first_Name_and_Last_Name() {
        driver.findElement(By.id("FirstName")).sendKeys("Sapna");
        driver.findElement(By.id("LastName")).sendKeys("Sharma");
    }

    @Then("^Date Of Birth$")
    public void date_Of_Birth() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("1");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("December");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("1982");

    }

    @Then("^Email and Company Name$")
    public void email_and_Company_Name() {
        driver.findElement(By.id("Email")).sendKeys("sapnasharma700@hotmail.com");
        driver.findElement(By.id("Company")).sendKeys("Unify Testing");
    }

    @Then("^password and confirms password$")
    public void password_and_confirms_password() throws Throwable {
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
    }

    @Then("^click on register button$")
    public void click_on_register_button() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[5]/button")).click();
    }

    @Then("^user is Registered$")
    public void user_is_Registered() {
        String registered = driver.getTitle();
        System.out.println(registered);
        Assert.assertEquals("nopCommerce demo store. Register",registered);
    }

    @Then("^user closes the Browser$")
    public void user_closes_the_Browser() {
        driver.quit();
    }

}
