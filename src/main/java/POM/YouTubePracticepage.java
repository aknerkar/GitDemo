package POM;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class YouTubePracticepage {
	
      @FindBy(xpath ="//button[text()='Click Me']") private WebElement alertoperation;
      @FindBy(xpath ="//input[@id='Wikipedia1_wikipedia-search-input']") private WebElement Searchtext;
      @FindBy(xpath ="//input[@type='submit']") private WebElement SearchButton; 
      @FindBy(xpath ="//div[@id='Wikipedia1_wikipedia-search-results']") private WebElement SearchResult;
      @FindBy(xpath ="//a[contains(text(),'More »')]") private WebElement ClickOnMore;
      @FindBy(xpath ="//iframe[@id='frame-one1434677811']") private WebElement iframe;
      @FindBy(xpath ="//select[@id='speed']") private WebElement DSpeed;
      @FindBy(xpath ="//select[@id='files']") private WebElement DFile;
      @FindBy(xpath ="//select[@id='number']") private WebElement DNumber;
      @FindBy(xpath ="//select[@id='products']") private WebElement DProduct;
      @FindBy(xpath ="//select[@id='animals']") private WebElement DAnimal;
      @FindBy(xpath ="//button[contains(text(),'Copy Text')]") private WebElement DoubleClick;
      
	
	public YouTubePracticepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void ClickOnAlert(WebDriver driver) {
		alertoperation.click();
		}
	public void Textfield(WebDriver driver) {
		Searchtext.sendKeys("T-shirts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		SearchButton.click();
		
		SearchResult.click();
		ClickOnMore.click();
	}
	public void SwitchToFrame(WebDriver driver) {
		driver.switchTo().frame(iframe);
	}
	public void DropDown() {
		Select SL1 = new Select(DSpeed);
		Select SL2 = new Select(DFile);
		Select SL3 = new Select(DNumber);
		Select SL4 = new Select(DProduct);
		Select SL5 = new Select(DAnimal);
		
		SL1.selectByVisibleText("Medium");
		SL2.selectByVisibleText("DOC file");
		SL3.selectByVisibleText("4");
		SL4.selectByVisibleText("Yahoo");
		SL5.selectByVisibleText("Big Baby Cat");
	}
	public void CheckDoubleClick(WebDriver driver) {
		Actions action = new Actions(driver);
		action.doubleClick(DoubleClick);
		action.build().perform();
	}
	
}
