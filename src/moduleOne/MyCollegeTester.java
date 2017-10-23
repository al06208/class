package moduleOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//import java.util.Vector;


public class MyCollegeTester 
{

	public static void main(String[] args) 
	{
		// TODO: your mom
		Student s1 = new Student("Lisa Lisa", 000000001, 900000001);
		s1.setCourses("Underwater Basket Weaving");
		//System.out.println(s1.getName()+" "+s1.getEid());
		//System.out.println(s1);
		
		Staff admin = new Staff ("Lucy Black", 000000002, "Computer Science", 10);
		
		Staff admin2 = new Staff ("Lucy Black", 000000002, "Computer Science", 10);
		
		//System.out.println(admin);
		Person p = admin;
		Object o = p;
		if(o instanceof Person)
		{
			p = (Person)o;
		}
		//Object o2 = new Car("blue",4,true);
		//System.out.println(o2 instanceof Vehicle);
		
		List<Person> list = new ArrayList<Person>();
		list.add(admin);
		list.add(admin2);
		list.add(s1);
		
		System.out.println(list.size());
		
		Set<Person> set = new HashSet<Person>();
		set.add(admin);
		set.add(admin2);
		set.add(s1);
		System.out.println(set.size());
		System.out.println("Are admin and admin2 the same? " + admin.equals(admin2));
		
		/*Person [] allOfThem = new Person[2];
		allOfThem[0]=s1;
		allOfThem[1]=admin;
		
		for(Person chungus:allOfThem)
		{
			System.out.println(chungus);
		}*/
	}

}
