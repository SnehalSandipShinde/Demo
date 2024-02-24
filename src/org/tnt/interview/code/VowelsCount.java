package org.tnt.interview.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class VowelsCount {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		String str = "ilovejava";
		countVowwels( str);
		List<String> list = Arrays.asList(str.split(""));

		HashMap<String, Integer> hm = new HashMap<>();
		for (String s : list) {
			if (hm.containsKey(s))
				hm.put(s, hm.get(s) + 1);
			else
				hm.put(s, 1);
		}
		System.out.println(hm);

		HashMap<String, Integer> hmV = new HashMap<>();
		String ip = "a";
		for (String s1 : list) {
			if (s1.equals("a"))
				hmV.put("a", hm.get(s1));
			if (s1.equals("e"))
				hmV.put(s1, hm.get(s1));
			if (s1.equals("i"))
				hmV.put(s1, hm.get(s1));
			if (s1.equals("o"))
				hmV.put(s1, hm.get(s1));
			if (s1.equals("u"))
				hmV.put("u", hm.get(s1));
			else
				hmV.put("u", 0);
		}
		System.out.println(hmV);
	}
	
	private static void countVowwels(String str)
	{
		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;
		
		for(char ch : str.toCharArray())
		{
			switch(ch)
			{
			case 'a':
				aCount++;
				break;
			case 'e':
				eCount++;
				break;
			case 'i':
				iCount++;
				break;
			case 'o':
				oCount++;
				break;
			case 'u':
				uCount++;
				break;
			
			}
		}
		System.out.println("a="+aCount+","+"e="+eCount+","+"i="+iCount+","+"o="+oCount+","+"u="+uCount+",");
	}
}