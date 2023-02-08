package selenium_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateClass {

	private static final 

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/juliettevasquez/Downloads/chromedriver_mac64/chromedriver");
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("https://www.linkedin.com/");
		
		  System.out.println("this is " + browserObject.getTitle() + "website");
			// 5. In next line we are using getCurrentUrl method .This will give the current url of the webpage
		        System.out.println("url is: " + browserObject.getCurrentUrl());
		        
		        browserObject.navigate().to("http://www.twitter.com/");
		        System.out.println("this is " + browserObject.getTitle() + "website");
		        System.out.println("this is" + browserObject.getCurrentUrl());
		         
		        browserObject.navigate().back();
		        System.out.println("this is " + browserObject.getTitle() + "website");
		        System.out.println("this is" + browserObject.getCurrentUrl());
		        
		        browserObject.navigate().forward();
		        System.out.println("this is " + browserObject.getTitle() + "website");
		        System.out.println("this is" + browserObject.getCurrentUrl());
		         
		   
			}    
	}


