package Assignment.Assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandleusingwhileloop {

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
		String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.linkText("New Browser Tab"));
                System.out.println("Heading of child window is " + text.getText());
            }
        }
driver.quit();
	}

}
