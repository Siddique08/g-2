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
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement searchX = driver.findElement(By.xpath("//input[@name='q']"));
		WebElement SearchBtn = driver.findElement(By.xpath("//input[@class='gNO89b']"));
		Actions act = new Actions(driver);
		act.click(searchX).sendKeys("Banana")
		.pause(5000).keyDown(Keys.CONTROL)
		   .sendKeys(Keys.ARROW_DOWN)
		   .pause(5000).sendKeys(Keys.ARROW_DOWN)
		   .pause(5000).sendKeys(Keys.ARROW_DOWN)
		   .keyUp(Keys.CONTROL).click().pause(5000).click(SearchBtn).build().perform();
		
		
		
		
		
		
		
	}

}
