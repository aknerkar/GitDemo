package TEST;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POJO.Browser;
import POM.YouTubePracticepage;

@Listeners(TestListeners.class)
public class TestYoutubepage extends BaseTest {
     
	
	@BeforeMethod
	public void browser() {
		 driver= Browser.OpenBrowser();
	} 
	
	@Test
	public void TestAlertOperation() {
		YouTubePracticepage youtube = new YouTubePracticepage(driver);
		youtube.ClickOnAlert(driver);
		 Alert a = driver.switchTo().alert();
		 a.accept();
		}
	@Test
	public void TestSearchFeild() {
		YouTubePracticepage youtube = new YouTubePracticepage(driver);
		youtube.Textfield(driver);
	   }
	@Test
	public void CheckTitleLogo() {
		String expectedresult = "Automation Testing Practice";
		String actualresult = driver.getTitle();
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(expectedresult, actualresult);
		
	    WebElement searchicon =	driver.findElement(By.xpath("//img[@class='wikipedia-icon']"));
	    assertion.assertTrue(searchicon.isDisplayed());
	    assertion.assertAll();
	}
	@Test
	public void FrameTest() {
		YouTubePracticepage youtube = new YouTubePracticepage(driver);
		youtube.SwitchToFrame(driver);
		Actions action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement text1 =	driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']"));
		text1.sendKeys("Akshay");
		action.sendKeys(Keys.TAB);
		action.sendKeys("Nerkar");
		action.sendKeys(Keys.TAB);
		action.sendKeys("7385615712");
		action.sendKeys(Keys.TAB);
		action.sendKeys("India");
		action.sendKeys(Keys.TAB);
		action.sendKeys("Malegaon");
		action.sendKeys(Keys.TAB);
		action.sendKeys("akshaynerkar20@gmail.com");
		action.build().perform();	
		

		 WebElement drop =	driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']"));
		 Select select = new Select(drop);
		 select.selectByVisibleText("Morning");
		 
		 driver.findElement(By.xpath("//input[@class='submit_button']")).click();
	}
	@Test
	public void DropdownTest() {
		YouTubePracticepage youtube = new YouTubePracticepage(driver);
		youtube.DropDown();
	}
	@Test
	public void FetchTableData() {
	WebElement table =	driver.findElement(By.xpath("//table//tbody//tr[4]//td[3]"));
     String name =	table.getText();
     System.out.println(name);
	}
	@Test
	public void TestDoubleClick() {
		YouTubePracticepage youtube = new YouTubePracticepage(driver);	
		youtube.CheckDoubleClick(driver);
	}
	
	
	
}
