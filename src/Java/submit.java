package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//use for submit the form
public class submit {
	public static void main (String []args) throws InterruptedException {
		System.setProperty("webdriver,chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		WebElement Search = driver.findElement(By.name("q"));
		Search.sendKeys(new String[] {"indo pak match"});
		Thread.sleep(5000);
		Search.submit();
		
	}

}
