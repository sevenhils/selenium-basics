package Assignment.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explictwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("login")));
		System.out.println("email text box is visible");
driver.findElement(By.id("login1")).sendKeys("xyz11@rediff.com");
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("password")));
System.out.println("password text box is visible");

driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin@12");

driver.findElement(By.xpath("//input[@class=\"signinbtn\"]")).click();
driver.close();
	}

}
