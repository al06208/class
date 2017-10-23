package moduleTwo;

import java.util.Arrays;

public class StudentScores {

	public static void main(String[] args) {
		//create some BOMB-ASS STUDENTS that FOLLOW THE RULES and CLEAN THEIR ROOMS
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.setName("Nugs Nubby");
		s1.setScore1(90);
		s1.setScore2(80);
		s1.setScore3(100);
		s2.setName("Dabby Duck");
		s2.setScore1(95);
		s2.setScore2(70);
		s2.setScore3(75);
		s3.setName("Ewmew Fudd");
		s3.setScore1(100);
		s3.setScore2(100);
		s3.setScore3(80);
		//add to an array
		Student[] students = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		//sort array with Arrays.sort
		//Arrays.sort(students);
		//Arrays.sort(students, new score1Comparator());
		Arrays.sort(students, new score2Comparator());
		//display Array
		for(Student n:students) {
			System.out.println(n.getName());
		}
		
		
		

	}

}
