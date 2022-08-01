package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import POJO.Browser;
public class ScreenShot {
	
	public static void SS(WebDriver driver, String name) throws IOException {
	    
        String d = ScreenShot.date();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("F:\\D_drive data\\ScreenShot\\"+ name + d +".jpeg");
		FileHandler.copy(source, destination);
		 
		}

	public static String date () {
	String date =	DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss").format(LocalDateTime.now());
	return date;
	}
	
	
	
}
