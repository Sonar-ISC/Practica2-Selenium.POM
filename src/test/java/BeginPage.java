import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BeginPage {

    private WebDriver driver;

    public By AddCart1 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"] ");
    public By AddCart2 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
    public By AddCart3 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");

    public By Cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public BeginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(String username, String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(AddCart1));
        WebElement AddCart1 = driver.findElement(AddCart1);
        AddCart1.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(AddCart2));
        WebElement AddCart2 = driver.findElement(AddCart2);
        AddCart2.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(AddCart3));
        WebElement AddCart3 = driver.findElement(AddCart3);
        AddCart3.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(Cart));
        WebElement Cart = driver.findElement(Cart);
        Cart.click();
    }
}
