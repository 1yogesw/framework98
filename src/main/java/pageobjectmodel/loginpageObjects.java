package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpageObjects {
  // framework
	public WebDriver driver; // This driver don't have scope

	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@name='Login']");
	private By tryForFree = By.xpath("//a[@id='signup_link']");
	private By errorMessage = By.xpath("//div[@id='error']");

	public loginpageObjects(WebDriver driver) {
	  
	  this.driver=driver;
	  
	 }

	public WebElement enterUsername() {
		return driver.findElement(username);

	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}

	public WebElement clickOntryForFree() {
		return driver.findElement(tryForFree);
	}

	public WebElement errorMessage() {
		return driver.findElement(errorMessage);
	}

}
