package homework.array;

import java.util.Scanner;

public class EvenSum {
	public static int[] inputArray(int size, Scanner input){
		int[] arr = new int[size];
		for (int i = 0; i < size; i++){
			arr[i] = input.nextInt();
		}
		return arr;
	}

	public static int sum(int[] arr){
		int sum = 0;
		for (int j : arr){
			if (j % 2 == 0) {
				sum += j;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = inputArray(size, input);
		System.out.println(sum(arr));
	}
}
