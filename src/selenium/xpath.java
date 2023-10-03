package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Alam\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.facebook.com");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Alam");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Alam");
		
		
		
		driver.get("https://demoqa.com/text-box");
		driver.findElement((By.xpath("//button[@id='submit']"))).click();
		
		
	}

}
