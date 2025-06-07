package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
//Custom Exceptions or user defined exceptions
public class mycondition implements ExpectedCondition <Boolean> {
	String exp;
	String act;
	public mycondition(String exp) {
		this.exp=exp;
	}

	@Override
	public Boolean apply(WebDriver driver) {
		act= driver.getTitle();
		return driver.getTitle().equals("exp");
	}

	@Override
	public String toString() {
		
		return "Sorry exp is "+ exp   + act;
	}
		

	}


