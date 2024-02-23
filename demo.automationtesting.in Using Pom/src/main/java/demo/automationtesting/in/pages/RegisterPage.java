package demo.automationtesting.in.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.automationtesting.in.base.BaseClass;
import demo.automationtesting.in.util.ActionClass;

public class RegisterPage extends BaseClass {

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement lastName;

	@FindBy(xpath = "//*[@id='basicBootstrapForm']//textarea")
	WebElement address;

	@FindBy(xpath = "//*[@id='eid']//input")
	WebElement emailid;

	@FindBy(xpath = "//*[@id='basicBootstrapForm']/div[4]//input")
	WebElement phone;

	@FindBy(xpath = "//input[@name='radiooptions']")
	List<WebElement> genderList;

	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> hobbiesList;

	@FindBy(xpath = "//div[@id='msdd']")
	WebElement languagesBox;

	@FindBy(xpath = "//ul[contains(@class,'ui-corner-all' )]//a")
	List<WebElement> languagesMenus;

	@FindBy(xpath = "//select[@id='Skills']")
	WebElement skill;

	@FindBy(xpath = "//select[@id='countries']")
	WebElement country;

	@FindBy(xpath = "//span[@class='selection']")
	WebElement selectCountry;

	@FindBy(xpath = "//li[@class='select2-results__option']")
	List<WebElement> selectCountryMenu;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateRegisterTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}

	public void enterFirstName(String text) {
		ActionClass.sendKeys(firstName, text);
	}

	public void enterLastName(String text) {
		ActionClass.sendKeys(lastName, text);
	}

	public void enterAddress(String text) {
		ActionClass.sendKeys(address, text);
	}

	public void enterEmail(String text) {
		ActionClass.sendKeys(emailid, text);
	}

	public void enterPhone(String text) {
		ActionClass.sendKeys(phone, text);
	}

	public void selectGender(String text) {
		ActionClass.clickOnRadioButton(genderList, text);
	}

	public void selectHobbies(String text) {
		ActionClass.clickOnCheckBox(hobbiesList, text);
	}

	public void selectLanguages(String text) {
		ActionClass.selectFromDropdownList(languagesBox, languagesMenus, text);
	}

	public void selectSkill(String text) {
		ActionClass.selectByVisibleText(skill, text);
	}

}
