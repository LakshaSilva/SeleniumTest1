package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	static WebElement element = null;
	
	public static WebElement button_accept(WebDriver driver) {
		element = driver.findElement(By.id("L2AGLb"));
		return element;
	}
	
	public static WebElement textbox_search(WebDriver driver) {
		
		element = driver.findElement(By.name("q"));
		return element;
	}
	
//	public static WebElement button_search(WebDriver driver) {
//		element = driver.findElement(By.name("btnK"));
//		return element;
//		
//	}
	

}
