package org.tnt.demo_code;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		
		Integer[] arr = {0,1,0,1,0,1};
		int len = arr.length;
		int count = 0;
		
		for (int i = 0; i < len; i++) { 
            if (arr[i] == 0) 
                count++; 
            arr[i] = 0; 
        } 
		 System.out.println(Arrays.asList(arr));	
			
        // loop fills the arr with 0 until count 
//        for (int i = 0; i < count; i++) 
//            arr[i] = 0; 
//  
        // loop fills remaining arr space with 1 
        for (int i = count; i < len; i++) 
            arr[i] = 1; 

        System.out.println(Arrays.asList(arr));	
		
//		
//		Arrays.sort(arr);
//		
//		Arrays.stream(arr).forEach(System.out::print);
	}
}
