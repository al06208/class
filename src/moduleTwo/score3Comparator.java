package moduleTwo;

import java.util.Comparator;

public class score3Comparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getScore3()<s2.getScore3())
			return -1;
		if(s1.getScore3()>s2.getScore3())
			return 1;
		return 0;
	}

}
