package org.tnt.demo_code;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("a", 11);
		hm.put("b", 23);
		hm.put("c", 12);
		hm.put("d", 13);
		hm.put("d", 14);
		
		List<Entry<String,Integer>> list =  hm.entrySet().stream().collect(Collectors.toList());
		
		System.out.println(list);
		
		System.out.println(	hm.get("d"));
		
//		hm.forEach((k,v)-> System.out.println("key: "+k + " value; "+ v));
		
		hm.forEach((k,v)-> System.out.println("key: "+k+"Value: "+v));
	}
}
