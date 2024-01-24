package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@SuppressWarnings("deprecation")
public class ExtentReportsDemoWithTestNG {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test1;
	WebDriver driver = null;

	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		//Create extent reports and attache extent reports
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	}
	@BeforeTest
	public void setUpTes() {
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void test1()throws Exception {
		test1 = extent.createTest("Google Search Test One","This is validating google home page functionality");
		test1.log(Status.INFO, "starting test case");
		driver.get("https://www.google.com/");
		test1.pass("Navigated to google.com");
		driver.manage().window().maximize();
		test1.pass("Maximize web page");
		
		driver.findElement(By.id("L2AGLb")).click();
		test1.pass("Accept privacy policy");
		
		WebElement textBox = driver.findElement(By.id("APjFqb"));
		textBox.sendKeys("Automation Step By Step");
		test1.pass("Enter text in search box");
		textBox.sendKeys(Keys.ENTER);
		test1.pass("Press key board key Enter");
		
		
		

	}
	
	@AfterTest
	public void finishTest() {
		extent.flush();
		driver.close();
		test1.pass("Close the webpage");
		test1.info("Test Completed");
		System.out.println("Test is completed with extend report by TestNG");
	}
//	@AfterSuite
//	public void tearDown() {
//		
//
//	}

}
