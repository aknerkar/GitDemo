package TEST;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaBuySell;
import POM.ZerodhaHomepage;
import POM.ZerodhaLogin;
import POM.ZerodhaPin;
import Utility.Parametrization2;
import Utility.ScreenShot;
   
@Listeners(TestListeners.class)


public class ZPinPageTest extends BaseTest {
     
	
	
	@BeforeMethod
	public void browser() {
		 driver= Browser.OpenBrowser();
	} 
	
	@Test
	public void loginwithvalidcredential() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLogin zerodhalogin = new ZerodhaLogin(driver);
		String userID=Parametrization2.getData(0, 1);
		String password=Parametrization2.getData(1, 1);
		zerodhalogin.enterUserId(userID);
		zerodhalogin.enterPassword(password); 
		zerodhalogin.ClickOnLogin();  
		
		ZerodhaPin zerodhapin = new ZerodhaPin(driver);
		String pin1=Parametrization2.getData(2, 1);
		zerodhapin.enterpin(pin1,driver); 
		System.out.println(pin1);
		zerodhapin.ClickOnSubmit();
		
		Thread.sleep(2000);
		ZerodhaBuySell zerodhabuyshell = new ZerodhaBuySell(driver);
		String stock=Parametrization2.getData(3, 1);
		Thread.sleep(2000);
		zerodhabuyshell.SearchOnTab(stock);
		zerodhabuyshell.ClickOnBuy(driver);
		Thread.sleep(2000);
		zerodhabuyshell.ClickOnIntraday();
		zerodhabuyshell.ClickOnMarket();
		zerodhabuyshell.ClickOnFinalBuy();
	} 
	 @Test
	   public void ForgotButtontest() {
			 ZerodhaLogin zerodhalogin = new ZerodhaLogin(driver);	
			 zerodhalogin.ClickOnForgot();
		 }
	    @Test
	  public void SignupButtonTest() {
	    	 ZerodhaLogin zerodhalogin = new ZerodhaLogin(driver);	
	    	 zerodhalogin.ClickOnSignUp();
	    }
	
	
}
