package testng;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ColoradoCricket {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		
//		ChromeOptions options = new ChromeOptions();
//		//Replace with File path of .crx File downloaded in your local
//		 options.addExtensions (new File("C:\\Users\\nalla\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\lgblnfidahcdcjddiepkckcfdhpknnjh\\2.1.24_0\\"));
//		driver = new ChromeDriver(options);
//		
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://cricclubs.com/ColoradoCricket");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		
		// Create an object for Action class
		Actions act = new Actions(driver);
		// move mouse pointer to the Players Menu
		act.moveToElement(driver.findElement(By.linkText("Players"))).build().perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("firstName")).sendKeys("Sreeni");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"searchPlayer\"]/div/div[7]/div[1]/div/div/input")).click();
		Thread.sleep(1000);
		//Scroll up
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.linkText("Sreenivasula Reddy Nallagari (3332558)")) );
		
		driver.findElement(By.linkText("Sreenivasula Reddy Nallagari (3332558)")).click();
		Thread.sleep(2000);
		  
		//get the player details
		String playerDetails =  driver.findElement(By.className("col-sm-6")).getText();
		System.out.println(playerDetails);
		
		

	}
}
