package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Alam\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//explicit wait
		//WebDriverWait wait = new WebDriverWait(driver,10);

		//Declaration of fluent wait
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2))
//				.ignoring(NoSuchElementException.class);

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();

		driver.findElement(By.id("btn1")).click();
		
		//implementing implicit wait
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//button[@id='btn1']/following::input[1]"));

		//implementing fluent wait and explicit wait
		//WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn1']/following::input[1]")));
		username.sendKeys("w3softech");


	}

}
