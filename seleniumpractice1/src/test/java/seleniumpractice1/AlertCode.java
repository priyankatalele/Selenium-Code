package seleniumpractice1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		driver.switchTo().alert().accept();
		
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		driver.switchTo().alert().dismiss();
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Priyanka");
		
		alert.accept();
		
		String compare = driver.findElement(By.cssSelector("#result")).getText();
		
		if(compare.contains("Priyanka"))
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
			String screenshotPath = "C:\\Priya\\seleniumpractice1\\ss1file.png";

            // Copy the file to the desired location
            FileUtils.copyFile(screenshotFile, new File(screenshotPath));

            System.out.println("Screenshot saved to: " + screenshotPath);
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		

	}

}
