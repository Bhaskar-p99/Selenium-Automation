package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement souceele = driver.findElement(By.xpath("//div[contains(@id,'column-a')]"));
		WebElement targetele = driver.findElement(By.xpath("//div[contains(@id,'column-b')]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(souceele, targetele).perform();
		System.out.println("pass");
	
	}

}
