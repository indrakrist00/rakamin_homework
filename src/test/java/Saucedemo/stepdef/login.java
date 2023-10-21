package Saucedemo.stepdef;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ElementNotInteractableException;


import java.util.concurrent.TimeUnit;

public class login {
    WebDriver driver;
    String baseurl = "https://www.saucedemo.com/";

    @Given("Halaman login sauce demo")
    public void halaman_login_sauce_demo(){
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseurl);

        //assertion
        String loginPageAssert = driver.findElement(By.xpath("//div[contains(text(), 'Swag Labs')]")).getText();
        Assert.assertEquals(loginPageAssert, "Swag Labs"); //validasi buka web
    }
    @When("I input (.*) as username$")
    public void user_input_tdd_selenium_gmail_com_as_email(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }
    @And("I input (.*) as password$")
    public void user_input_tdd_selenium_as_password(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    };

    @When("click login button")
    public void click_login_button() {
        //klik button login
        driver.findElement(By.id("login-button")).click();
    }
    @Then("I verify (.*) login result$")
    public void i_verify_success_login_result(String status) {
        switch (status) {
            case "success":  //Jika success
                String loginPageAssert1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div[contains(text(), 'Sauce Labs Backpack')]")).getText();
                Assert.assertEquals(loginPageAssert1, "Sauce Labs Backpack");
                break;
            case "failed": { // Jika failed
                String ErrorLogin = driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out.')]")).getText();
                Assert.assertEquals(ErrorLogin, "Epic sadface: Sorry, this user has been locked out.");
                break;
    }
    @Then("user should see Product Page")
    public void usershouldseeProductPage() {
        String loginPageAssert1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div[contains(text(), 'Sauce Labs Backpack')]")).getText();
        Assert.assertEquals(loginPageAssert1, "Sauce Labs Backpack");
    }

    @And("user click add to cart button")
    public void user_click_add_to_cart_button() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
    }

    @And("user click cart icon")
    public void userClickCartIcon() {
        driver.findElement(By.id("shopping_cart_container")).click();
    }

    @And("user click checkout button")
    public void userClickCheckoutButton() {
        driver.findElement(By.id("checkout")).click();
    }

    @Then("user should see Checkout Your Information page")
    public void userShouldSeeCheckoutYourInformationPage() {
        String Cekot = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span[contains(text(),'Checkout: Your Information')]")).getText();
                Assert.assertEquals(Cekot, "Checkout: Your Information");
            }

            @And("user input on first name field")
            public void userInputOnFirstNameField() {
                driver.findElement(By.id("first-name")).sendKeys("Jessica");
            }

            @And("user input last name field")
            public void userInputLastNameField() {
                driver.findElement(By.id("last-name")).sendKeys("Widyadhana I");
            }

            @And("user input Zip or Postal Code field")
            public void userInputZipPostalCodeField() {
                driver.findElement(By.id("postal-code")).sendKeys("14045");
            }
            @And("user input Zip or Postal Code field")
            public void userInputZipPostalCodeField() {
                driver.findElement(By.id("postal-code")).sendKeys("14045");
            }

            @When("user click continue button")
            public void userClickContinueButton() {
                driver.findElement(By.id("continue")).click();
            }

            @Then("user directed to checkout overview section")
            public void userDirectedToCheckoutOverviewSection() {
                String CekotOverview = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span[contains(text(),'Checkout: Overview')]")).getText();
                Assert.assertEquals(CekotOverview, "Checkout: Overview");
            }

            @And("user click Finish button")
            public void userClickFinishButton() {
                driver.findElement(By.id("finish")).click();
            }

            @Then("user directed to checkout complete section")
            public void userDirectedToCheckoutCompleteSection() {
                String thankyu = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]")).getText();
                Assert.assertEquals(thankyu,"Thank you for your order!");
            }

            @When("user click back home button")
            public void userClickBackHomeButton() {
                driver.findElement(By.id("back-to-products")).click();
            }

            @And("user click burger button")
            public void userClickBurgerButton() {
                driver.findElement(By.id("react-burger-menu-btn")).click();
            }

            @And("user click logout menu")
            public void userClickLogoutMenu() {
                //driver.findElement(By.id("logout_sidebar_link")).click();
                new WebDriverWait(driver, Duration.ofMinutes(2)).until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();
            }

            @Then("user should see error message bellow the Zip or Postal Code field")
            public void userShouldSeeErrorMessageBellowTheZipOrPostalCodeField() {
                String ErrorZipCode = driver.findElement(By.xpath("//h3[contains(text(),'Error: Postal Code is required')]")).getText();
                Assert.assertEquals(ErrorZipCode, "Error: Postal Code is required");
            }

            @And("user click (.*) item from pdp$")
            public void user_click_true_item_from_pdp(String remove){
                driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

                if (remove.equals("true")) {
                    driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed();
                } else {
                    driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed();
                }
            }}}

    }

