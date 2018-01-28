package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

public WebDriver driver; 
public void openURL()
{ 
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://gmail.com");


}

public void verifylogin() throws InterruptedException
{
	driver.findElement(By.id("identifierId")).sendKeys("malavade.ranjani");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content")).click();
	Thread.sleep(1000);	
	driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("ammaappaji");
	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
			Thread.sleep(1000);	
	}

public void addthread() throws InterruptedException
{
driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
Thread.sleep(1000);	
driver.findElement(By.linkText("Add account")).click();
Thread.sleep(1000);	

driver.findElement(By.id("identifierId")).sendKeys("ranjanimalavade73");
driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div[2]")).click();
Thread.sleep(1000);	
driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("appajiamma");
driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div[2]")).click();
	
}


public void compose() throws InterruptedException
{
	driver.findElement(By.xpath("//*[@id=\":i8\"]/div/div")).click();
		Thread.sleep(1000);	
	driver.findElement(By.id(":qj")).sendKeys("ranjanimalavade73@gmail.com");
	driver.findElement(By.id(":q2")).sendKeys("Resume");
	driver.findElement(By.id(":r3")).sendKeys("Hi This is Ranjani , this is auto scrit msg don't reply");
	driver.findElement(By.id(":ps")).click();
	
	Thread.sleep(1000);	
}
/*
public void socil() 
{
	driver.findElement(By.linkText("Sent Mail")).click();
	//driver.findElement(By.linkText("Social(3,698)"));
	//Thread.sleep(2000);
}
*/

public void logout() throws InterruptedException
{
driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
Thread.sleep(1000);	
driver.findElement(By.id("gb_71")).click();


}

public static void main(String[] args) throws InterruptedException {
		
Login a=new Login();
a.openURL();
a.verifylogin();
a.addthread();
//a.verifylogin();
//a.compose();
//a.socil();
//a.logout();


		
	}

}
