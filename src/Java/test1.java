package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.sentientgaming.com/");
		try {
			//wait.until(ExpectedConditions.titleIs("Selenium"));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Know More']"))));
			System.out.println("pass home is displayed");
		}catch(Exception e) {
			System.out.println("fail home is not loaded");
		}
		//driver.findElement(By.xpath("//span[text()='Know More']"))
		
		//try {
			//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Downloads']"))));
			//System.out.println("pass downloadpage is displayed");
		//}catch(Exception e) {
			//System.out.println("fail downloadpage is not loaded");
		//}

	}

}
