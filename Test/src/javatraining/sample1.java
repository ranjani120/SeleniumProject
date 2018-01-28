package javatraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class sample1 {

public WebDriver driver; 
public void openURL()
{ 

	System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.google.com/gmail/about/");
	driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
	driver.manage().window().maximize();


}

public void verifylogin() throws InterruptedException
{
	driver.findElement(By.id("identifierId"))
	.sendKeys("anika91333@gmail.com");
	//Thread.sleep(1000);
	driver.findElement(By.
			xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/content")).
	click();
	Thread.sleep(1000);	
	driver.findElement(By.
			xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/div[1]/div[1]/div/div/div[1]/div/div[1]/input")).
	sendKeys("9620053392");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[3]/div[2]/div[1]/div/content/span")).
	click();
			Thread.sleep(1000);	
	
	
} 


public void compose() throws InterruptedException
{
	driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div")).click();
	Thread.sleep(1000);
	driver.findElement(By.id(":97")).sendKeys("malavade.ranjani@gmail.com");
	driver.findElement(By.id(":8q")).sendKeys("Resume for automation testing sample second");
	driver.findElement(By.id(":9r")).sendKeys("Hi good morning sagar , wt u doing");
	//driver.findElement(By.id(":ah")).click();
	//driver.findElement(by.)
	//Thread.sleep(3000);
	driver.findElement(By.id(":8g")).click();
	
}

public void sent() throws InterruptedException
{
driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div[3]/div/div/div[2]/span/a")).click();
	Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div[1]/div/div/div[2]/span/a")).click();
	
}

public void logout() throws InterruptedException
{
driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
Thread.sleep(1000);	
driver.findElement(By.id("gb_71")).click();


}

public static void main(String[] args) throws InterruptedException {
		
sample1 a=new sample1();
a.openURL();
a.verifylogin();
a.compose();
a.sent();
a.logout();


		
	}

}
