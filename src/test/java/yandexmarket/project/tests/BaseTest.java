package yandexmarket.project.tests;

import org.testng.annotations.BeforeMethod;
import yandexmarket.framework.Browser;

public class BaseTest {
    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MSI\\Downloads\\chromedriver_win32\\chromedriver.exe");
        Browser.getDriver().manage().window().maximize();
    }

}

