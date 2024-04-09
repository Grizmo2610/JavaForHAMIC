package homework.array;

import java.util.Scanner;

public class Average {
	public static int[] inputArray(int size, Scanner input){
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++){
			arr[i] = input.nextInt();
		}
		return arr;
	}

	public static int sum(int[] arr){
		int sum = 0;
		for (int number: arr){
			sum += number;
		}
		return sum;
	}
	public static double mean(int[] arr){
		return 1.0 * sum(arr) / arr.length;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = inputArray(size, input);
		System.out.println(mean(arr));
	}
}
