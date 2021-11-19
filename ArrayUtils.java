// Bryan Zen
// 113252725
// bryan.zen@stonybrook.edu

import java.util.Arrays;
public class ArrayUtils {

	public static void main(String[] args) {
		int size = 100;
		int upLimit = 21;
		int[] a = randomArray(size, upLimit);
		double avg = arraySum(a) / a.length;
		System.out.println("The average of the random array is: " + avg);
		System.out.println("The index of 12 is at: " + contains(a, 12));
		System.out.println("There are " + countMultiplesOf(a, contains(a, 12)) + " multiples of " + contains(a, 12) + " in the random array.");
		
	}
	public static int[] randomArray(int size, int upLimit) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = (int) (Math.random() * upLimit);
		}
		return arr;
	}
	public static void print(int[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
	}
	public static double arraySum(int[] inputArray) {
		double sum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			sum += inputArray[i];
		}
		return sum;
	}
	public static int contains(int[] inputArray, int key) {
		for (int i = 0; i < inputArray.length; i++) {
			if (key == inputArray[i])
				return i;
		}
		return -1;
	}
	public static int countMultiplesOf(int[] inputArray, int m) {
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] % m == 0)
				count++;	
		}
		return count;
	}
}
