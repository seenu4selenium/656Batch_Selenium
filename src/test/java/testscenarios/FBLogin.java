package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) {
		// Create an object for Web driver Interface/class
		WebDriver driver;

		// Open any browser
		driver = new ChromeDriver();
		// To maximize window
		driver.manage().window().maximize();

		// Type URL
		driver.get("https://www.facebook.com/");
		// Type Credentials (UN& PSWD)
		driver.findElement(By.id("email")).sendKeys("Sravansdt54tesdffgd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("4576tdfbxSravansdt54t");
		// Click on LOGIN button
		driver.findElement(By.name("login")).click();

	}

}
