package homework;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static int[] randomArray(int size){
		Random random = new Random(); // Set random seed
		int[]  array  = new int[size];
		for (int i = 0; i < size; i++){
			array[i] = random.nextInt(size * 100) - 100;
		}
		return array;
	}

	public static void solve(int[] arr){
		int start = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++){
			int x = 0;
			for (int j = i; j < arr.length - 1; j++){
				if(arr[j] > arr[j + 1]){
					x = j - i + 1;
					break;
				}
			}
			if (x > max){
				max = x;
				start = i;
			}
		}

		for (int i = start; i < start + max; i++){
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args){
		int size = 10;
		int[] array = randomArray(size);
		System.out.println("Origin Array: ");
		System.out.println(Arrays.toString(array));

		solve(array);
		// [316, 621, 93, 226, 61, 50, 550, 339, 61, 793]
	}
}