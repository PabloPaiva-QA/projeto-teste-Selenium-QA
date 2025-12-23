package steps;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("que estou na página de login")
    public void acessarLogin() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.acessarPagina();
    }

    @When("realizo login com usuario {string} e senha {string}")
    public void realizarLogin(String user, String pass) {
        loginPage.realizarLogin(user, pass);
    }

    @Then("devo ver a página inicial")
    public void validarLogin() {
        Assertions.assertTrue(driver.getCurrentUrl().contains("inventory"));
    }
}
