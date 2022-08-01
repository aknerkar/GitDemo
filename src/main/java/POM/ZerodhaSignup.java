package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignup {
       
	@FindBy(xpath="//input[@id='user_mobile']")private WebElement Mobilenumber;
	@FindBy(xpath="//button[@id='open_account_proceed_form']")private WebElement Continue;
	@FindBy(xpath="//a[contains(text(),'Want to open an NRI account?')]")private WebElement NRIacc;
	
	public ZerodhaSignup(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void EnterMOBnumber(String number) {
		Mobilenumber.sendKeys(number);
	}
	public void EnterContinue() {
		Continue.click();
	}
	public void EnterNRI() {
		NRIacc.click();
	} 
	
	
	
	
	
}
