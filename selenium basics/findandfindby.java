package Assignment.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findandfindby {
	
	public static  void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.myntra.com");
	//using send keys method to pass the date into the textbox
	driver.findElement(By.className("desktop-searchBar")).sendKeys(" puma shoes"); 
	//using click method to act on left-click operation
	driver.findElement(By.className("desktop-submit")).click();
	// print to check whether the method is working fine or not
	System.out.println("passed");   
	//used clear method to clear the data from the textbox
	driver.findElement(By.className("desktop-searchBar")).clear();
	System.out.println("passed1");
	//close the existing browser
	driver.close();

}
}
