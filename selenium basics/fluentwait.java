package Assignment.Assignment;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//delete all the cookie 
		driver.manage().deleteAllCookies();
		// launch Chrome and navigate to the url
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		//identify the start button
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		//Wait for 30 seconds to load an element on the page,and check for its presence once every 3 seconds
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(3))
		.ignoring(NoSuchElementException.class);
		WebElement wb = wait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver driver) {
		if(driver.findElement(By.xpath("//div[@id='finish']//h4")).isDisplayed())
		{
		return driver.findElement(By.xpath("//div[@id='finish']//h4"));
		}
		else
		{
		return null;
		}
		}
		});
		//print the value of the text 
		System.out.println(driver.findElement(By.xpath("//div[@id='finish']//h4")).getText());
		//quit the browser
		driver.quit();
	}

}
