package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginTextPropertyPoja extends BaseClass {
	
	public  LoginTextPropertyPoja() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Create an account']")
	private WebElement txtProperty;
	
	@FindBy(id="email")
	private WebElement txtUsername;
	
	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(xpath="//label[@id='loginbutton']")
	private WebElement buttonLogin;
	
	
	public WebElement getButtonLogin() {
		return buttonLogin;
	}

	public WebElement getTxtProperty() {
		return txtProperty;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	
	
	


}
