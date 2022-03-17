package anagramstring;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Heart";
		String s2 = "Earth";

		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();

		if (s1.length() == s2.length()) {

			char[] array1 = s1.toCharArray();
			char[] array2 = s2.toCharArray();

			Arrays.sort(array1);
			Arrays.sort(array2);

			boolean res = Arrays.equals(array1, array2);

			System.out.println("\t" + res);

			if (res) {
				System.out.println(s1 + " and " + s2 + " are Anagram..!!");
			} else {
				System.out.println(s1 + " and " + s2 + " are not Anagram..!!");
			}
		} else {
			System.out.println(s1 + " and " + s2 + " are not Anagram..!!");
		}
	}

	
}
