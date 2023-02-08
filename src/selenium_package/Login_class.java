package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "/Users/juliettevasquez/Downloads/chromedriver_mac64/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://www.google.com/ ");
	       browserObject.findElement(By.name("q")).sendKeys("Amazon");
	       browserObject.findElement(By.name("btnK")).submit();
	       
	}

}
