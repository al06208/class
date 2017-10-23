package moduleTwo;

import java.util.Comparator;

public class score2Comparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getScore2()<s2.getScore2())
			return -1;
		if(s1.getScore2()>s2.getScore2())
			return 1;
		return 0;
	}

}
