package homework.array;

import java.util.Scanner;

public class NumberFrequency {
	public static int[] inputArray(int size, Scanner input){
		int[] arr = new int[size];
		for (int i = 0; i < size; i++){
			arr[i] = input.nextInt();
		}
		return arr;
	}

	private static void extracted(int[] frequency) {
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 0) {
				System.out.println(i + ": " + frequency[i]);
			}
		}
	}

	private static int[] getFrequency(int[] arr) {

		int[] frequency = new int[1001];
		for (int num : arr) {
			frequency[num]++;
		}
		return frequency;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		extracted(getFrequency(inputArray(input.nextInt(), input)));

	}
}
