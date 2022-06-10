package Assignment.Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoomin {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.com/"); 
		driver.manage().window().maximize(); 
		Robot robot=new Robot(); 
		for (int i = 0; i <3; i++){ 
		Thread.sleep(3000); 
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_ADD); 
		robot.keyRelease(KeyEvent.VK_ADD); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		} 
		for (int i = 0; i <5; i++){ 
		Thread.sleep(3000); 
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_SUBTRACT); 
		robot.keyRelease(KeyEvent.VK_SUBTRACT); 
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		} 

	}

}
