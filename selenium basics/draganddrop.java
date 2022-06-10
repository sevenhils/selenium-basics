package Assignment.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
 
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 driver.manage().timeouts(); 
		 driver.get("https://jqueryui.com/droppable/");
		 
		 driver.switchTo().frame(0);
		
		 WebElement sourcelement = driver.findElement(By.xpath("//*[@id='draggable']"));
		 WebElement Targetelement = driver.findElement(By.xpath("//*[@id='droppable']"));
		 Actions action = new Actions(driver);
		 
		 action.dragAndDrop(sourcelement, Targetelement).build().perform();
		// action.clickAndHold(sourcelement).moveToElement(Targetelement).release().build().perform();
		 
		 driver.close();
		
	}

}
