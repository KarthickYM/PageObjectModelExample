package SeleniumClz1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenUrl {

	public static void main(String[] args) {
		
		System.setProperty("webdiver.safari.driver", "C:/usr/bin/safaridriver");
		
		WebDriver driver = new SafariDriver();
		
		driver.get("https://www.google.com");
		
		//driver.get("https://thawing-shelf-73260.herokuapp.com/index.jsp");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gLFyf gsfi")).click();
		
	
		
	
	}

}
