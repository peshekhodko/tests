package testObjectRepository;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	public WebDriver driver = null;
	
	public HomePage (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//*[@id=\"farefinder-hotel-startdate-input\"]")
	WebElement checkInDate;
	
	@FindBy (xpath = "//*[@id=\"farefinder-hotel-enddate-input\"]")
	WebElement checkOutDate;
	
			
	By carsFrame = By.xpath("//*[@id=\"farefinder-options\"]/div/div[2]");
	public WebElement destination() {
		
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"farefinder-hotel-destination-input\"]"));
		return destination;
	}
	
	public void setCheckInDate (String checkInDate) {
		
		this.checkInDate.clear();
		this.checkInDate.sendKeys(checkInDate);
	}
	
	public void setCheckOutDate (String checkOutDate) {
		
		this.checkOutDate.clear();
		this.checkOutDate.sendKeys(checkOutDate);
	}
	
	public void selectCarsFrame () {
		
		//driver.findElement(carsFrame).click();
		
		System.out.println ("HERE!!!!!!!!!!!");
		List<WebElement> myList = driver.findElements(By.xpath("//*[@class = \"farefinder-options\"]/div"));
		
		
		System.out.println ("My list size " + myList.size());
		
		
		
		for(int i=0; i<myList.size(); i++){

			System.out.println ("Iteration number " + i);
	        System.out.println(myList.get(i).getText());
	}
		
		myList.get(1).click();

   }
}
