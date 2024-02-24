package org.tnt.interview.code;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String output = replaceConsecutiveXVowels(input);
		System.out.println(output);
	}

	private static String replaceConsecutiveXVowels(String input) {
		StringBuilder sb = new StringBuilder();
		char prevChar = '\0';
		boolean consecutiveXVowels = false;

		for (char c : input.toCharArray()) {
			if (isXVowel(c)) {
				if (!consecutiveXVowels) {
					sb.append(Character.toUpperCase(c));
					prevChar = c;
					consecutiveXVowels = true;
				}
			} else {
				sb.append(c);
				prevChar = '\0';
				consecutiveXVowels = false;
			}
		}

		return sb.toString();
	}

	private static boolean isXVowel(char c) {
		return "aeimoxy".indexOf(c) != -1;
	}
}