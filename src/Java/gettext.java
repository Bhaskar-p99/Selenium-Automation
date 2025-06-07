package Java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Using all get methods
public class gettext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		WebElement ele = driver.findElement(By.className("gb_X"));
		System.out.println(ele.getAttribute("href"));
		System.out.println(ele.getText());
		System.out.println(ele.getTagName());
		System.out.println(ele.getClass());
		System.out.println(ele.getLocation());
		WebElement ele1 = driver.findElement(By.className("gb_B"));
		System.out.println(ele1.getAttribute("aria-label"));
		System.out.println(ele1.getText());
		System.out.println(ele1.getTagName());
		System.out.println(ele1.getClass());
		System.out.println(ele1.getLocation());
		
		WebElement ele2 = driver.findElement(By.className("gb_A"));
		System.out.println(ele2.getAttribute("aria-label"));
		System.out.println(ele2.getText());
		System.out.println(ele2.getTagName());
		System.out.println(ele2.getClass());
		System.out.println(ele2.getLocation());
		System.out.println(ele2.getCssValue("background"));
		driver.quit();
		
	}

}
