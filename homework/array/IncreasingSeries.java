package homework.array;

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingSeries {
	public static int[] helper(int[] arr, int index, int size){
		if (size == 0){
			return arr;
		}arr[index] = index + 1;
		return helper(arr, index + 1, size - 1);
	}

	public static int[] series(int n){
		return helper(new int[n] , 0 , n);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(Arrays.toString(series(n)));
	}
}
