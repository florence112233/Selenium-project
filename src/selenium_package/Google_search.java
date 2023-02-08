package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //1. setup the property of chromedriver to pass value to form input box through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "/Users/juliettevasquez/Downloads/chromedriver_mac64/chromedriver" );
		
	    // 2. Initialize Webdriver object through ChromeDriver class.
	    ChromeDriver browserObject = new ChromeDriver();
	    // 3. Open form page of https://www.google.com/
	    browserObject.get("https://www.google.com/");
	browserObject.findElement(By.name("q")).sendKeys("Selenium python");
	browserObject.findElement(By.name("btnK")).submit();
	
	 		browserObject.close();
	 		
	 		
	    

	}

}
