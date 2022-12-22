package Assignment8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		
		// Task1
		/*
		 * 
		 * Open ​​https://www.facebook.com/

Capture the below text and verify text contains the below text

Facebook helps you connect and share with the people in your life

		 * 
		 * 
		 * 
		 * 
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");// open the facebook url 
		String Text=driver.findElement(By.xpath("//*[text()='Facebook helps you connect and share with the people in your life.']")).getText();   // get text from the element 
		System.out.println("text on the facebook page--> "+Text); // print the text found on the page 
		
		// Task2
		
		/*
		 * 
		 * Open ​​https://www.facebook.com/ 
Capture all link text available in the footer section and verify Create Page Link is present or not. If yes then click on it.

		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		List<WebElement> element = driver.findElements(By.xpath("//div[@id='pageFooter']//a")); // locate all footer element on the page 
		int siz=element.size();
		System.out.println(siz);
		for(int i=0;i<siz;i++)
		{
			
			System.out.println("footer link->"+element.get(i).getText());// print all the footer element 
			
			
		}
		String text2="Create a Page"; // storing Create a pega in a variable 
		String text1 = driver.findElement(By.linkText("Create a Page")).getText();  // locating and getting text create a page using link text
		
		
		if(text1.equals(text2))// comparing both string if they match or not for 
		{
			System.out.println("Create a page link is present ");
			driver.findElement(By.linkText("Create a Page")).click(); // open the create a page link 
		}
		else
		{
			System.out.println("Create a page link is not present ");
		}
		
		driver.quit(); // close the window 

	}

}
