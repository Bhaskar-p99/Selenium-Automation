package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontSize {
	public static void main(String[]args) {
		
	
	System.setProperty("webdriver.chromedriver"," ./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com/login");
	
	String fsize = driver.findElement(By.name("login")).getCssValue("font-size");
	System.out.println(fsize);
	

	}
}
