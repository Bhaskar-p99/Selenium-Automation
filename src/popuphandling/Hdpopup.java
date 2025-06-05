package popuphandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Program to handle hidden division pop-up
public class Hdpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
		driver.findElement(By.id("customerName")).sendKeys("hemanthu");
		driver.findElement(By.id("customerEmail")).sendKeys("hemanthu@gmail.com");
		WebElement ele = driver.findElement(By.id("prod"));
		ele.click();
		Select s= new Select(ele);
		s.selectByIndex(1);
		driver.findElement(By.id("message")).sendKeys("hello mr trainer");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();



	}

}
