package yandexmarket.project.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.framework.Browser;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private ConfigFileReader configFileReader=ConfigFileReader.configFileReader;

    @BeforeMethod
    public void before() {
        System.setProperty(configFileReader.getDriverAdapter(),configFileReader.getDriverPath());
        WebDriver driver= Browser.getDriver();
        driver.manage().timeouts().implicitlyWait(10,
                TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}

