package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgot {
       
	@FindBy(xpath="//label[text()='I remember my user ID']")private WebElement RememberuserID;
	@FindBy(xpath="//label[text()='I forgot my user ID']")private WebElement ForgotID;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement PAN;
	@FindBy(xpath="//label[text()='E-mail']")private WebElement Email;
	@FindBy(xpath="//label[text()='SMS']")private WebElement SMS;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']")private WebElement Textemail;
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement Reset;
	@FindBy(xpath="//a[contains(text(),'« Back to login')]")private WebElement BackToLogin;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	@FindBy(xpath="//img[@alt='Kite Android']")private WebElement Playstore;
	@FindBy(xpath="//img[@alt=\"Kite iOS\"]")private WebElement AppleStore;
	@FindBy(xpath="//img[@alt='Zerodha']")private WebElement ZerodhaLink;
	@FindBy(xpath="//input[@placeholder='User ID']")private WebElement UserID;
	@FindBy(xpath="//input[@placeholder=\"Mobile number (as on account)\"]")private WebElement Mobilenumber;
	@FindBy(xpath="//input[@placeholder='Captcha']")private WebElement captcha;
	@FindBy(xpath="//a[contains(text(),'« Back to login')]")private WebElement Backtologin;
	
	public ZerodhaForgot(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void ClickOnRememberuserID() {
		RememberuserID.click();
	}
	public void ClickOnForgotID() {
		ForgotID.click(); 
	}
	public void EnterPANnumber(String PANnumber) {
		PAN.sendKeys(PANnumber);
	}
	public void ClickONEmail() {
		Email.click();
	}
	public void ClickOnSMS() {
		SMS.click();
	}
	public void EnetrEmail(String Email) {
		Textemail.sendKeys(Email);
	}
	public void ClickOnReset() {
		Reset.click();
	}
	public void ClickOnBacktologin() {
		BackToLogin.click();
	}
	public void ClickOnSignup() {
		signup.click();
	}
	public void EnterUserID(String ID) {
		UserID.sendKeys(ID);
	}
	public void EnterMobilenumber(String Mobile) {
		Mobilenumber.sendKeys(Mobile);
	}
	public void EnterCaptcha(String code) {
		captcha.sendKeys(code);
	}
	public void ClickOnBacktoLogin() {
		Backtologin.click();
	}
	
	
	
}
