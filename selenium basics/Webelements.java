package Assignment.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static  void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://in.godaddy.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		driver.get("https://www.techlistic.com/");
		System.out.println(driver.getTitle());
		String title =driver.getTitle();
		String actual="Techlistic";
		
		if(title.equals(actual) )
				{
			System.out.println("test1 passed");
		}
			else {
				System.out.println("test1 failed");
			}
		
		String url="https://www.techlistic.com/";
		String acturl=driver.getCurrentUrl();
		if(url.equals(acturl)) {System.out.println("test2 passed");
		}
		else {
			System.out.println("test2 failed");
		}
	
			driver.close();
		}
}

	


