package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestCase {
	
	
	public WebDriver driver;
	
	public BaseTestCase () {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/nataliya.peshekhodko/Documents/sandbox/Hotwire/drivers/chromedriver");
		WebDriver driver = new ChromeDriver ();
		this.driver = driver;
		
	}

}
