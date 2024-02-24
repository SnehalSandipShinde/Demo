package org.tnt.demo_code;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class ArrayTest{

//If you have a sorted array containing only 0's and 1's, give me the number of 1's in the array. 
	//Most optimized is o(log n)
	
	

    public static void main(String [] args)
    {
    	
        List<Integer> arr = Arrays.asList(0,1,0,1,1);
        
        
        TreeMap<Integer, Integer> ts = new TreeMap<>();
        
        for(Integer it : arr)
        {
        	if(it == 1) {
                if(ts.containsKey(1))
                    ts.put(it , ts.get(it)+1);
                else
                	ts.put(it, 1);
        	}
//            if(ts.containsKey(1))
//                ts.put(it , ts.get(it)+1);
//            else
//            	ts.put(it, 1);
 
        }
        System.out.println(ts);
            
    }
}
