package test;

import listener.TestNGListener;
import org.testng.annotations.Test;
import pages.HomePage;

public class DemoTest extends TestNGListener {
    private HomePage homePage;

    public DemoTest(){
        super();
    }

    @Test(description = "Get 10 counter and descending")
    public void demoTest(){
        homePage = new HomePage(action);
        homePage.getGroupItems();
        homePage.descendItem();
    }
}
