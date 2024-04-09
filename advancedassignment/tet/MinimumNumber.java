package advancedassignment.tet;

import java.util.Scanner;
/**
 * Exercise 01: Minimum Number
 *
 * @version 1.0
 * @author Hoang Tu
 */
public class MinimumNumber {
	public static int min(int[] array){
		int min = array[0];
		for (int number: array){
			if (number < min){
				min = number;
			}
		}
		return min;
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
		System.out.println(min(numbers));
	}
}
