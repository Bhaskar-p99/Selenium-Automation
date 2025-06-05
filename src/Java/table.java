package Java;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/stocksmarketsindia/");
		WebElement table = driver.findElement(By.className("mctable1"));
		List<WebElement> th = table.findElements(By.tagName("th"));
		for (WebElement ele : th) {
			System.out.println(ele.getText());
		}

		int actTH=4;
		int expTH=th.size();
		
	}

}
