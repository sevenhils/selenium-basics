package Assignment.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actinosrightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		 Actions action = new Actions(driver);
		 
		 //WebElement rightclick =driver.findElement(By.cssSelector(".context-menu-one"));
		 WebElement rightclick =driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
		 action.contextClick(rightclick).build().perform();
		 WebElement cut =driver.findElement(By.cssSelector(".context-menu-icon-cut"));
		 cut.click();
		 Alert alert=driver.switchTo().alert();
		 alert.accept();
		 driver.close();
		 

		
	}

}
