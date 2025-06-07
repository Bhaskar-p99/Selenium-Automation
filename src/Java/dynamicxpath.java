package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;
//Click on dynamic link
public class dynamicxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/tyy/4io/~cs-whcdezmdvl/pr?sid=tyy,4io&collection-tab-name=redmi+13+5G&pageCriteria=default&param=44455&otracker=CLP_BannerX3&fm=organic&ppt=clp&ppn=mobile-phones-store&ssid=u43aitrzps0000001745332433399");
		driver.findElement(By.xpath("//div[text()='REDMI 13 5G (Hawaiian Blue, 128 GB)']/../..//div[@class='Nx9bqj _4b5DiR']")).click();
		

	}

}
