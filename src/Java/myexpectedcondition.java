package Java;

import java.sql.Driver;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class myexpectedcondition {
	public static ExpectedCondition<Boolean> myTitleIs(String exp) {
		return new ExpectedCondition<Boolean>() {//Anonymous class
			
			String act;
			
				@Override
				public Boolean apply(WebDriver driver) {
					act= driver.getTitle();
					return driver.getTitle().equals("exp");
				}

				@Override
				public String toString() {
					
					return "Sorry exp is "+    act;
				}
				
			};
		}
	
		
	}

	
	

	


