package SeleniumClz1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.safari.SafariDriver;

public class LoginFunctionality {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdiver.safari.driver", "C:/usr/bin/safaridriver");

		WebDriver driver = new SafariDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Apple");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//a[@href='/search?q=apple&sxsrf=ALeKk00mGfFLLWMBkEGrKenWSlFWuQkQ5Q:1583040553034&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiCmdDOxfjnAhXtyjgGHaBJB9AQ_AUoA3oECBoQBQ']")).click();
		
		//driver.findElement(By.linkText("Images")).click();
		System.out.print(driver.getTitle());

		//driver.get("https://juliemr.github.io/protractor-demo/");
		//driver.get("https://freecrm.co.in");

		// driver.get("https://thawing-shelf-73260.herokuapp.com/index.jsp");

		//driver.manage().window().maximize();
		
	//	Thread.sleep(5000);
		
	//	driver.findElement(By.linkText("Sign Up")).click();
		//WebElement login = driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a"));
		//login.click();
		
		
	//	Thread.sleep(5000);
		
		//driver.quit();
		
		//driver.findElement(By.name("email")).sendKeys("karthickmaya@hotmail.com");

	}

	
}
