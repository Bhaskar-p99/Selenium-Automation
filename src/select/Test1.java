package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./drivers/chromedrier.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		Select monlist= new Select(driver.findElement(By.id("month")));
		List<WebElement> optnlist = monlist.getOptions();
		for (WebElement ele : optnlist) {
			System.out.println(ele.getText());
			System.out.println(ele.getAttribute("value"));
			
		}
	}

}
