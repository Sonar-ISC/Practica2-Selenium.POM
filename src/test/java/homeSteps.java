
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class homeSteps extends Base{
    @Test
    public void testLogin() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage loginPage = new loginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        Thread.sleep(2000);
        homePage homePage = new homePage(driver);
        homePage.home();
        Thread.sleep(2000);}

    }


}
