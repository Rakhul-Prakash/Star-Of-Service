package org.base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static TakesScreenshot tk;
	
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	public static void fillText(WebElement ele, String text) {
		ele.sendKeys(text);
	}
	
	public static void buttonClick(WebElement ele) {
		ele.click();
	}
	
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public static void maxBrowser() {
		driver.manage().window().maximize();

	}
	
	public static void clearText(WebElement ele) {
		ele.clear();
		
	}
	
	public static void browserClose() {
		driver.quit();
		
	}
	
	public static void screenShot(String fileName) {

	tk = (TakesScreenshot) driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File des = new File("D:\\Eclipse\\StarService\\target"+fileName+".png");
}
}
	

