import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class loginPage{
    private WebDriver driver;

    public By usernameInput = By.xpath("//*[@id=\"user-name\"]");
    public By passwordInput = By.xpath("//*[@id=\"password\"]");

    public By loginButton = By.xpath("//*[@id=\"login-button\"]");

    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(String username, String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInput));
        WebElement usernameElement = driver.findElement(usernameInput);
        usernameElement.sendKeys(username);

        WebElement passwordElement = driver.findElement(passwordInput);
        passwordElement.sendKeys(password);

        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
    }



}
