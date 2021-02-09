package Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class ArithmeticOperations {

	public static Integer add(Integer a, Integer b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		/*Date date1 = new java.util.Date(118, 05, 21, 18, 59, 40);
		Date date2 = new Date(2018, 06, 21);

		System.out.println(date1);
		
		System.out.println(date1.getTime() < System.currentTimeMillis());*/
		
		LocalDate localDate = LocalDate.parse("06/25/2018" ,DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		LocalDate lastDayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth());
		String lastDay = lastDayOfMonth.toString();
		System.out.println(lastDay);
	}
}