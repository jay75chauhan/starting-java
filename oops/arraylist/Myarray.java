package oops.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Myarray {

	public static void main(String[] args) {
		
		List<String> ff =  new ArrayList<String>();
		List<String> vv =  new ArrayList<String>();                      
		
      ff.add(" djchbsch");
      
      ff.add(" dxsxxaxaxa");
      
      
        String temp[]=new String[ff.size()];
        
      ff.toArray(temp);
       
       
      for(String a:ff) {
    	  System.out.println(a);
      }
      
      
//	
//	Pair<String, Integer> ss =new Pair("ladkhidah",32);
//	
//	
//               ss.getvalu();
//	
	

	}

}
