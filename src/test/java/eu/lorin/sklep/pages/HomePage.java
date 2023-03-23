package eu.lorin.sklep.pages;

import eu.lorin.sklep.test.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    @FindBy(xpath = "//a[@class='login']")
    private WebElement login;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public LoginPage loginToPage() {
        login.click();
        return new LoginPage(driver);
    }
}
