// Bryan Zen
// 113252725
// bryan.zen@stonybrook.edu

import java.util.Scanner;

public class Train {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Distance: ");
		int d = sc.nextInt();
		if (d <= 50) {
			System.out.println("Output: $" + 3*d);
		}
		else if (d > 50 && d <= 100) {
			System.out.println("Output: $" + (150 + (d - 50)*2));
		}
		else if (d > 100) {
			System.out.println("Output: $" + (250 + (d - 100)));
		}
		sc.close();
	}

}
