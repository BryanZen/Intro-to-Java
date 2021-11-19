// Bryan Zen
// 113252725
// bryan.zen@stonybrook.edu

import java.util.Arrays;
import java.util.Scanner;

public class EliminateDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		System.out.println(eliminateDuplicates(input));
		sc.close();
		
	}
	public static String eliminateDuplicates(String str) {
		char[] chars = str.toCharArray();
		int n = 0;
		for (int i =0; i< chars.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (chars[i] == chars[j]) {
					break;
				}	
			}
			if (j == i) {
				chars[n++] = chars[i];
			}
		}
		return String.valueOf(Arrays.copyOf(chars,  n));
	}

}
