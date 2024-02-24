package org.tnt.java_code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoOfForLoop {

	public static void main(String[] args) {

		DemoOfForLoop obj = new DemoOfForLoop();
		System.out.println(obj.testMethod());
		int i = obj.testMethod();
		System.out.println(i);
		List<String> strings = Arrays.asList("nikita", "anjali", "aa", "bbb");

		List<String> name = strings.stream().filter(str -> str.length() > 3).collect(Collectors.toList());

		List<String> aName = strings.stream().filter(str -> str.startsWith("a")).collect(Collectors.toList());

		System.out.println(name);
		System.out.println(aName);
	}

	public int testMethod() {
		int x = 30;
		try {
			System.out.println("in method");
			return x;
		} finally {
			System.out.println("in finally");
			x = 50;
		}
	}

}
