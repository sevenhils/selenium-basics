package Assignment.Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promtalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		  Thread.sleep(3000);
		  driver.findElement(By.id("promptAlert")).click();
		  Alert alert = driver.switchTo().alert();
		  Thread.sleep(2000);
		  String alertText = alert.getText();
		  System.out.println("Alert Text is: " + alertText);
		 alert.sendKeys("Yes");
		  alert.accept();
		  driver.close();


	}

}
