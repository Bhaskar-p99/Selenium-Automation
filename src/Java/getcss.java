package Java;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Check the Background colour of login button
public class getcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver"," ./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/login");
		String exp = "#1877f2";
		String actRGB = driver.findElement(By.name("login")).getCssValue("background-color");
		
		System.out.println("actual hexa code for login button is "+actRGB);
		
		driver.quit();


	}

}
