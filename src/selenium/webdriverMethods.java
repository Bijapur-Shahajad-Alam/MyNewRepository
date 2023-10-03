package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverMethods {
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Alam\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.youtube.com/");
	
//			driver.getTitle();
//			System.out.println(driver.getTitle());
			
			
			String title = driver.getTitle();
			System.out.println(title);
			
			
			System.out.println(driver.getCurrentUrl());
			
//			String page= driver.getPageSource();
//			System.out.println(page);

			
			driver.navigate().to("https://www.facebook.com/");
			
			driver.navigate().to("https://www.youtube.com/");
			
			driver.navigate().back();
			
			driver.navigate().refresh();
			
			driver.navigate().forward();
			
		
//			driver.close();
//			driver.quit();

}}
