package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static <Alert> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver because we will perform radio button testing through chrome web browser.
				System.setProperty("webdriver.chrome.driver", "/Users/juliettevasquez/Downloads/chromedriver_mac64/chromedriver" );
						
						// 2. Initialize Webdriver object through ChromeDriver class.
				       		 WebDriver browserObject = new ChromeDriver();
						// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
					        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
					        browserObject.findElement(By.id("alert")).click();
						      
							org.openqa.selenium.Alert alert = browserObject.switchTo().alert();
							System.out.println(((WebElement) alert).getText());
							Thread.sleep(6000);
							((org.openqa.selenium.Alert) alert).accept();
							
							browserObject.findElement(By.id("confirm")).click();
							org.openqa.selenium.Alert alert1 = browserObject.switchTo().alert();
							
							System.out.println(alert1.getText());
							Thread.sleep(6000);
							((org.openqa.selenium.Alert) alert1).dismiss();
							
							browserObject.findElement(By.id("prompt")).click();
							org.openqa.selenium.Alert alert2 = browserObject.switchTo().alert();
							System.out.println(alert2.getText());
							Thread.sleep(6000);
							 alert2.sendKeys("Solomon A");
							 alert2.accept();
							
						
						
	}

}
