package com.eurotech.saucedemoaqua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://www.saucedemo.com/
public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement inputPassword;

    @FindBy(css = "#login-button")
    public WebElement inputLoginButton;

    public void login(String username,String password)
    {
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        inputLoginButton.click();
    }
    
    


}