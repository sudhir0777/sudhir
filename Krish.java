package CollectionList;

import java.util.Arrays;

public class Krish {

	public static void main(String[] args) {
	String [] values= {"ram","raja","ashok"}; 
String a=values[0];String b=values[1];String c=values[2];
 for(int i=0; i<values.length; ++i) { 
 int [] max= {values[i].length()};

 Arrays.sort(max);
 int l=max.length;
 System.out.println(values[l+1].toUpperCase());
	}
 
 
 
 int max=0; String maz="";
 for(int i=0; i<values.length; ++i) { 
	 if(values[i].length()>max) {
		 max=values[i].length();
		 maz=values[i];
	 }
	 
 }System.out.println(maz.toUpperCase());
 
	}
}
