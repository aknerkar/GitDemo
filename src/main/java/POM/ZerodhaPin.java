package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ZerodhaPin {

	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement submit;
	@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement Forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	
	public ZerodhaPin(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
     public void enterpin(String pinNumber,WebDriver driver) {
    	 FluentWait<WebDriver> wait = new  FluentWait<WebDriver>(driver);
    	 wait.withTimeout(Duration.ofMillis(50000));
    	 wait.pollingEvery(Duration.ofMillis(5000));
    	 wait.ignoring(Exception.class);
    	 wait.until(ExpectedConditions.visibilityOf(pin));
    	pin.sendKeys(pinNumber);
     }
	public void ClickOnSubmit() {
		submit.click();
	}
	public void ClickOnForgot() {
		Forgot.click();
	}
	public void ClickOnsignup() {
		signup.click();
	} 
	
		
	
	
}