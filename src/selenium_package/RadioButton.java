package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static <radioButton> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver because we will perform radio button testing through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "/Users/juliettevasquez/Downloads/chromedriver_mac64/chromedriver" );
				
				// 2. Initialize Webdriver object through ChromeDriver class.
		       		 WebDriver browserObject = new ChromeDriver();
				// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
			        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
			        WebElement radioButtonFemale = browserObject.findElement(By.xpath("//input[@value='female']"));
			        WebElement radioButtonMale = browserObject.findElement(By.xpath("//input[@value='male']"));
			        WebElement radioButtonOther = browserObject.findElement(By.xpath("//input[@value='Other']"));
			        WebElement submitButton = browserObject.findElement(By.xpath("//input[@value='Send']"));
			        
			      
			        radioButtonFemale.click();
			        Thread.sleep(6000);
			        radioButtonMale.click();
			        Thread.sleep(6000);
			        radioButtonOther.click();
			        Thread.sleep(6000);
			        submitButton.click();
			        
			        
					
	}

}
