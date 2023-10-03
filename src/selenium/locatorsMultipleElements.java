package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Alam\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.get("http://www.automationpractice.pl/index.php");

		// number of slides
		List<WebElement>slider = driver.findElements(By.className("homeslider-container"));
		System.out.println("number of slides:"+slider.size());

		// number of images
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println("number of images:"+image.size());


		// number of links
		List<WebElement>link = driver.findElements(By.tagName("a"));
		System.out.println("number of links:"+link.size());

	}}
