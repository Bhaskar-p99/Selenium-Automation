package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathgroupedindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String Exp="All Categories- Buy Products Online at Best Price in India - All Categories | Flipkart.com\r\n + ";
		driver.get("https://www.flipkart.com/search?sid=tyy%2C4io&otracker=CLP_Filters&p%5B%5D=facets.brand%255B%255D%3DSAMSUNG");
		driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S25 ')][1]")).click();
		String act=driver.getTitle();
		if(act==Exp) {
			System.out.println("pass ");
			System.out.println(act);
			System.out.println(Exp);
		}
		else {
			System.out.println("Fail");
			System.out.println(act);
			System.out.println(Exp);
		}
		driver.quit();

	}

}
