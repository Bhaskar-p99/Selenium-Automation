package popuphandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notificationpopup {
	public static void main(String [] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/flights.html?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=p_easemytrip%20com&adgroupid=53094971502&gad_source=1&gad_campaignid=788997081&gbraid=0AAAAADo_0-jG6Je6MCemwIXdYl9nV7fOt&gclid=CjwKCAjw3MXBBhAzEiwA0vLXQQHFDtjjy2428A-8YQh9s3se5xSJBjQ0ocujkOr7JOHrYqc03g7gpxoCxQsQAvD_BwE");
		Robot robo= new Robot();
		Thread.sleep(5000);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();
		
		
	}

}
