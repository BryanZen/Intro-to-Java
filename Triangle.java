// Bryan Zen
// 113252725
// bryan.zen@stonybrook.edu

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Side 1: ");
		int side1 = sc.nextInt();
		System.out.print("Side 2: ");
		int side2 = sc.nextInt();
		System.out.print("Side 3: ");
		int side3 = sc.nextInt();
		
		if (side1 + side2 < side3 || side1 + side3 < side2 || side3 + side2 < side1) {
			System.out.println("Output: Invalid Input!");
		}
		else if (side1 == side2 && side2 == side3 && side1 == side3) {
			System.out.println("Output: Equilateral");
		}
		else if (side1 == side2 || side2 == side3 || side1 == side3) {
			System.out.println("Output: Isoceles");
		}
		else
			System.out.println("Output: Scalene");
		
		sc.close();
		
	}

}
