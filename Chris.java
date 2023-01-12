package CollectionList;

public class Chris {
	public static void main(String[]args) {
		String [] value= {"red", "cj", "BANANA"};
	for(int i=0; i<value.length; ++i) {
		if(value[i].toLowerCase().contains("a")||value[i].toLowerCase().contains("e")||value[i].toLowerCase().contains("i")||value[i].toLowerCase().contains("o")||value[i].toLowerCase().contains("u")) {
			System.out.println(value[i]+" contains vowel");
		}
		else {
			System.out.println(value[i]+" not contains voewel ");
		}
		
	}
	
		
	}

}
