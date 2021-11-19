// Bryan Zen
// 113252725
// bryan.zen@stonybrook.edu

import java.util.Scanner;

public class Measures {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius as an integer: ");
		int r = sc.nextInt();
		System.out.print("Circle with radius " + r);
		System.out.printf(" has a diameter of %.2f, ", 2.0*r);
		System.out.printf("a circumference of %.2f, ", 2*(Math.PI)*r);
		System.out.printf("and an area of %.2f", (Math.PI)*(Math.pow(r, 2)));
		sc.close();
	}

}
