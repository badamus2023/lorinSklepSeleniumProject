package eu.lorin.sklep.test;

import eu.lorin.sklep.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void loginWithInValidData() {
        WebElement error = new HomePage(driver)
                .loginToPage()
                .loginWithInValidData("bartosz.barbara@gmail.com","QWERTY123123")
                .getError();

        Assert.assertTrue(error.isDisplayed());
        Assert.assertTrue(error.getText().contains("Niepoprawne dane logowania."));
    }

    @Test
    public void loginWithValidData() {
        WebElement validInfo = new HomePage(driver)
                .loginToPage()
                .loginWithValidData("bartosz.adamus321@gmail.com", "Qwerty123")
                .validInfo();
        Assert.assertTrue(validInfo.isDisplayed());
        Assert.assertTrue(validInfo.getText().contains("Panel"));
    }
}
