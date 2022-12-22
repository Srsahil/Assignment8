package Assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//TASK4
		/*
		 * 
		 * Perform same steps which you did in task 3 but replace all xpath with css Selectors.
		 * 
		 * 
		 */
		
		 WebDriver driver =new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     Thread.sleep(5000);
	     driver.manage().window().fullscreen();
	     driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("sahil");
	     driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("sonkar");
	     driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("sahil@gmail.com");
	     driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("sahil@gmail.com");
	     driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("sahil");
	    Select date=new Select(driver.findElement(By.cssSelector("select[name='birthday_day']")));
	    date.selectByValue("12");
	    Select month=new Select(driver.findElement(By.cssSelector("select[name='birthday_month']")));
	    month.selectByValue("7");
	    Select year=new Select(driver.findElement(By.cssSelector("select[name='birthday_year']")));
	    year.selectByValue("1999");
	    driver.findElement(By.cssSelector("input[value='2']")).click();
	    driver.findElement(By.cssSelector("button[name='websubmit']")).click();
	    driver.manage().window().fullscreen();
	    Thread.sleep(5000);
	    
	  driver.quit();

	}

}
