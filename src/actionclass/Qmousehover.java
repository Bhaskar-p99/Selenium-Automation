package actionclass;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Qmousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( 10));
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/mouseHoverimage?sublist=1");
		Actions act= new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//img[@class='w-[50%] m-auto']"));
		act.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
