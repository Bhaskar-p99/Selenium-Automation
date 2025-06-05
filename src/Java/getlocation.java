package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver"," ./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/login");
		int unx= driver.findElement(By.id("email")).getLocation().getY();
		int pwx=driver.findElement(By.name("pass")).getLocation().getY();
		if (unx==pwx) {
			System.out.println("fail");
			System.out.println("Username y co ordinate is "+unx);
			System.out.println("password y co ordinate is "+pwx);
		}
		else {
			System.out.println("pass");
			System.out.println("password y co ordinate is "+pwx);
			System.out.println("Username y co ordinate is "+unx);
		}
			
		
	driver.quit();



	}

}
