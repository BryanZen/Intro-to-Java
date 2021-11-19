// Bryan Zen
// 113252725
// bryan.zen@stonybrook.edu

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount in Korean Won: ");
		int won = sc.nextInt();
		if (won >= 50000) {
			System.out.println(won/50000 + " 50,000 KRW notes");
			won %= 50000;
		}
		else 
			System.out.println(0 + "50,000 KRW notes");
		
		if (won >= 10000) {
			System.out.println(won/10000 + " 10,000 KRW notes");
			won %= 10000;
		}
		else 
			System.out.println(0 + " 10,000 KRW notes");
		
		if (won >= 5000) {
			System.out.println(won/5000 + " 5,000 KRW notes");
			won %= 5000;
		}
		else 
			System.out.println(0 + " 5,000 KRW notes");
		
		if (won >= 1000) {
			System.out.println(won/1000 + " 1,000 KRW notes");
			won %= 1000;
		}
		else 
			System.out.println(0 + " 1,000 KRW notes");
		
		if (won >= 500) {
			System.out.println(won/500 + " 500 KRW notes");
			won %= 500;
		}
		else 
			System.out.println(0 + " 500 KRW notes");
		
		if (won >= 100) {
			System.out.println(won/100 + " 100 KRW notes");
			won %= 100;
		}
		else 
			System.out.println(0 + " 100 KRW notes");
		
		if (won >= 50) {
			System.out.println(won/50 + " 50 KRW notes");
			won %= 50;
		}
		else 
			System.out.println(0 + " 50 KRW notes");
		
		if (won >= 10) {
			System.out.println(won/10 + " 10 KRW notes");
			won %= 10;
		}
		else 
			System.out.println(0 + " 10 KRW notes");
		
		sc.close();

	}

}
