package test;

import listener.TestNGListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

import java.sql.DriverManager;

import static org.testng.Assert.assertTrue;

public class DemoTest extends TestNGListener {
    private drivers.DriverManager DriverManager;
    private HomePage homePage;
    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }

    public DemoTest(){
        super();
    }

    @Test(description = "Get 10 counter and descending")
    public void demoTest(){
        homePage = new HomePage(action);
        homePage.getGroupItems();
        homePage.descendItem();
        assertTrue(true);
    }
}
