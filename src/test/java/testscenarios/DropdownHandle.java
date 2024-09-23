package testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		Select dob_month = new Select(driver.findElement(By.name("birthday_month")));
		dob_month.selectByVisibleText("Aug");
		
		Select dob_date = new Select(driver.findElement(By.name("birthday_day")));
		dob_date.selectByVisibleText("15");
		
		Select dob_year = new Select(driver.findElement(By.name("birthday_year")));
		dob_year.selectByVisibleText("1947");
		
		
	}

}
