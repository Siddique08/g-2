package g_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc_PopUpAlerts {

	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver_91.exe");  
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.findElement(By.name("proceed")).click(); //clicking on sign in btn
	    Thread.sleep(5000);
	    
	    /*perform 2 actions-- 
	     * 1. get the pop up text 
	     * 2. click on "ok" button */
	    Alert alert = driver.switchTo().alert(); //switching to alert
	    System.out.println(alert.getText()); //getting alert text
	   
	    // validation--after getting text from alert
	    String text = alert.getText();
	    if(text.equals("Please enter a valid user name")) {
	    	System.out.println("correct alert message");
	    }
	    else {
	    	System.out.println("in correct alert message");
	    }
	   
	    alert.accept(); // clicking on "ok" button
	    //alert.dismiss(); //click on cancel button
	    
	}

}
