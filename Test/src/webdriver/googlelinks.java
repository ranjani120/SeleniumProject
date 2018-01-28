package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlelinks {

	public WebDriver driver;
	
	public void links()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://in.linkedin.com/");
	driver.manage().window().maximize();
	}
	
	public void link2() throws InterruptedException
	{
		//driver.findElement(By.xpath("//*[@id=\"lang-chooser\"]/div[1]/div[1]/div[9]/content")).click();
	driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[1]/button")).click();	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"recoveryIdentifierId\"]")).sendKeys("ranjanimalavade73@gmail.com");
	}
	

	
	
	public static void main(String[] args) throws InterruptedException {
		googlelinks a = new googlelinks();
		a.links();
		//a.link2();

	}

}
