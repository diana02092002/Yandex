package yandexmarket.project.tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.framework.Browser;
import yandexmarket.project.pages.Autorization;
import yandexmarket.project.pages.Catalog;
import yandexmarket.project.pages.WelcomePages;

public class MyTests extends BaseTest{
    private ConfigFileReader configFileReader=ConfigFileReader.configFileReader;
    @Test
    public void firstTest() throws InterruptedException {

        WebDriver driver = Browser.getDriver();
        driver.get(configFileReader.getApplicationUrl());
        WelcomePages weclomePage = new WelcomePages( driver);
        weclomePage.clickSignIn();
        Autorization authorization = new Autorization( driver);
        authorization.login();
        authorization.loginClick();
        authorization.password();
        authorization.passwordClick();
        Catalog catalog = new Catalog( driver);
        catalog.catalogClick();
        catalog.catalogCountprint();
        catalog.sectionRandom();
    }
}
