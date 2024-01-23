package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
	
	WebDriver driver = null;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
		
		
		//Create extent reports and attache extent reports
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("Google Search Test One","This is validating google home page functionality");
		WebDriver driver = new ChromeDriver();
		
		test1.log(Status.INFO, "starting test case");
		driver.get("https://www.google.com/");
		test1.pass("Navigated to googlr.com");
		driver.manage().window().maximize();
		test1.pass("Maximize web page");
		
		driver.findElement(By.id("L2AGLb")).click();
		test1.pass("Accept privacy policy");
		WebElement textBox = driver.findElement(By.id("APjFqb"));
		textBox.sendKeys("Automation Step By Step");
		test1.pass("Enter text in search box");
		textBox.sendKeys(Keys.ENTER);
		test1.pass("Press key board key Enter");
		driver.close();
		test1.pass("Close the webpage");
		test1.info("Test Completed");
		extent.flush();
		
		
	}

}
