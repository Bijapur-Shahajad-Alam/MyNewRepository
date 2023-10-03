package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsSingleElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Alam\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(" https://adactinhotelapp.com/ ");
		driver.findElement(By.id("username")).sendKeys("mahesh23456");
		driver.findElement(By.name("password")).sendKeys("India@123");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.linkText("Forgot Password?")).click();
		//driver.findElement(By.partialLinkText("Password?")).click();

	}

}
