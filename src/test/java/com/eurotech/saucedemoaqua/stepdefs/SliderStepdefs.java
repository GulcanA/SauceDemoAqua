package com.eurotech.saucedemoaqua.stepdefs;

import com.eurotech.saucedemoaqua.pages.DemoqaSliderPage;
import com.eurotech.saucedemoaqua.utilities.ConfigurationReader;
import com.eurotech.saucedemoaqua.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SliderStepdefs {

    DemoqaSliderPage demoqaSliderPage=new DemoqaSliderPage();

    @Given("the user is on the slider page")
    public void the_user_is_on_the_slider_page() {
        Driver.get().get(ConfigurationReader.get("url1"));

    }
    @When("the user moves the slider to {int}")
    public void the_user_moves_the_slider_to(Integer targetSliderRange) {

        // 1.way
        Actions move = new Actions(Driver.get());
         move.dragAndDropBy(demoqaSliderPage.inputSliderValue2, 10, 0).perform();

        //2.way
//        for (int i = 1; i <= 50 ; i++) {
//            demoqaSliderPage.inputSliderValue2.sendKeys(Keys.ARROW_RIGHT);
//        }

        System.out.println("slider value = " + demoqaSliderPage.inputSliderValue.getAttribute("value"));

    }
    @Then("the slider should be ranged at {int}")
    public void the_slider_should_be_ranged_at(Integer int1) {

    }
}
