package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiSelectionDemo {
	@Test
	public void f() throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);

		driver.findElement(By.id("msdd")).click();
		Thread.sleep(1000);
		//Scroll down
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(By.linkText("English")));
		Thread.sleep(1000);
		driver.findElement(By.linkText("English")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Spanish")).click();
		Thread.sleep(500);
		driver.findElement(By.id("checkbox3")).click();
		

	}
}
