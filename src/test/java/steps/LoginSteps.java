package steps;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("que estou na página de login")
    public void acessarLogin() {
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