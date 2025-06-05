package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qmultiplesel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./drivers/chromedrier.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement ele = driver.findElement(By.id("select-multiple-native"));
		Select s= new Select((ele));
		s.selectByVisibleText("Running Shoes");
		s.selectByIndex(1);
		s.selectByValue("Casual Pants");
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='select-multiple-native'][1]"));
		Select s1= new Select((ele1));
		s1.selectByVisibleText("Running Shoes");
		

	}

}
