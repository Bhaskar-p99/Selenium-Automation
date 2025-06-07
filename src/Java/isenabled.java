package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//check Web element is Enabled
public class isenabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		WebElement ele= driver.findElement(By.linkText("Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz"));
		ele.click();
		if(!driver.findElement(By.linkText("jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).isEnabled())
		{
			System.out.println("PASS:: link isd disabled");
		
		}
		else {
			System.out.println("Fail:: link is eabled");
		}
		driver.findElement(By.xpath("//input[@name='licenseAccept'and @placeholder]")).click();
		Thread.sleep(5000);
		if(driver.findElement(By.linkText("Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz")).isEnabled())
		{
			System.out.println("PASS:: link isd disabled");
		
		}
		else {
			System.out.println("Fail:: link is eabled");
		}
		driver.quit();



	}

}
