package Assignment.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
 
		 driver.get("https://www.demoqa.com/tool-tips/");
		 WebElement Tooltip = driver.findElement(By.id("toolTipButton"));
		 Actions action = new Actions(driver);
		 action.clickAndHold().moveToElement(Tooltip).build().perform();
		 
		 String  tooltiptext = driver.findElement(By.xpath("//*[@id=\"toolTipButton\"]")).getText();
		 
		 System.out.println(tooltiptext);
		 driver.close();
		

	}

}
