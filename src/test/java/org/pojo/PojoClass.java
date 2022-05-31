package org.pojo;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{
	
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[contains(@class,'popup__close')]")
	private WebElement popUpClose;

	@FindBy(xpath = "//div[text()='Cancel Request']")
	private WebElement cancelRequestButton;

	@FindBy(xpath = "//div[contains(@class,'clearfix')]//input[contains(@name,'input')]")
	private WebElement cityText;
	
	@FindBy (xpath = "//div[contains(@class,'angucomplete-dropdown')]//child::b")
	private List<WebElement> allCitys;
	
	@FindBy(xpath = "//div[contains(@class,'clearfix')]//button[contains(text(),'Go')]")
	private WebElement goButton;
	
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath = "//div[contains(text(),'things')]/following::label//child::div[contains(@class,'checkbox')]")
	private List<WebElement> allThings;
	
	@FindBy(xpath = "//div[contains(text(),'need')]/following::label//child::div[contains(@class,'checkbox')]")
	private List<WebElement> allNeeds; 
	
	@FindBy(xpath = "//div[contains(text(),'problem(s)')]/following::label//child::div[contains(@class,'checkbox')]")
	private List<WebElement> allProblems; 
	
	@FindBy(xpath = "//div[contains(@class,'commonFormTitle')]")
	private WebElement msgTitle;
	
	@FindBy (xpath = "//button[text()='Skip']")
	private WebElement skipButton;
	
	@FindBy (xpath = "//div[contains(text(),'plumbing')]/following::label//child::input[contains(@type,'radio')]//following-sibling::div[contains(@class,'icon')]")
	private List<WebElement> allDates;
	
	@FindBy (xpath = "//div[contains(text(),'notify you about new quotes')]")
	private WebElement emailTitle;
	
	public WebElement getEmailTitle() {
		return emailTitle;
	}

	@FindBy (xpath = "//input[contains(@placeholder,'Email address')]")
	private WebElement textEmail;
	
	@FindBy (xpath = "//input[@name='PHONE_NUMBER']")
	private WebElement phNumField;

	public WebElement getCityText() {
		return cityText;
	}

	public WebElement getTextEmail() {
		return textEmail;
	}

	public WebElement getGoButton() {
		return goButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public List<WebElement> getAllThings() {
		return allThings;
	}

	public List<WebElement> getAllNeeds() {
		return allNeeds;
	}

	public List<WebElement> getAllProblems() {
		return allProblems;
	}

	public WebElement getMsgTitle() {
		return msgTitle;
	}

	public WebElement getSkipButton() {
		return skipButton;
	}

	public List<WebElement> getAllDates() {
		return allDates;
	}

	public WebElement getPhNumField() {
		return phNumField;
	}

	public WebElement getPopUpClose() {
		return popUpClose;
	}

	public WebElement getCancelRequestButton() {
		return cancelRequestButton;
	}

	public List<WebElement> getAllCitys() {
		return allCitys;
	}
	
	

}
