package moduleTwo;

public class Student implements Comparable<Student>{
	private String name;
	private double score1,score2,score3;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore1() {
		return score1;
	}
	public void setScore1(double score1) {
		this.score1 = score1;
	}
	public double getScore2() {
		return score2;
	}
	public void setScore2(double score2) {
		this.score2 = score2;
	}
	public double getScore3() {
		return score3;
	}
	public void setScore3(double score3) {
		this.score3 = score3;
	}
	@Override
	public int compareTo(Student yi) {
		double thisAvg = ((this.getScore1()+this.getScore2()+this.getScore3())/3);
		double thatAvg = ((yi.getScore1()+yi.getScore2()+yi.getScore3())/3);
		if (thisAvg < thatAvg)
			return -1;
		if (thisAvg > thatAvg)
			return 1;
		return 0;
	}

}
