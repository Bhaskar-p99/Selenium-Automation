package Java;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys(new String[] {"indopak"});
		List<WebElement> autosort = driver.findElements(By.xpath("//li[@class='sbct PZPZlf'and not(@id)]"));
		Set <String>actorder=new TreeSet<String>();
		for (WebElement ele : autosort) {
			actorder.add(ele.getText());
			
		}
		System.out.println(autosort);
		for (String S : actorder) {
			System.out.println(S);
			
			
		}
		driver.quit();
	
	}

}
