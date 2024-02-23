package demo.automationtesting.in.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import demo.automationtesting.in.base.BaseClass;

public class RegisterPageUsingPageFactory extends BaseClass {
	By firstName = By.xpath("//*[@id='basicBootstrapForm']//input");
	By lastName = By.xpath("//input[@placeholder='Last Name']");
	By address = By.xpath("//*[@id='basicBootstrapForm']//textarea");
	By emailid = By.xpath("//*[@id='eid']//input");
	By phone = By.xpath("//*[@id='basicBootstrapForm']/div[4]//input");

}
