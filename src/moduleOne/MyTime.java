package moduleOne;

import java.time.LocalDate;
import java.time.Period;

public class MyTime {

	public static void main(String[] args) {
		//TODO: Kill the Batman
		LocalDate current = LocalDate.now();
		System.out.println(current);
		System.out.println("Today is "+current.getDayOfWeek()+", my dudes");
		LocalDate startOfSemester = LocalDate.of(2017, 8, 14);
		System.out.println("The semester started "+startOfSemester.getYear() +" "+startOfSemester.getEra());
		Period p = Period.between(startOfSemester, current);
		System.out.println(p);
		System.out.println("It has been "+p.getMonths()+" months and "+p.getDays()+" days since the start of the semester");
	}

}
