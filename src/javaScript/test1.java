package javaScript;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://doodles.google/search/?color_tags=pink");
		for ( ; ; ) {
			try {
				driver.findElement(By.xpath("//p[text()='Azah Aziz's 94th Birthday']")).click();
				break;
			}
			catch(NoSuchElementException e){
				JavascriptExecutor jse= (JavascriptExecutor)driver;
				jse.executeScript("ScrollBy(0,1000)");
				
			}
			
		}

	}

}
