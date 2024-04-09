package homework.array;

import java.util.Arrays;
import java.util.Random;

public class LongestIncreasingSubsequence {
	public static int[] longestSubArray(int[] array) {
		int maxLength = 1;
		int startIndex = 0;
		int currentLength = 1;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1]) {
				currentLength++;
				if (currentLength > maxLength) {
					maxLength = currentLength;
					startIndex = i - maxLength + 2;
				}
			} else {
				currentLength = 1;
			}
		}

		return getResult(array , maxLength , startIndex);
	}

	private static int[] getResult(int[] array , int maxLength , int startIndex) {
		int[] result = new int[maxLength];
		System.arraycopy(array , startIndex , result, 0, maxLength);
		return result;
	}


	public static int[] randomArray(int size){
		Random random = new Random(21000709); // Set random seed
		int[] array = new int[size];
		for (int i = 0; i < size; i++){
			array[i] = random.nextInt(size * 100) - 100;
		}
		return array;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++){
			int size = i * 10;
			System.out.printf("####### SIZE = %d ##########\n", size);
			int[] array = randomArray(size);
			System.out.println("Origin Array: ");
			System.out.println(Arrays.toString(array));
			int[] solution = longestSubArray(array);
			System.out.println("Solution: ");
			System.out.println(Arrays.toString(solution));
		}
	}
}
