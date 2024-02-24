package org.tnt.interview.code;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		// sum of list integer using stream
		// sort the number list
		String str = "This this is is tested by Saket Saket";

		String[] strArr = str.replace(" ", "").split("");

		HashMap<String, Integer> hm = new HashMap<>();

		for (String elem : strArr) {
			if (hm.containsKey(elem))
				hm.put(elem, hm.get(elem) + 1);
			else
				hm.put(elem, 1);
		}

		System.out.println(hm);
	}

}
