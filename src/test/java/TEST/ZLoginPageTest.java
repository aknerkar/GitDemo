package TEST;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaForgot;
import POM.ZerodhaLogin;
import POM.ZerodhaSignup;
import Utility.Parametrization2;
import Utility.ScreenShot;
    
@Listeners(TestListeners.class)

public class ZLoginPageTest extends BaseTest{
	
	
	@BeforeMethod
	public void browser() {
		 driver= Browser.OpenBrowser();
	} 
	@Test(priority=1)
	public void loginwithvalidcredential() throws EncryptedDocumentException, IOException {
		ZerodhaLogin zerodhalogin = new ZerodhaLogin(driver);
		String userID=Parametrization2.getData(0, 1);
		String password=Parametrization2.getData(1, 1);
		zerodhalogin.enterUserId(userID);
		zerodhalogin.enterPassword(password); 
		zerodhalogin.ClickOnLogin();  
	}  
	 @Test(priority=3)
   public void ForgotButtontest1() {
		 ZerodhaLogin zerodhalogin = new ZerodhaLogin(driver);	
		 zerodhalogin.ClickOnForgot();
		 ZerodhaForgot zerodhaforgot = new ZerodhaForgot(driver);
		 zerodhaforgot.ClickOnForgotID();
		 zerodhaforgot.ClickOnRememberuserID();
		 zerodhaforgot.EnterUserID("UAQW12");
		 zerodhaforgot.EnterPANnumber("AXOPN3745N");
		 zerodhaforgot.ClickOnSMS();
		 zerodhaforgot.EnterMobilenumber("7385615712");
		 zerodhaforgot.EnterCaptcha("789654");
		 zerodhaforgot.ClickOnReset();
		 //zerodhaforgot.ClickOnBacktologin();
	 }
    @Test(priority=2)
  public void SignupButtonTest() {
    	 ZerodhaLogin zerodhalogin = new ZerodhaLogin(driver);	
    	 zerodhalogin.ClickOnSignUp();
    	
    }
    @Test
    public void ForgotButtontest2() {
 		 ZerodhaLogin zerodhalogin = new ZerodhaLogin(driver);	
 		zerodhalogin.ClickOnForgot();
 		ZerodhaForgot zerodhaforgot = new ZerodhaForgot(driver);
 		zerodhaforgot.ClickOnForgotID();
 		zerodhaforgot.EnterPANnumber("AXOPN3745N");
 		zerodhaforgot.ClickONEmail();
 		zerodhaforgot.EnetrEmail("akshaynerkar20@gmail.com");
 		zerodhaforgot.EnterCaptcha("789654");
 		zerodhaforgot.ClickOnReset(); 
 		//zerodhaforgot.ClickOnBacktologin();
 		  }
   
	}
    
    
    
	
	
	
	
	

