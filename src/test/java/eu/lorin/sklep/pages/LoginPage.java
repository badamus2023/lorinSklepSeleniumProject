package eu.lorin.sklep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

        @FindBy(id="mail_input_long")
        private WebElement loginEmailInput;

        @FindBy(id="pass_input_long")
        private WebElement loginPasswordInput;

        @FindBy(xpath = "//button[@class='btn btn-red login']")
        private WebElement loginButton;

        @FindBy(xpath = "//p[contains(text(),'Niepoprawne dane logowania.')]")
        private WebElement error;

        @FindBy(xpath = "//a[@class='myaccount']")
        private WebElement myAccountLink;

        public LoginPage(WebDriver driver) {
                PageFactory.initElements(driver,this);
                this.driver = driver;
            }
        public MyAccountPage loginWithValidData(String email,String password) {
            loginUser(email,password);
            myAccountLink.click();
            return new MyAccountPage(driver);
        }

        public LoginPage loginWithInValidData(String email,String password) {
            loginUser(email, password);
            return this;
        }

        public WebElement getError() {
            return error;
        }

        private void loginUser(String email,String password ) {
            loginEmailInput.sendKeys(email);
            loginPasswordInput.sendKeys(password);
            loginButton.click();
        }

    }
