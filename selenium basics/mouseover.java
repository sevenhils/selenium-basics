package Assignment.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
 
		 driver.get("https://www.spicejet.com/");
		 Actions action = new Actions(driver);
		 WebElement Mouseoverelement =driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"));
		 
		 action.moveToElement(Mouseoverelement).build().perform();
		 driver.findElement(By.linkText("Hot Meals")).click();
		 
		 driver.close();
		

	}

}
