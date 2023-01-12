package CollectionList;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(35);
		li.add(76);
		li.add(85);
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		for(Integer s:li) {
			System.out.println(s);
		}
		li.forEach(a->System.out.println(a));
	}
	

}

