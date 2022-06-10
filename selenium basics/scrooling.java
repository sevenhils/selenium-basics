package Assignment.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrooling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html"); 
		driver.manage().window().maximize(); 
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		//1 Scroll down the web page by using pixel 
		js.executeScript("window.scrollBy(0,3000)", ""); 
		//2. Scroll down the web page by using visibility of Element 
		WebElement india=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[2]")); 
		js.executeScript("arguments[0].scrollIntoView();", india); 
		//3. Scroll down the web page at the bottom of the page 
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); } 


	}


