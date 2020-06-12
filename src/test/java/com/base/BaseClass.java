package com.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\home\\eclipse-workspace\\Try\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void fill(WebElement w, String value) {
		w.sendKeys(value);

	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void click(WebElement w) {
		w.click();

	}
	
	public static String currentURL() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public static String fontSize(WebElement w) {
		String fontSize = w.getCssValue("font-size");
		return fontSize;

	}
	
	public static String fontColour(WebElement w) {
		String color = w.getCssValue("color");
		return color;

	}
	public static String fontBackgroundColour(WebElement w) {
		String backgroundColour = w.getCssValue("background-color");
		return backgroundColour;
		
	}
	public static String textAlign(WebElement w) {
		String textalign = w.getCssValue("text-align");
		return textalign;
	
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static String fontWeight(WebElement w) {
		String fontWeight = w.getCssValue("font-weight");
		return fontWeight;
		

	}
	
	public static int countOfImages() {
		List<WebElement> images = driver.findElements(By.tagName("img"));
		int count = images.size();
		return count;
	}
	
	public static void waits() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	
	
	public static void quit() {
		driver.quit();

	}
}
