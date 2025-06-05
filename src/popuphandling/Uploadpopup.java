package popuphandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Uploadpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		driver.findElement(By.id("fullName")).sendKeys("hemanth");
		driver.findElement(By.id("emailId")).sendKeys("hemath@gmail.com");
		driver.findElement(By.id("password")).sendKeys("270130@PDR");
		driver.findElement(By.id("mobile")).sendKeys("1234567890");
		 WebElement ele = driver.findElement(By.id("city"));
				 ele.click();
		Select s= new Select(ele);
		s.selectByVisibleText("Mumbai");
		Select sel=new Select(driver.findElement(By.xpath("//select[@aria-invalid='false\']")));
		sel.selectByIndex(1);
		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\Admin\\Desktop//SELENIUM.pdF");
		driver.findElement(By.id("alert")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Create Profile']")).click();

	}

}
