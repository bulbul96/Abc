package com.stepdef;

import org.openqa.selenium.support.PageFactory;

import com.common.Base;
import com.pageobjectmodel.PageObjectModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends Base {
	PageObjectModel m;
@Given("^go to homepage$")
public void go_to_homepage() throws Throwable {
 getdriver();
    m=PageFactory.initElements(driver, PageObjectModel.class);
}

@When("^user enters valid user name$")
public void user_enters_valid_user_name() throws Throwable {
 m.getEmail().sendKeys("himu1125@hotmail.com");
    Thread.sleep(3000);
}

@When("^user enters a valid password$")
public void user_enters_a_valid_password() throws Throwable {
 m.getPassword().sendKeys("lana@6249");
    
}

@When("^also user able to click login button$")
public void also_user_able_to_click_login_button() throws Throwable {
 m.getLogin().click();
    
}

@Then("^user login successfully$")
public void user_login_successfully() throws Throwable {
 
    
}
}
