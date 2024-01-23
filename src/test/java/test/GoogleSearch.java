package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	public static void main(String args[])
	{
		googleSearch();
	}
	
	public static void googleSearch() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("L2AGLb")).click();
		WebElement textBox = driver.findElement(By.id("APjFqb"));
		textBox.sendKeys("Automation Step By Step");
		textBox.sendKeys(Keys.ENTER);
		
	}

}
                                                                                                                                                                                                                                                                               