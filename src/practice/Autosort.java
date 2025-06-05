package practice;

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

public class Autosort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys(new String[]{"test"});
		List<WebElement> autosort = driver.findElements(By.xpath("//li[@class='sbct PZPZlf' and not(@id)]"));
		//Set<String> act = new TreeSet<String>();
		//for (WebElement ele : autosort) {
		//	act.add(ele.getText());
			
		//}
		//for (String s : act) {
		//	System.out.println(s);
			
		//}
		List<String> Act = new ArrayList<String>();
		for (WebElement ele : autosort) {
			Act.add(ele.getText());
			List<String> exp = new ArrayList<String>(Act);
			Collections.sort(exp);
			System.out.println(Act);
			System.out.println(exp);
			if(Act.equals(exp)) {
				System.out.println("pass");
				
			}else {
				System.out.println("fail");
			}
			
		}
	}

}
