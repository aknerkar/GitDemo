package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaBuySell {

	@FindBy(xpath="//input[@type='text']")private WebElement search;
	@FindBy(xpath="(//button[@type='button'])[1]")private WebElement BuyTatamotor;
	@FindBy(xpath="(//span[@class='tradingsymbol'])[1]")private WebElement Tatamotor;
	@FindBy(xpath="(//label[@class=\"su-radio-label\"])[10]")private WebElement intraday;
	@FindBy(xpath="(//label[@class=\"su-radio-label\"])[11]")private WebElement longterm;
	@FindBy(xpath="(//label[@class=\"su-radio-label\"])[12]")private WebElement Market;
	@FindBy(xpath="//button[@type='submit']")private WebElement Finalbuy;
	
	
	
	public ZerodhaBuySell(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void SearchOnTab(String searchstock) {
		search.click();
		search.sendKeys(searchstock);
	}
	public void ClickOnBuy(WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(Tatamotor).perform();
		action.moveToElement(BuyTatamotor);
		action.click();
		action.perform();
		}
	public void ClickOnIntraday() {
		intraday.click();
	}
	public void ClickOnLongterm() {
		longterm.click();
	}
	public void ClickOnMarket() {
		Market.click();
	}
	public void ClickOnFinalBuy() {
		Finalbuy.click();
	}
	
	
	
}
