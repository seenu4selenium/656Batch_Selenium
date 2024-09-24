package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Expedia_HotelBooking {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//button[@data-stid='destination_form_field-menu-trigger']")).click();
		Thread.sleep(500);
		//clear the existing data
		driver.findElement(By.id("destination_form_field")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("destination_form_field")).sendKeys("New York");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='New York New York, United States']")).click();
		Thread.sleep(500);
		driver.findElement(By.name("EGDSDateRange-date-selector-trigger")).click();
		Thread.sleep(500);
		//Choose dates
		driver.findElement(By.xpath("//div[text()='20']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()='25']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		Thread.sleep(500);
		//Click on Search button
		driver.findElement(By.id("search_button")).click();
		

		
	}
}
