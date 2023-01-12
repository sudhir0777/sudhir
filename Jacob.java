package CollectionList;

public class Jacob {

	public static void main(String[] args) {
		String a="Christo"; String s="";
		char[] c=a.toCharArray();
		for(int i=a.length()-1; i>=0;--i) {
			s=s+c[i];
		}
	System.out.println(s);
if(a.equals(s)) {
	System.out.println(a+" is plandrome");
}
else {
	System.out.println(a+" is not plandrome");
}
	}

}
