package advancedassignment.tet;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Exercise 10: Prefix sum
 *
 * @version 1.0
 * @author Hoang Tu
 */
public class PrefixSum {
	public static int[] calculate(int[] array){
		int[] result = new int[array.length];
		for(int i = 0; i < array.length; i++){
			result[i] += array[i];
			if (i > 0){
				result[i] += result[i - 1];
			}
		}
		return result;
	}


	public static int[] inputArray(Scanner input, int size){
		int[] array = new int[size];
		for(int i = 0 ; i < size; i++){
			array[i] = input.nextInt();
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] numbers = inputArray(input, size);
		input.close();

		System.out.println(Arrays.toString(calculate(numbers)));
	}
}
