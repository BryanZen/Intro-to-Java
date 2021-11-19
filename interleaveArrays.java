// Bryan Zen
// 113252725
// bryan.zen@stonybrook.edu

import java.util.Arrays;

public class interleaveArrays {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int stride = 2;
		int maxElements = 100;
		System.out.println(Arrays.toString(interleaveArrays1(array1, array2)));
		System.out.println(Arrays.toString(interleaveArrays2(array1, array2, stride, maxElements)));

	}
	public static int[] interleaveArrays1(int[] array1, int[] array2) {
		int newLength = array1.length + array2.length;
		int[] out = new int[newLength];
		int j = 0;
		for (int i = 0; i < newLength; i++) {
			if (i < array1.length)
				out[j++] = array1[i];
			if (i < array2.length)
				out[j++] = array2[i];
		}
		return out;
	}
	public static int[] interleaveArrays2(int[] array1, int[] array2, int stride, int maxElements) {
		int newLength = array1.length + array2.length;
		int[] out = new int[newLength];
		int i = 0, j = 0, z = 0;
		int numsDone = 0;
		if ((stride < 0)||(maxElements <= 0)) {
			System.out.println("null");
			return null;
		}
		if (maxElements < newLength)
			newLength = maxElements;
		while (numsDone < newLength) {
			int o = 0;
			for (o = 0; o < stride && i + o < array1.length; o++) 
				out[z++] = array1[i + o];
			
			i = i + o;
			numsDone = numsDone + o;
			
			for (o = 0; o < stride && j + o < array2.length; o++) 
				out[z++] = array2[j + o];
			
			j = j + o;
			numsDone = numsDone + o;
		}	
		return out;
	}
}
