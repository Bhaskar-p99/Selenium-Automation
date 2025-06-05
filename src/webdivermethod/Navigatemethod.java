package webdivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.get("https://www.google.com");
		Navigation nav = driver.navigate();
		Thread.sleep(5000);
		nav.back();
		Thread.sleep(5000);
		nav.forward();
		Thread.sleep(5000);
		nav.refresh();
		Thread.sleep(5000);
		driver.quit();
		}

}
