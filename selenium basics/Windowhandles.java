package Assignment.Assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://way2automation.com/way2auto_jquery/frames-and-windows.php#load_box");
		//no.of frames
		List<WebElement>iframerlist=driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("New Browser Tab")).click();
		driver.findElement(By.linkText("New Browser Tab")).click();
		driver.findElement(By.linkText("New Browser Tab")).click();
		String wind=driver.getWindowHandle();
		System.out.println(wind);
		Set<String> allwinds= driver.getWindowHandles();
		Iterator<String> itr=allwinds.iterator();
		String first_window=itr.next();
		String second_window=itr.next();
		String Third_window=itr.next();
		System.out.println(first_window);
		System.out.println(second_window);
		System.out.println(Third_window);
		driver.switchTo().window(first_window);
		




		
		

	}

}
