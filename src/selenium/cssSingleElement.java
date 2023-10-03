package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSingleElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Alam\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.automationpractice.pl/index.php");


		// Css Tag and Id
		driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Dresses");

		// Css Tag and Class
		driver.findElement(By.cssSelector("input.search_query")).sendKeys("Jeans");

		// Css Tag and Attribute
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Jeans");

		// Css Tag, Class and Attribute
		driver.findElement(By.cssSelector("input.search_query[type='text']")).sendKeys("Shorts");


	}

}
