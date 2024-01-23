//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class BrowserTest {
//
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//
//		driver.findElement(By.id("L2AGLb")).click();
//		WebElement inputfield = driver.findElement(By.id("APjFqb"));
//		inputfield.sendKeys("sample data filling form online");
//		inputfield.sendKeys(Keys.ENTER);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.partialLinkText("Online Data Entry")).click();
//	}
//
//}
