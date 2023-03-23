package eu.lorin.sklep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    private WebDriver driver;

    @FindBy(xpath = "//div[@class='boxhead']//span[text()='Panel klienta']")
    private WebElement panelKlienta;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public WebElement validInfo(){
        return panelKlienta;
    }
}
