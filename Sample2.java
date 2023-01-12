package CollectionList;

import java.util.ArrayList;

public class Sample2 {
	public static void main(String[] args) {
		ArrayList<String> h=new ArrayList<>();
		h.add("sudhir");
		h.add("suresh");
		h.add("mani");
for(String s:h) {
	System.out.println(s.toUpperCase());
}
h.forEach(a->System.out.println(a.toUpperCase()));

	for(int i=0;i<h.size(); i++) {
		System.out.println(h.get(i));
	}
		
	}
	}


