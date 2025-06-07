package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;
//Synchronization (Implicit wait and Explicit wait)
public class explictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davanagere.nic.in/en/");
		driver.findElement(By.linkText("About District")).click();
		try{
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("home"))));
			System.out.println("pass home page displayed");
		}catch(TimeoutException e) {
			System.out.println("Fail home is not displayed");
		}
	}

}
