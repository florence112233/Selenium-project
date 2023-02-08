package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	private static final Object Gmail = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "/Users/juliettevasquez/Downloads/chromedriver_mac64/chromedriver" );
			// 2. Initialize Webdriver object through ChromeDriver class.
		        WebDriver browserObject = new ChromeDriver();
			// 3. Open the http://www.google.com/ link using get method.
		        browserObject.get("http://www.google.com/ ");
   browserObject.findElement(By.linkText("Gmail"));
   Object blogLink = Gmail;
if (((WebElement) blogLink).isDisplayed()) {
	   System.out.println("Gmail is displayed using LinkText");
	  
} else  {
	   System.out.println("Unable to see Gmail");
	   browserObject.close();
   }
   
	}
}

