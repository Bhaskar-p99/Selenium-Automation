package webdivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chromedrier", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.getCurrentUrl();
		Thread.sleep(5000);
		driver.getTitle();
		Thread.sleep(5000);
		driver.getPageSource();
		Thread.sleep(5000);
		driver.quit();
	}

}
