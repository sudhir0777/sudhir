package CollectionList;


import java.util.Arrays;

public class Christo {
	public static void main (String[]args) {
		int [] nums= {1,2,7,3,4,7,5,6}; int l=nums.length;int count=0;int count1=0;
		for(int i=0; i<=l-1; ++i) {
			if(nums[i]%2==0){
				count =count+1;	
			}
			else  {
				count1=count1+1;
			}
			}
			System.out.println("even count="+count);
			System.out.println("odd count="+count1);
			Arrays.sort(nums);
			
	try {
			for(int i=0; i<=l; ++i) {
				//System.out.println(nums[i]);
				if(nums[i]==nums[i+1]) {
					
					System.out.println(nums[i]);
						}
						}
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}
