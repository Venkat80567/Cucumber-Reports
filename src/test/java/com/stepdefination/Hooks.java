package com.stepdefination;

import com.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends BaseClass {
	
	@Before
	public void beforeExecution() {
		launchBrowser();
		maximize();
		waits();
		loadUrl("https://www.facebook.com/");

	}
	
	
	@After
	public void afterExecution() {
		quit();

	}

}
