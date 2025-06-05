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

public class atuo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys(new String[] {"indopak"});
		List<WebElement> autosort = driver.findElements(By.xpath("//li[@class='sbct PZPZlf'and not(@id)]"));
		List<String>actorder=new ArrayList<String>();
		for (WebElement ele : autosort) {
			actorder.add(ele.getText());
			
		}
		List<String>exporder=new ArrayList<String>(actorder);
		Collections.sort(exporder);
		System.out.println("exp order is"+exporder);
		System.out.println("act order is"+actorder);
		
		if (actorder.equals(exporder)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
	}

}
