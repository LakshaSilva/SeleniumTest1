package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;


public class GoogleSearchTest {
	
private static WebDriver driver = null;
	
	public static void main(String args[])
	{
		googleSearch();
	}
	
	public static void googleSearch() {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("L2AGLb")).click();
		GoogleSearchPage.button_accept(driver).click();
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		GoogleSearchPage.textbox_search(driver).sendKeys(Keys.ENTER);
//		GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);
//		WebElement textBox = driver.findElement(By.id("APjFqb"));
//		textBox.sendKeys("Automation Step By Step");
//		textBox.sendKeys(Keys.ENTER);
		
	}

}
                                                                                                                                                                                                                                                                               