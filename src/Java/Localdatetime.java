package Java;

import java.time.LocalDateTime;

public class Localdatetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now().plusDays(999);
		int day = ldt.getDayOfMonth();
		int year = ldt.getYear();
		String month = ldt.getMonth().name();
		month=month.substring(0, 1).toUpperCase()+month.substring(1).toLowerCase();
		System.out.println(day);
		System.out.println(year);
		System.out.println(month);
				

	}

}
