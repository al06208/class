package moduleOne;

public class Staff extends Person
{
	private String dept;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	private int officeNum;
	
	public Staff (String name, int ssn, String dept, int officeNum)
	{
		setName(name);
		setSsn(ssn);
		this.dept = dept;
		this.officeNum = officeNum;
		
	}
	public String toString()
	{
		String gremblo = this.getName()+" is in the "+this.dept+" department in office "+this.officeNum+".";
		return gremblo;
	}
	@Override
	public void sayMyName() {
		System.out.println("My name is "+getName()+".");
		
	}
	/*public boolean equals(Object obJect)
	{
		Staff otherStaff = (Staff) obJect; 
		return (this.getName().equals(otherStaff.getName() ) ) && (this.getSsn() == otherStaff.getSsn() );
	}
*/
	public boolean equals(Staff otherStaff)
	{
		return (this.getName().equals(otherStaff.getName() ) ) && (this.getSsn() == otherStaff.getSsn() );
	}
}
