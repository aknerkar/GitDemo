package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     
	@FindBy(xpath ="//input[@id='email']") private WebElement email;
	@FindBy(xpath ="//input[@id='pass']") private WebElement password;
	@FindBy(xpath ="//button[@name=\"login\"]") private WebElement login;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void enterEmail(String emailaddress) {
		email.sendKeys(emailaddress);
	} 
	public void enterPassword(String pass) {
		password.sendKeys(pass); 
	}
	public void clickOnlogin() {
		login.click();
	}
	
}
