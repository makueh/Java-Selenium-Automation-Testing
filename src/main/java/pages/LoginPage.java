package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import application.Driver;
import constant.IConstant;

public class LoginPage {
			
	WebDriver driver = Driver.getInstance().getDriver();
	
	By username = By.id("login-email");
	By password = By.id("login-password-input");
	By loginButton = By.className("submit");
	
	public void loginToPage() {
		
		driver.get(IConstant.LOGIN_PAGE_URL);
		typeUserName();
		typePassword();
		clickLoginButton();
	}
	
	public void typeUserName() {
		
		driver.findElement(username).sendKeys(IConstant.USERNAME);
	}
	
	public void typePassword() {
		
		driver.findElement(password).sendKeys(IConstant.PASSWORD);
	}

	public void clickLoginButton() {
		
		driver.findElement(loginButton).click();
	}

}
