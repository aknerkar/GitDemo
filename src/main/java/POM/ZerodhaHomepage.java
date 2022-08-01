package POM;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ZerodhaHomepage {
      
	
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")private WebElement Dashboard;
	@FindBy(xpath="//span[contains(text(),'Orders')]")private WebElement Orders;
	@FindBy(xpath="//span[contains(text(),'Holdings')]")private WebElement Holding;
	@FindBy(xpath="//span[contains(text(),'Positions')]")private WebElement Position;
	@FindBy(xpath="//span[contains(text(),'Funds')]")private WebElement Fund;
	@FindBy(xpath="//button[contains(text(),'Add funds')]")private WebElement Addfund;
	@FindBy(xpath="//a[text()='Withdraw']")private WebElement Withdrawfund;
	@FindBy(xpath="//input[@type='number']")private WebElement AmountToWithdraw;
	@FindBy(xpath="//button[@type=\"button\"]")private WebElement ContinueWithdraw;
	@FindBy(xpath="//span[contains(text(),'Apps')]")private WebElement App;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[2]/a[1]/img[1]")private WebElement Kitelogo;
	@FindBy(xpath="//span[contains(text(),'OKP335')]")private WebElement Accountinfo;
	@FindBy(xpath="@FindBy(xpath=\"//span[contains(text(),'OKP335')]\")private WebElement Accountinfo;")private WebElement Myprofile;
	
	public ZerodhaHomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void ClickOnDashboard() {
		Dashboard.click();
	}
	public void ClickOnOrders() {
		Orders.click();
	}
	public void ClickOnHolding() {
		Holding.click();
	}
	public void ClickOnPosition() {
		Position.click();
	}
	public void ClickOnFund(WebDriver driver) throws InterruptedException {
		Fund.click();
		Thread.sleep(3000);
		Withdrawfund.click();
		Thread.sleep(3000);
		 ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
        int values = list.size();         
	for(int i=0;i<values;i++) {
			driver.switchTo().window(list.get(i));
		String currenttitle =	driver.getTitle();
		if(currenttitle.equals("Funds / Console")) {
			//AmountToWithdraw.sendKeys("10000");
			Thread.sleep(3000);
			ContinueWithdraw.click();
			}
	 }
		}
	public void ClickOnApp() {
		App.click();
	}
	public void ClickOnKiteLogo() {
		Kitelogo.click();
	}
	public void ClickOnAccountinfo(WebDriver driver) {
		Accountinfo.click();
		Actions ac = new Actions(driver);
		ac.moveToElement(Myprofile);
		ac.click().build().perform();
	}
	
	
	
	
	
	
	
}
