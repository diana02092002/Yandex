package yandexmarket.project.tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import yandexmarket.framework.Browser;
import yandexmarket.project.pages.Autorization;
import yandexmarket.project.pages.Catalog;
import yandexmarket.project.pages.WelcomePages;

public class MyTests extends BaseTest{
    @Test
    public void firstTest() throws InterruptedException {
        WebDriver driver = Browser.getDriver();
        driver.get("https://market.yandex.ru/?lr=213");
        Thread.sleep(Long.parseLong(("40000")));
        WelcomePages weclomePage = new WelcomePages( driver);
        weclomePage.clickSignIn();
        Autorization authorization = new Autorization( driver);
        authorization.login();
        Thread.sleep(4000);
        authorization.loginClickButton();
        Thread.sleep(4000);
        authorization.passwordInput();
        authorization.passwordClickButton();
        Thread.sleep(4000);
        Catalog catalog = new Catalog( driver);
        catalog.catalogClickButton();
        Thread.sleep(3000);
        catalog.catalogCountprint();
        catalog.sectionRandom();
    }
}
