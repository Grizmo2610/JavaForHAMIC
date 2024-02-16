package advancedassignment.tet;

import java.util.Scanner;
/**
 * Exercise 12: Second Max
 *
 * @version 1.0
 * @author Hoang Tu
 */

public class SecondMax {
	public static int secondMax(int[] array){
		int max = array[0], secondMax = -1;
		for (int i = 1; i < array.length; i++){
			if (array[i] > max){
				secondMax = max;
				max = array[i];
			} else if (array[i] > secondMax && array[i] != max){
				secondMax = array[i];
			}
		}
		return secondMax;
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

		System.out.println(secondMax(numbers));
	}
}
