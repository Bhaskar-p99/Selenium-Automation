package customexpectedcondition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromdriver", "./drivers/chromdriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(new Mycondition());
		driver.quit();
		

	}

}
