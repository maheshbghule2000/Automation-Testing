package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppqs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btn4")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
