package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./drivers/chromedrier.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Select daylist= new Select(driver.findElement(By.id("day")));
		Select monlist= new Select(driver.findElement(By.id("month")));
		Select yearlist= new Select(driver.findElement(By.id("year")));
		daylist.selectByVisibleText("9");
		monlist.selectByIndex(9);
		yearlist.selectByValue("1996");
		

	}

}
