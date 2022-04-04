package yandexmarket.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Autorization {
    private WebDriver driver;

    public Autorization(WebDriver driver) {
        this.driver = driver;
    }

    private By login = By.xpath("//*[@id=\"passp-field-login\"]");
    public void login() {
        driver.findElement(login).sendKeys("babijdiana@yandex.by");
    }
    private By loginClick = By.xpath("//*[@id=\"passp:sign-in\"]");
    public void loginClickButton(){
        driver.findElement(loginClick).click();
    }
    private By passwordIn = By.xpath("//*[@id=\"passp-field-passwd\"]");
    public void passwordInput(){
        driver.findElement(passwordIn).sendKeys("diana020902");
    }
    private By passwordClick = By.xpath("//*[@id=\"passp:sign-in\"]");
    public void passwordClickButton(){
        driver.findElement(passwordClick).click();
    }
}
