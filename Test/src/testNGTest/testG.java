package testNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testG {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");	
	
	String pageTitle = driver.getTitle();
	 	
	Assert
	}

}
