package org.step;

import java.awt.AWTException;
import java.awt.Robot;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pojo.PojoClass;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef extends BaseClass{
	public  PojoClass pj;

	@Given("Im launching the browser and hitting the URL")
	public void im_launching_the_browser_and_hitting_the_url() {
	    browserLaunch();
	    urlLaunch("https://www.starofservice.in/dir/telangana/hyderabad/hyderabad/plumbing#/form/plumbing");
	    pj = new PojoClass();
	    implicityWait();
	    maxBrowser();
		
	}
	@When("Im entering the location")
	public void im_entering_the_location(io.cucumber.datatable.DataTable d) {
		buttonClick(pj.getPopUpClose());
		buttonClick(pj.getCancelRequestButton());
		clearText(pj.getCityText());
		fillText(pj.getCityText(), d.asList().get(0));
		buttonClick(pj.getAllCitys().get(0));
		screenShot("City Name Entered");
		
	    
	}
	
	@When("Im selecting first checkbox\\/radio button and clicking next")
	public void im_selecting_first_checkbox_radio_button_and_clicking_next() throws InterruptedException {
		
		buttonClick(pj.getNextButton());
	    buttonClick(pj.getAllThings().get(0));
	    screenShot("Selected the Problem things");
	    buttonClick(pj.getNextButton());
	    buttonClick(pj.getAllNeeds().get(0));
	    screenShot("Selected the Service required");
	    buttonClick(pj.getNextButton());
	    buttonClick(pj.getAllProblems().get(0));
	    screenShot("Selected the Problem facing");
	    buttonClick(pj.getNextButton());
	    
	}
	@When("Im clicking SKIP button in the question page")
	public void im_clicking_skip_button_in_the_question_page() {
		Assert.assertTrue(pj.getMsgTitle().getText().contains("Plumber needs to know"));
		screenShot("Presence of Title");
		buttonClick(pj.getSkipButton());
		
	}
	@When("Im selecting date")
	public void im_selecting_date() {
	    buttonClick(pj.getAllDates().get(0));
	    screenShot("Selected the Date");
	    buttonClick(pj.getNextButton());
	}
	
	@When("Im entering email-id")
	public void im_entering_email_id(io.cucumber.datatable.DataTable d) {
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.textToBePresentInElement(pj.getEmailTitle(), "Where would you like us to notify you about new quotes received on your request?"));
				
	  fillText(pj.getTextEmail(), d.asList().get(0));
	  screenShot("Entered the Email ID");
	  buttonClick(pj.getNextButton());
	  browserClose();
	}
	
	

	
}
