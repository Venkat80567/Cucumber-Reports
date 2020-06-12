package com.stepdefination;

import com.base.BaseClass;
import com.pojo.LoginTextPropertyPoja;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.Background;
import junit.framework.Assert;

public class HomePageStep extends BaseClass{
	

@When("user enters the invalid {string} and {string}")
public void user_enters_the_invalid_and(String username, String password) {
	LoginTextPropertyPoja lp=new LoginTextPropertyPoja();
	fill(lp.getTxtUsername(), username);
	fill(lp.getTxtPass(), password);
	
}

@When("user click the login button")
public void user_click_the_login_button() {
	LoginTextPropertyPoja lp=new LoginTextPropertyPoja();
   click(lp.getButtonLogin());
}

@Then("user verifies the error message")
public void user_verifies_the_error_message() {
 System.out.println("verified");
 
}

@When("user get the text properties of create an account")
public void user_get_the_text_properties_of_create_an_account() {
	LoginTextPropertyPoja lp=new LoginTextPropertyPoja();
	fontSize(lp.getTxtProperty());
	fontColour(lp.getTxtProperty());
	fontWeight(lp.getTxtProperty());
	textAlign(lp.getTxtProperty());
	fontBackgroundColour(lp.getTxtProperty());
	
}

@Then("user verifies the text properties")
public void user_verifies_the_text_properties() {
	LoginTextPropertyPoja lp=new LoginTextPropertyPoja();
  
	System.out.println(fontSize(lp.getTxtProperty()));
	System.out.println(fontColour(lp.getTxtProperty()));
	System.out.println(fontWeight(lp.getTxtProperty()));
	System.out.println(textAlign(lp.getTxtProperty()));
	System.out.println(fontBackgroundColour(lp.getTxtProperty()));
}

@When("user get the no.of images")
public void user_get_the_no_of_images() {
   countOfImages();
}

@Then("user validate the no.of images in the homepage")
public void user_validate_the_no_of_images_in_the_homepage() {
   System.out.println(countOfImages());
   
}

}
