package Assignment.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataCaptureControlsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://login.yahoo.com");

		
		WebElement wb= driver.findElement(By.id("login-body")); 
	     String acttext=wb.getText();
	      System.out.println(acttext);   
	//identify next button
	     WebElement wb1 = driver.findElement(By.id("login-signin"));
	//// name of the button should be next.
	       String actval=wb1.getAttribute("value");
	       System.out.println(actval);
    if (actval.contentEquals("Next")) 
	        {
	        System.out.println("button name is verify ==pass");
   }
	        else {
	       System.out.println("button name is not verifyed == fail");
	      } 
	      // color of the button should be blue.
	       String actcol=wb1.getCssValue("background-color");
	   System.out.println(actcol);
	      WebElement iwb= driver.findElement(By.xpath("//img[@class='logo ']"));
	 //get the size of logo-image 
	       org.openqa.selenium.Dimension dem=iwb.getSize();
	       System.out.println("get the height =>"+ dem.getHeight());
	       System.out.println("get the width =>"+ dem.getWidth());
	//// get the location of the logo image
	        org.openqa.selenium.Point pt =iwb.getLocation();
	        System.out.println("get the x-axis co oridinate =>" +pt.getX());
      System.out.println("get the y- axis co oridinates =>"+ pt.getY());
		        driver.close();
	

	}

}
