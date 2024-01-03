package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.linkText("Sign up")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
