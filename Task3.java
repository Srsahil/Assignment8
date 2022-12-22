package Assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		
		//Task3
		
		/*
		 * 
		 * Note- Please use only xpath in this scenario
Open https://www.facebook.com/
Click on Create new account 
Fill in all details and click on the Signup button

		 * 
		 * 
		 * 
		 */

	     WebDriver driver =new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.findElement(By.xpath("//*[text()='Create New Account']")).click(); // locate create new button then click on it 
	     Thread.sleep(5000);  // 5 sec sleep to wait for the form available 
	     driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("sahil");// locate and enter first name
	     driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("sonkar");// locate and enter last name
	     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sahil@gmail.com");// locate and enter emailid 
	     driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sahil@gmail.com");// locate and enter confirm emailid  
	     driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("sahil");// locate and enter password 
	     Select date=new Select(driver.findElement(By.xpath("//select[@aria-label='Day']")));// locate day drop down   
	    date.selectByValue("12");// select date as 12
	    Select month=new Select(driver.findElement(By.xpath("//select[@aria-label='Day']//following::select[1]")));// locate month drop down 
	    month.selectByValue("7");// select month as 7
	    Select year=new Select(driver.findElement(By.xpath("//select[@aria-label='Day']//following::select[2]")));// locate year drop down 
	    year.selectByValue("1999"); // select year as 1999
	    driver.findElement(By.xpath("//input[@value='2']")).click(); // locate gender radio button and select male
	    driver.findElement(By.xpath("//button[@name='websubmit']")).click(); //click on signup button
	    driver.manage().window().fullscreen();
	    Thread.sleep(5000);
	    driver.quit();
	     

	     
			
			
			

		}
}
