package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLogin {
     
	@FindBy(xpath="//input[@id='userid']") private WebElement UserID;
	@FindBy(xpath="//input[@id='password']") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement Login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']") private WebElement Forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement SignUp;
	
	public ZerodhaLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterUserId(String user) {
		UserID.sendKeys(user);
	}
	public void enterPassword(String pass) {  
		Password.sendKeys(pass);
	} 
	public void ClickOnLogin() {
		Login.click();  
	}
	public void ClickOnForgot() {
		Forgot.click();
	}
	public void ClickOnSignUp() {
		SignUp.click(); 
	}
	
	
	
}
