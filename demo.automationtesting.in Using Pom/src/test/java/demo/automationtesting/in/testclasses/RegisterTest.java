package demo.automationtesting.in.testclasses;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demo.automationtesting.in.base.BaseClass;
import demo.automationtesting.in.pages.RegisterPage;
import demo.automationtesting.in.util.TestDataUtils;

public class RegisterTest extends BaseClass {

	RegisterPage registerPage;

	@BeforeMethod
	public void setup() {
		intilization();
		registerPage = new RegisterPage();
	}

	 @Test(priority=0)
	 public void registerPageTitleTest() {
	 String title = registerPage.validateRegisterTitle();
	 System.out.println("Title: "+title);
	 Assert.assertEquals(title, "Register");
	
	 }
	@DataProvider
	public Object[][] registrationData() throws Exception {
		Object[][] testObjArray = TestDataUtils.readExcel(System.getProperty("user.dir") + "/Utilities/TestData.xlsx","Register");
		return testObjArray;
	}

	@Test(priority = 1, dataProvider = "registrationData")
	public void testRegisterUser(String firstname, String lastname, String address, String emailid, String phone,
			String gender, String hobbies, String language, String skill) {
		registerPage.enterFirstName(firstname);
		registerPage.enterLastName(lastname);
		registerPage.enterAddress(address);
		registerPage.enterEmail(emailid);
		registerPage.enterPhone(phone);
		registerPage.selectGender(gender);
		registerPage.selectHobbies(hobbies);
		registerPage.selectLanguages(language);
		registerPage.selectSkill(skill);

	}
}
