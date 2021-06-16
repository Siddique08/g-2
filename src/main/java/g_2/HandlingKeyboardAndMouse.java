package g_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyboardAndMouse {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noman\\Desktop\\QA Class\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Tooltips']")).click();
		driver.switchTo().frame(0);
		WebElement ttip = driver.findElement(By.xpath("//a[text()='Tooltips']"));
		WebElement trol = driver.findElement(By.xpath("//a[text()='ThemeRoller']"));
		act.moveToElement(ttip).moveToElement(trol).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.close();

	}

}
