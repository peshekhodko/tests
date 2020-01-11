package tests;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import testObjectRepository.HomePage;

public class SearchFlightTest extends BaseTestCase {
	
	
	
	private static Logger log = LogManager.getLogger(SearchFlightTest.class.getName());
	WebDriver driver;
	
	public SearchFlightTest () {
		
		this.driver=super.driver;
	}
	
	//@Test
	//public void firstMethod () {
		
		//System.out.println ("First Method");
		//log.info("Info message!!!");
	//}
	
	@Test
	public void checkDestination () {
		
		try {
		//System.setProperty("webdriver.chrome.driver", 
		//		"/Users/nataliya.peshekhodko/Documents/sandbox/Hotwire/drivers/chromedriver");
		//WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.hotwire.com/");
		
		HomePage homePage = new HomePage(driver);
		System.out.println (homePage.destination().getClass() );
		
		
		//Thread.sleep(10000);
		//homePage.selectCarsFrame();
		
		Thread.sleep(10000);
		homePage.setCheckInDate("02/02/2020");
		homePage.setCheckOutDate("02/07/2020");
		Thread.sleep(10000);
		}
		catch (Exception e) {
			
			
			System.out.println(e.toString());
		}
		
	}
	
	@AfterTest
	public void closeBrowser () {
		
		driver.close();
		driver.quit();
		
	}
	
	

}
