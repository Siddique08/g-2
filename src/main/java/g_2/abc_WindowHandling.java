package g_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc_WindowHandling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_91.exe");  
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://seleniumpractise.blogspot.com/2017/");
	    driver.findElement(By.xpath("//a[.='Sign In']")).click();  //clicking on sign in btn
	    Thread.sleep(5000);
	    
	}

}
