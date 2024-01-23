package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchTest();
		
	}
	public static void googleSearchTest() {
		driver = new ChromeDriver();
		
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		searchPageObj.ClickAcceptButton();
		
		searchPageObj.SetTextInSearchBox("A B C D");
		
		searchPageObj.PrintMessage();
		
		driver.close();
	}

}
