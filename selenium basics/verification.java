package Assignment.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://login.yahoo.com");
        WebElement iwb= driver.findElement(By.xpath("//img[@class='logo ']"));

		boolean status=iwb.isDisplayed();
        System.out.println("image status is => "+status);
    Thread.sleep(2000);

    // stay sign in box should be selected by default
    WebElement iwb1=driver.findElement(By.id("persistent"));
    boolean status1 =iwb1.isSelected();	 
    System.out.println("check box is selected =>" +status1);
    Thread.sleep(2000);

    //element should be enabled 
    WebElement iwb2=driver.findElement(By.xpath("//input[@id='login-signin']"));
    boolean status2=iwb2.isEnabled();
    System.out.println("button is enabled =>" +status2);
    //close the driver
        driver.close();

	}

}
