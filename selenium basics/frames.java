package Assignment.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://way2automation.com/way2auto_jquery/frames-and-windows.php#load_box");
		//no.of frames
		List<WebElement>iframerlist=driver.findElements(By.tagName("iframe"));
		int totalframes=iframerlist.size();
		System.out.println("No of frames"+totalframes);
		//current frame name
		//WebElement element=driver.findElement(By.xpath("//*[@id=\"example-1-tab-1\"]/div/iframe"));
		//System.out.println("Frame are"+element);
		//by using index
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("New Browser Tab")).click();
		System.out.println(driver.findElement(By.linkText("New Browser Tab")).getText());
		driver.switchTo().parentFrame();
		  driver.findElement(By.xpath("//a[@href=\"#example-1-tab-2\"]")).click();
		  driver.switchTo().frame(1);
		  driver.findElement(By.linkText("Open New Seprate Window")).click();
		  System.out.println(driver.findElement(By.linkText("Open New Seprate Window"))
		  .getText()); //by using parent frame to move the parentframe
		  driver.switchTo().parentFrame();
		  driver.findElement(By.xpath("//a[@href=\"#example-1-tab-3\"]")).click();
		  driver.switchTo().frame(2);
		  driver.findElement(By.linkText("Open Frameset Window")).click();
		  System.out.println(driver.findElement(By.linkText("Open Frameset Window")).
		  getText()); driver.switchTo().parentFrame();
		  driver.findElement(By.xpath("//a[@href=\"#example-1-tab-4\"]")).click();
		  
		  // // by using webelement 
		  WebElement Frame4 =driver.findElement(By.xpath("//*[@id=\"example-1-tab-4\"]/div/iframe"));
		  driver.switchTo().frame(Frame4);
		  driver.findElement(By.linkText("Open multiple pages")).click();
		  System.out.println(driver.findElement(By.linkText("Open multiple pages")).
		  getText()); //by using defaultcontent to exit the frame
		  driver.switchTo().defaultContent();
		  driver.findElement(By.linkText("Home")).click();
		 driver.quit();

	}

}
