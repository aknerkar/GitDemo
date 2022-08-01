package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
      
	public static WebDriver OpenBrowser() {
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\nerka\\Desktop\\Sell jar\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	
	
	
}
