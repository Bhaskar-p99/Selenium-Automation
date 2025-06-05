package actionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Qdraganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		act.dragAndDrop(source, target).perform();
		WebElement source1 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		act.dragAndDrop(source1, target1).perform();
		Thread.sleep(4000);
		driver.quit();
		

	}

}
