package CollectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee(105,"mani",15000,"male");
		Employee e2=new Employee(106,"sushan",20000,"female");
		Employee e3=new Employee (107,"tresa",5000,"female");
		Employee e4=new Employee(108,"mandy",65000,"male");
		Employee e5=new Employee(109,"maddy",8500,"male");
		ArrayList<Employee> s=new ArrayList<>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
      
		//s.forEach(y->System.out.println(y));
	List<Employee>g=s.stream().filter(li->li.getGender().equals("male")).collect(Collectors.toList());
	g.forEach(x->System.out.println(x));

	//	for(Employee c:s) {

		//	System.out.println(c);
	//	}
	//for(int i=0;i>s.size();i++) {
	//	System.out.println(s.get(i));
	}
	

		

		

		
	
	

	}
		
	


