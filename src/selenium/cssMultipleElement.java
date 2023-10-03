package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssMultipleElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Alam\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		System.out.println("Title : "+driver.getTitle());
		
		// number of images
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println("number of images:"+image.size());
		
		
		
		// tag and id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mobile");

		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
