package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORH_loginDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// wait time
		Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys("Sravan");
		driver.findElement(By.name("password")).sendKeys("asfadgsgadgadgad");

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

}
