package eu.lorin.sklep.test;

import eu.lorin.sklep.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://sklep.lorin.eu/");
    }

    @AfterMethod
    public void teardown() {
        //driver.quit();
    }
}
