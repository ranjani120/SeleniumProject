package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Allbrowsers 
{
	
	public void fire()
	{
		WebDriver driver2 = new FirefoxDriver();
	    driver2.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	    
	}
	
	
public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("http://gmail.com");
	    //driver.quit();
	    //Allbrowsers  a =new Allbrowsers();
	    //a.fire();
	    
	    System.setProperty("webdriver.ie.driver","C:\\selenium\\IEDriverServer.exe");
	    WebDriver driver1 = new InternetExplorerDriver();
	    driver1.get("https://www.linkedin.com/?trk=msn-top-in");
	    
}
	    
			

}
