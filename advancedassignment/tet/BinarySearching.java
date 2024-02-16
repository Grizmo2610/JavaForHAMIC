package advancedassignment.tet;

import java.util.Scanner;
/**
 * Exercise 08: Binary searching
 *
 * @version 1.0
 * @author Hoang Tu
 */
public class BinarySearching {
	public static int search(int[] numbers, int target){
		int l = 0, r = numbers.length - 1, m;

		while (l < r){
			m = (l + r) / 2;
			if (numbers[m] == target){
				return m;
			} else if (target < numbers[m]){
				r = m - 1;
			} else if (numbers[m] < target){
				l = m + 1;
			}
		}

		return -1;
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
		int target = input.nextInt();
		input.close();

		System.out.println(search(numbers, target));
	}
}
