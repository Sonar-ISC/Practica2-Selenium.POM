import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class homePage {
    private WebDriver driver;

    public By buttonAgregarBackpack = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    public By buttonAgregarLight = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");

    public By buttonShopCar = By.xpath("//*[@class=\"shopping_cart_link\"]");

    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public void home() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.urlContains("inventory.html"));

        WebElement buttonAgregarBackpackElement = driver.findElement(buttonAgregarBackpack);
        buttonAgregarBackpackElement.click();

        WebElement buttonAgregarLightElement = driver.findElement(buttonAgregarLight);
        buttonAgregarLightElement.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonShopCar));
        WebElement buttonShopCarElement = driver.findElement(buttonShopCar);
        buttonShopCarElement.click();

    }
}