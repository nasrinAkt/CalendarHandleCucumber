package StepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepClass {
	WebDriver driver;
	
	@Given("^Open southwest application$")
	public void open_southwest_application() throws Throwable {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\hafiz\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions run = new ChromeOptions();
	   run.addArguments("--remote-allow-origins=*");
	   
	   driver = new ChromeDriver();
	   driver.get("https://www.southwest.com/");
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	   driver.manage().window().maximize();
	   
	   
	}

	@Then("^scroll down and enter depart and return date$")   //https://www.southwest.com/
	public void scroll_down_and_enter_depart_and_return_date() throws Throwable {
	 
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value= '10/20/2023'");
		js.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='10/25/2023'");
		Thread.sleep(5000);
		driver.close();
	}
	@Then("^enter departure date$")   //https://www.aa.com/
	public void enter_departure_date() throws Throwable {
	/*((JavascriptExecutor)driver).executeScript("scroll(0,300)");
  
	JavascriptExecutor js  = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('aa-leavingOn').value= '10/20/2023'");
	js.executeScript("document.getElementById('aa-returningFrom').value='10/25/2023'"); 
	Thread.sleep(5000);
   driver.close();  */
		
	
	
	 /*((JavascriptExecutor)driver).executeScript("scroll(0,300)");  //jetblue.com
		driver.findElement(By.xpath("//a[@class='call']")).click();
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('jb-date-picker-input-id-2').value= '09/22/2023'");
		js.executeScript("document.getElementById('jb-date-picker-input-id-3').value='09/25/2023'"); 
		
		Thread.sleep(5000);
		WebElement ser = driver.findElement(By.xpath("//span[text()='Search flights']"));
		ser.click();
		Thread.sleep(2000);
	   driver.close(); */ 
		
		
		
		
	
	/*	driver.findElement(By.xpath("//button[text()='Check-in Date']")).click();  //  booking.com
		
		String checkInMonth = "October 2023";
		String dateVal = "25";
		
		while(true) {
	    String month = driver.findElement(By.xpath("(//h3[@class='e1eebb6a1e ee7ec6b631'])[1]")).getText();	
	
	    if(month.equals(checkInMonth)) {
		
		break;
		
	}
	    else {	
		driver.findElement(By.xpath("//button[@type='button']//span[@class='fcd9eec8fb c2cc050fb8']//*[name()='svg']")).click();
		
	}
	    List<WebElement> ele    = driver.findElements(By.xpath("(//tbody)[1]//tr//td/span"));
	
	
	    for(WebElement element:ele) {
	    String date = element.getText();	
		
	    if(date.equals(dateVal)) {
		
		element.click();
		break;		
	}	
	}
	}	
		Thread.sleep(5000);
		driver.close(); */
		
	
		
		
		
	/*	driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();  //makemytrip.com
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Wed Sep 20 2023')]")).click();
		Thread.sleep(5000);  */
		
		
		
		
	/*	driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click(); //makemytrip.com
		Thread.sleep(5000);
		
      String flag = "False";
 
      while(flag=="False") {
	    	
 if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sun Dec 10 2023')]")).size()>0) {
		  
	 driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sun Dec 10 2023')]")).click();
	 flag = "True";
	 Thread.sleep(2000);
	
	   }
    else {	
    	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	 
 }
	    	
	    }
		System.out.println("Test case is passed");
		driver.close(); */
		
		
		
		
	/*	driver.findElement(By.xpath("//button[text()='Okay']")).click();    //redbus.com
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementByXpath('onward_cal').value='10/12/2023'");
		js.executeScript("document.getElementById('r-date').value='11/12/2023'");
		
		Thread.sleep(2000);
		driver.close();*/
	}
	

}
