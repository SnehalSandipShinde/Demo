package org.tnt.demo_code;

import java.util.Arrays;

public class OccuranceOfOnes {

	public static void main(String[] args) {

		Integer[] arr = { 0, 1, 0, 1, 0, 1 };
		Integer[] res = new Integer[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1)
							
				count++;
				res[i] = 1;
			
		}
		System.out.println(count);

		for (int i = count; i < arr.length; i++) {
			if (arr[i] == 0)
				res[i] = 0;
		}
		
		System.out.println(Arrays.asList(arr));

	}
}
