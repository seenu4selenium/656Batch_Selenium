package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment13_Sreeni {
	@Test
	public void f() throws InterruptedException {

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		Thread.sleep(3000);
		Select departureCity = new Select(driver.findElement(By.xpath("//select[@class = 'form-inline']")));
		departureCity.selectByVisibleText("Portland");
		Thread.sleep(3000);
		Select destinationCity = new Select(driver.findElement(By.xpath("//select[@class = 'form-inline'][2]")));
		destinationCity.selectByVisibleText("London");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(3000);
		// choose flight
		driver.findElement(By.xpath("(//input[@type = 'submit'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value = 'Purchase Flight']")).click();
		Thread.sleep(1000);
		String tyMsg = driver.findElement(By.xpath("//h1[text() = 'Thank you for your purchase today!']")).getText();
		System.out.println(tyMsg);
		System.out.println("*************************");
		String tableMsg = driver.findElement(By.xpath("//table[@class='table']")).getText();
		System.out.println(tableMsg);
		System.out.println("*************************");

	}
}
