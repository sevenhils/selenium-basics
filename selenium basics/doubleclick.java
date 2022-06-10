package Assignment.Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\Chrome driver\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 */		
		
		
		  System.setProperty("webdriver.gecko.driver", "E:\\firefox\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		 
		
		
		/*
		 * System.setProperty("webdriver.msedge.driver",
		 * "E:\\Edgedriver\\msedgedriver.exe"); WebDriver driver=new EdgeDriver();
		 */
		
		
		driver.manage().window().maximize();
 
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		 Actions action = new Actions(driver);
		 WebElement Doubleclick = driver.findElement(By.xpath("//*[@ondblclick='myFunction()']"));
		 action.doubleClick(Doubleclick).build().perform();
		 
		 Alert alert=driver.switchTo().alert();
		 alert.accept();
		 
		 driver.close();
	


	}

}
