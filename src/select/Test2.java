package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./drivers/chromedrier.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.mobiscroll.com/select/multiple-select");
		Select ele=new Select(driver.findElement(By.xpath("//span[@class='mbsc-textfield-tags-placeholder mbsc-ios']")));
		Thread.sleep(5000);
		ele.selectByVisibleText("Books");
		Thread.sleep(5000);
		ele.selectByIndex(2);
		Thread.sleep(5000);
		ele.selectByValue("5");
		Thread.sleep(5000);
		ele.deSelectByContainsVisibleText("Books");
		Thread.sleep(5000);
		ele.deselectByIndex(2);
		Thread.sleep(5000);
		ele.deselectByValue("5");
		Thread.sleep(5000);
	}

}
