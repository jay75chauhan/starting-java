package algo;

import java.util.Arrays;



class tripletTwopointer {

	public static boolean main(String[] args) {
		int t[]= {1,4,6,5,4,32,4,23,3,2,};

		Arrays.sort(t);
		
		for(int i=0;i<=t.length-2;i++) {
			if(twoSum(t,-t[i],i+1)) 
				return true;
			}
		return true;

			
		}
		
		
		public static boolean twoSum(int k[],int x,int i) {
			int j=k.length-1;
			while(i<j) {
				if (k[i]+k[j]>x) {
					j--;}
				else if (k[i]+k[j]<x) {
					i++;}
				else {
					return true;
				}
			}
			return false;
		
		}

}
