package g_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyBoard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noman\\Desktop\\QA Class\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		WebElement summerDre = driver.findElement(By.xpath("//ul[@id='homefeatured']/li/div/div/h5/a"));
		act.click(summerDre).pause(3000).keyDown(Keys.CONTROL)
										.sendKeys(Keys.ARROW_DOWN).pause(3000).sendKeys(Keys.ARROW_DOWN)
										.keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
		
		
	}

}
