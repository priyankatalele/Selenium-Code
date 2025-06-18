package seleniumpractice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GWHS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.w3schools.com/");
				driver.findElement(By.linkText("Try it Yourself")).click();  ///will open second window
				Set<String> windows = driver.getWindowHandles() ;
				
				System.out.println(windows);
				List<String> window = new ArrayList<String> (windows);
				
				driver.switchTo().window(window.get(0));
				
				driver.close();
				

			}

		


	}


