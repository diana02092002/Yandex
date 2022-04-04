package yandexmarket.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import yandexmarket.Utils.ConfigFileReader;

public class Autorization {
    private ConfigFileReader configFileReader=ConfigFileReader.configFileReader;
    private WebDriver driver;


    public Autorization(WebDriver driver) {
        this.driver = driver;
    }


    private By login = By.xpath("//*[@id=\"passp-field-login\"]");
    public void login() {
        driver.findElement(login).sendKeys(configFileReader.getLogin());
    }
    private By loginClick = By.xpath("//*[@id=\"passp:sign-in\"]");
    public void loginClick(){
        driver.findElement(loginClick).click();
    }
    private By password = By.xpath("//*[@id=\"passp-field-passwd\"]");
    public void password(){
        driver.findElement(password).sendKeys(configFileReader.getPassword());
    }
    private By passwordClick = By.xpath("//*[@id=\"passp:sign-in\"]");
    public void passwordClick(){
        driver.findElement(passwordClick).click();
    }
}


