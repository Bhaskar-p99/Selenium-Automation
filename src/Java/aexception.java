package Java;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class aexception {
	public static void main(String [] args)  {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		try{
			wait.until(new mycondition("Mohan"));
			System.out.println("pass");
		}catch(TimeoutException e) {
			System.out.println(e.getMessage());
			System.out.println("fail");
		}
		
			
		}

}
