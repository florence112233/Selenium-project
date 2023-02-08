package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form_flo {

	private Object hotmail;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open amazon page through chrome web browser.
		System.setProperty("webdriver.chrome.driver", "/Users/juliettevasquez/Downloads/chromedriver_mac64/chromedriver" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        browserObject.findElement(By.name("name")).sendKeys("Zoe");
	        browserObject.findElement(By.name("email")).sendKeys("email");
	        browserObject.findElement(By.name("website")).sendKeys("art@hotmail.com");
	        browserObject.findElement(By.name("comment")).sendKeys("comment");
	        browserObject.findElement(By.name("submit")).click();
	}

}
