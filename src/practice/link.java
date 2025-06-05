package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		WebElement lastlink = ele.get(ele.size()-1);
		lastlink.click();
		String act=(driver.getCurrentUrl());
		String exp="https://www.flipkart.com/helpcentre?otracker=footer_navlinks";
		if(exp.equals(act)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
