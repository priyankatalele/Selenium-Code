package seleniumpractice1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String browser;
					
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your choice of browser");
		browser = sc.nextLine();
		
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
		System.out.println("Please enter the correct browser");
		}

		
				
		
		driver.navigate().to("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		WebElement logo = driver.findElement(By.xpath("//img[@alt = 'nopCommerce demo store']"));
		
		System.out.println(logo.isDisplayed());
		
		Thread.sleep(5000);
		
		WebElement heading = driver.findElement(By.tagName("h1"));
		heading.isDisplayed();
			Thread.sleep(5000);
			driver.findElement(By.id("gender-female")).click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#FirstName")).sendKeys("Priyanka");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name = 'LastName']")).sendKeys("Rane");
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
			String screenshotPath = "C:\\Priya\\seleniumpractice1\\ssfile.png";

            // Copy the file to the desired location
            FileUtils.copyFile(screenshotFile, new File(screenshotPath));

            System.out.println("Screenshot saved to: " + screenshotPath);
			driver.close();
		
		

	}

}
