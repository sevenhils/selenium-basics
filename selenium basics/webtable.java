package Assignment.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://demo.guru99.com/test/web-table-element.php");         
	        //No.of Columns
	        List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr")); 
	        System.out.println("No of rows are : " + rows.size());
	      
	        for(int i=1;i<=rows.size();i++)//26//5
{
	
	    	System.out.println(driver.findElement(By.xpath("//table/tbody/tr["+i+"]")).getText());
	    		for(int j=1;i<=col.size();i++)
 	{
	    		System.out.println(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText());

 	}
 	System.out.println();
	    	
	    	
	    	}
driver.close();
	}

}
