package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	By button_accept = By.id("L2AGLb");
	By textbox_search = By.name("q");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ClickAcceptButton(){
		driver.findElement(button_accept).click();
		
	}
	
	public void SetTextInSearchBox(String text){
		driver.findElement(textbox_search).sendKeys(text);
		driver.findElement(textbox_search).sendKeys(Keys.ENTER);
		
	}
	
	public static void PrintMessage() {
		System.out.println("Suusessfully run");
	}
	
	

}
