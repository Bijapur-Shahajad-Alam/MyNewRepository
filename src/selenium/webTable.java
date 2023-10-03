package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Alam\\selenium\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

		driver.manage().window().maximize();

		System.out.println("Title : "+driver.getTitle());

		//Number of rows
		int rows = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("Number of rows in the given Table are : "+rows);

		//Number of columns
		int columns = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		System.out.println("Number of columns in the given Table are : "+columns);

		//Specific value
		String value = driver.findElement(By.xpath("//table[@id='customers']//tr[4]//td[4]")).getText();
		System.out.println("Specific value selected is : "+value);

		// Total table data
		for(int r =2;r<=rows;r++)
		{
			for(int c =1;c<=columns;c++)
			{
				String table = driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(table+"     ");
			}
			System.out.println();
		}

		//click on check box based on value
		List<WebElement> data = driver.findElements(By.xpath("//table[ @id='customers']//td"));
		for(WebElement checkbox:data)
		{
			String option = checkbox.getText();
			if(option.contains("Ola"))
			{
				driver.findElement(By.xpath("//td[text()='Ola']//preceding-sibling::td//input")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td//a")).click();

			}

		}

	}

}



