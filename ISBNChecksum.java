// Bryan Zen
// 113252725
// bryan.zen@stonybrook.edu

import java.util.Scanner;
public class ISBNChecksum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
		String input = sc.nextLine();
		int sum = 0, d13, exit = 0;
		if (input.length() < 12) {
			exit = -1;
			System.out.println(input + " is invalid input");
		}
		for (int i = 0; i < 12; i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				if ((i+1) % 2 == 0)
					sum += Character.getNumericValue(input.charAt(i)) * 3;
				else 
					sum += Character.getNumericValue(input.charAt(i));
			} else {
				exit = -1;
				System.out.println(input + " is invalid input");
				break;
			}
		}
		d13 = 10 - sum % 10;
		if (d13 == 10)
			d13 = 0;
		String ISBN = input + d13;
		if (exit == 0)
			System.out.println("The ISBN-13 number is " + ISBN);
		sc.close();
	}

}
