package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoWithTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test1;
	WebDriver driver = null;

	@BeforeTest
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		//Create extent reports and attache extent reports
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
	@Test
	public void test1() {
		test1 = extent.createTest("Google Search Test One","This is validating google home page functionality");
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

	}
	@AfterTest
	public void tearDown() {

	}

}
