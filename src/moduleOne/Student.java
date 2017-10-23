package moduleOne;

public class Student extends Person
{
	
	private int eid;
	private String[] courseList;
	
	public Student(String name, int ssn, int eaglid) 
	{
		setName(name);
		setSsn(ssn);
		this.eid = eaglid;
		this.courseList = new String[60];
	}
	
	public int getEid() 
	{
		return eid;
	}
	
	public void setEid(int eid) 
	{
		this.eid = eid;
	}
	public void setCourses(String course)
	{
		this.courseList[0] = course;
	}
	public String toString() {
		return getName() + " " + this.eid + " " + getAllCourses();
	}
	private String getAllCourses() 
	{
		String cList = "";
		boolean first = true;
		for (String course:courseList)
		{
			
			if (first)
				{
				first=false; 
				cList +=course;
				}
			else if(course != null) cList +=", "+course;
		}
		
		return cList;
	}

	@Override
	public void sayMyName()
	{
		System.out.println("My name is "+getName()+".");
		
	}

}
