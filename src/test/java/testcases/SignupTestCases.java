package testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;
import Resources.commonmethod;
import Resources.constants;
import pageobjectmodel.SignupPageObjects;
import pageobjectmodel.loginpageObjects;

public class SignupTestCases extends BaseClass {
	@Test
	public void verifySignup() throws IOException, InterruptedException {

		loginpageObjects lpo = new loginpageObjects(driver);
		lpo.clickOntryForFree().click();

		SignupPageObjects spo = new SignupPageObjects(driver);

		Thread.sleep(5000);
		spo.enterFirstName().sendKeys(constants.firstName);

		spo.enterLastName().sendKeys(constants.lastName);

		spo.enterJobTitle().sendKeys(constants.jobTitle);

		spo.clickOnNextButton().click();

		commonmethod.selectDropdown(spo.selectEmployees(), 2); // employee dropdown

		spo.enterCompanyName().sendKeys("test");
		commonmethod.selectDropdown(spo.selectCountry(), 4);
		// commonMethods.selectDropdownWithVisbleTExt(spo.selectCountry(), "India");
		spo.clickOnNextButton().click();

		commonmethod.verifyAssertions(spo.signupPageConfirmation(), constants.expectedTextSignupText,
				"Valid signup text is not showing");

	}

}