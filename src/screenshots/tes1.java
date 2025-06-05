package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import jdk.javadoc.internal.doclets.formats.html.taglets.InheritableTaglet.Output;

public class tes1 {
	public static void main(String[]args) throws IOException {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://poki.com/");
		 driver.findElement(By.xpath("//a[contains(@href,'/en/g/stunt-bike-extreme')]")).click();
		 TakesScreenshot Ts = (TakesScreenshot)driver;
		 File temp= Ts.getScreenshotAs(OutputType.FILE);
		 String time= LocalDateTime.now().toString().replace(':', '-');
		 String filepath="./errorshots"+time+"bike";
		 FileUtils.copyFile(temp,new File(filepath));
		 driver.quit();
	}

}
