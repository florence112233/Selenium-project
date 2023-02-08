package selenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver because we will perform Dropdown testing through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "/Users/juliettevasquez/Downloads/chromedriver_mac64/chromedriver" );
				
				// 2. Initialize Webdriver object through ChromeDriver class.
		        	WebDriver browserObject = new ChromeDriver();
				// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
			        browserObject.get("http://training.qaonlinetraining.com/testPage.php");

			       
					
					WebElement checkboxBoat = browserObject.findElement(By.xpath("//input[@value='boat']"));
					WebElement checkboxCar = browserObject.findElement(By.xpath("//input[@value='car']"));
					WebElement checkboxHorse = browserObject.findElement(By.xpath("//input[@value='horse']"));
					WebElement checkboxBike = browserObject.findElement(By.xpath("//input[@value='Bike']"));
					  WebElement submitButton = browserObject.findElement(By.xpath("//input[@value='Send']"));
					  
					  checkboxBoat.click();
					  checkboxCar.click();
					  checkboxHorse.click();
					  checkboxBike.click();
					  submitButton.click();
					  Thread.sleep(6000);
					  browserObject.close();
					  
					  
	}
 
}
