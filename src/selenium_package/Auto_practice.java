package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open amazon page through chrome web browser.
				System.setProperty("webdriver.chrome.driver", "/Users/juliettevasquez/Downloads/chromedriver_mac64/chromedriver" );
				// 2. Initialize Webdriver object through ChromeDriver class. 
			        WebDriver browserObject = new ChromeDriver();
				
			        browserObject.get("https://practice.automationtesting.in/");
			      browserObject.findElement(By.id("pagewrap")).click();
			      
			        

	}

}
