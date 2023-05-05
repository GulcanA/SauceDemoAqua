package com.eurotech.saucedemoaqua.pages;


import com.eurotech.saucedemoaqua.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
public abstract class BasePage {
    public BasePage(){

        PageFactory.initElements(Driver.get(),this);
    }

}
