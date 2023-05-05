package com.eurotech.saucedemoaqua.stepdefs;

import com.eurotech.saucedemoaqua.pages.LoginPage;
import com.eurotech.saucedemoaqua.pages.ProductsPage;
import com.eurotech.saucedemoaqua.utilities.ConfigurationReader;
import com.eurotech.saucedemoaqua.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {
    LoginPage loginPage=new LoginPage();
    ProductsPage productsPage=new ProductsPage();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user enters with {string} and {string}")
    public void theUserEntersWithAnd(String username, String password) {
        loginPage.login(username,password);



    }

    @Then("the user should be able to login successfully")
    public void theUserShouldBeAbleToLoginSuccessfully() {
        String expectedHeader="Products";
        String actualHeader=productsPage.header.getText();
        Assert.assertEquals(expectedHeader,actualHeader);
    }
}
