package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarPagina() {
        driver.get("https://www.saucedemo.com/");
    }

    public void preencherUsuario(String usuario) {
        driver.findElement(usernameInput).sendKeys(usuario);
    }

    public void preencherSenha(String senha) {
        driver.findElement(passwordInput).sendKeys(senha);
    }

    public void clicarLogin() {
        driver.findElement(loginButton).click();
    }

    public void realizarLogin(String usuario, String senha) {
        preencherUsuario(usuario);
        preencherSenha(senha);
        clicarLogin();
    }
}