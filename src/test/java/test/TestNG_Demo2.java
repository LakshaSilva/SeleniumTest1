package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;


public class TestNG_Demo2 {

	private static WebDriver driver = null;

	@BeforeTest
	public void setUpTes() {
		driver = new ChromeDriver();
	}

	@Test
	public static void googleSearch1() {


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
	@AfterTest
	public void finishTest() {
		driver.close();
		System.out.println("SuccessfullY Completed");
	}

}
