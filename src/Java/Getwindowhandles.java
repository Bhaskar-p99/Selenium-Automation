package Java;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://economictimes.indiatimes.com/markets/stocks/live-blog/bse-sensex-today-live-nifty-stock-market-updates-17-march-2025/liveblog/119094975.cms?from=mdr");
		String parent = driver.getWindowHandle();
		driver.findElement(By.linkText("Dr. Reddy's Laboratories Ltd.")).click();
		Set<String> windids = driver.getWindowHandles();
		for (String windid : windids) {
			
			System.out.println(windid);
			
		}
		driver.switchTo().window(parent);
		System.out.println("switched to parent window");
		Thread.sleep(2000);
		driver.quit();

	}

}
