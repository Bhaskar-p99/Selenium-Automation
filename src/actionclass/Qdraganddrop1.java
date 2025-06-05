package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Qdraganddrop1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		;
		Actions act = new Actions(driver);
	
		act.dragAndDropBy(driver.findElement(By.xpath("//div[text()='Drag Me']")), -186, -124).perform();

	}

}
