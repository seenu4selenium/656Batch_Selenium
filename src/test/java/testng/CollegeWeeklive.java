package testng;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CollegeWeeklive {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://collegeweeklive.com/go-signup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		//Click on Submit button
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
			
		//Get the firstNameError message
		String fnErrorMsg = driver.findElement(By.id("firstNameError")).getText();
		System.out.println(fnErrorMsg);
		
//		Thread.sleep(5000);
//		driver.findElement(By.name("firstName")).sendKeys("Sravan");
		
//		try {
//			driver.findElement(By.name("firstName")).sendKeys("Sravan");
//		} catch (Exception NoSuchElementException) {
//			Thread.sleep(5000);
//			driver.findElement(By.name("firstName")).sendKeys("Sravan");
//		}

	}
}
