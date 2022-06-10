package Assignment.Assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
 
		driver.manage().window().maximize();
		 
		// Pass the url
		driver.get("http://www.google.com");
		 
		// Take screenshot and store as a file format
		driver.findElement(By.name("q")).sendKeys("venky");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment\\Screenshots\\Screenshots.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }

		driver.close();
	
	}

}
