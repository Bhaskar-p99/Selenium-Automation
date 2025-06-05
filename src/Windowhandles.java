import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.com");
		String mainwind=driver.getWindowHandle();
		System.out.println("main windoe handle is "+mainwind);
		Set<String> allwinid = driver.getWindowHandles();
		System.out.println("all window id"+ allwinid);
		
	Iterator <String> iterator = allwinid.iterator();
	while(iterator.hasNext()) {
		String childwind=iterator.next();
		if(!childwind.equals(mainwind)) {
			driver.switchTo().window(childwind);
			System.out.println("switched to "+ childwind);
			System.out.println("new window title is "+ driver.getTitle());
			driver.close();
		}
	}
		//for (String windid : allwinid) {
			//driver.switchTo().window(windid);
			//System.out.println(driver.getTitle());
			//System.out.println(driver.getCurrentUrl());
		}

	
	}


	
	
