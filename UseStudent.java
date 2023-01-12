package CollectionList;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("sushan",105,25);
		Student s2=new Student("tresa",106,24);
		Student s3=new Student("maddy",107,25);
		Student s4=new Student("arjun",108,26);
		Student s5=new Student("vishal",109,25);
		ArrayList<Student> s=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		for(int i=0;i<s.size();i++) {
			if(s.get(i).getAge()>21 && s.get(i).getAge()<=26) {
				System.out.println(s.get(i));
			}
		}
	}

}
				