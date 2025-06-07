package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Check Radio button is select 
public class isselcetd {
	public static void main (String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement ele = driver.findElement(By.xpath("//label[text()='Male']//following-sibling::input[@type='radio']"));
		if(!ele.isSelected()) {
			System.out.println("pass: male radio button is selected");
		}
		else {
			System.out.println("fail: mal raio button is not selected");
		}
		Thread.sleep(5000);
		ele.click();
		if(ele.isSelected()) {
			System.out.println("pass: male radio button is selected");
		}
		else {
			System.out.println("fail: mal raio button is not selected");
		}
		driver.quit();

	}

}
