package midtermtest;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static int[] inputArray(int size, Scanner input){
		int[] arr = new int[size];
		for (int i = 0; i < size; i++){
			System.out.print("Input " + (i + 1) + "/" + size + ": ");
			arr[i] = input.nextInt();
		}
		return arr;
	}

	public static int secondMax(int[] numbers){
		int max = numbers[0];
		int secondMax = numbers[1];

		for (int i = 1; i < numbers.length; i++){
			if (numbers[i] > max){
				secondMax = max;
				max = numbers[i];
			} else if (max == numbers[i]) {
				secondMax = numbers[i];
			} else if (numbers[i] > secondMax) {
				secondMax = numbers[i];
			}
		}
		return secondMax;
	}

	public static int[] addAll(int[] origin, int[] other){
		int[] result = new int[origin.length + other.length];
		System.arraycopy(origin , 0 , result , 0 , origin.length);
		System.arraycopy(other , 0 , result , origin.length , other.length);
		origin = result;
		return origin;
	}

	public static int[] subArray(int[] array, int start, int end){
		int[] result = new int[end - start];
		System.arraycopy(array, start, result, 0, end - start);
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input size: ");
		int size = input.nextInt();
		int[] arr = inputArray(size, input);

		System.out.println("Second max: " + secondMax(arr));

		System.out.print("Input size: ");
		int size2 = input.nextInt();
		int[] arr2 = inputArray(size2, input);

		System.out.println(Arrays.toString(addAll(arr , arr2)));


		System.out.print("Input start: ");
		int start = input.nextInt();
		System.out.print("Input end: ");
		int end = input.nextInt();

		System.out.println(Arrays.toString(subArray(arr , start , end)));
	}
}
