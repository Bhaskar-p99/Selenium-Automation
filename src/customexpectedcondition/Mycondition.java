package customexpectedcondition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
//Custom or user defiend Expected Condition
public class Mycondition implements ExpectedCondition<Boolean>{
	
	@Override
	public Boolean apply(WebDriver driver) {
		// TODO Auto-generated method stub
		
		return driver.getTitle().equals("bhaskar");
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Sorry title is not bhaskar ";
		}
	

}
