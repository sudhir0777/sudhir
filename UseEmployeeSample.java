package CollectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployeeSample {
public static void main( String[]args) {
	EmployeeSample e1= new EmployeeSample(1,"susan",5000);
	EmployeeSample e2= new EmployeeSample(2,"trinity",10000);
	EmployeeSample e3= new EmployeeSample(3,"infotech",50000);
	ArrayList<EmployeeSample>s=new ArrayList<>();
	s.add(e1);
	s.add(e2);
	s.add(e3);
//	s.forEach(li->System.out.println(li));
//	for(EmployeeSample c:s) {
//		System.out.println(c);
//		for(int i=0;i<s.size();i++) {
//		System.out.println(s.get(i));

	//}
List<EmployeeSample>j=s.stream().filter(k->k.getSalary()>10000).collect(Collectors.toList());
j.forEach(li->System.out.println(li));
	}
}
