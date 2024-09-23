package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_HyperlinkDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.id("email")).sendKeys("Sravansdt54tesdffgd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("4576tdfbxSravansdt54t");

		Thread.sleep(3000);
		//Refresh icon
		driver.navigate().refresh();

		Thread.sleep(3000);
		
		//Click on Forgot password? link
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("got p")).click();
		driver.findElement(By.id("identify_email")).sendKeys("dsfgsdgdsgdsWe3ds");
		Thread.sleep(3000);
		//Click on Back icon
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		//Click on forward icon
		driver.navigate().forward();
		
		//Close the current browser/window
		//driver.close();
		
		//Close the current browser/window/all child window related to the browser
		driver.quit();
		
	}

}
