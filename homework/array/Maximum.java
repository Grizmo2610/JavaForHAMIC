package homework.array;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
	public static int[] inputArray(int size, Scanner input){
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++){
			arr[i] = input.nextInt();
		}
		return arr;
	}
	public static int max(int[] arr){
		int index = 0;
		for (int i = 1; i < arr.length ; i++){
			if(arr[i] > arr[index]){
				index = i;
			}
		}
		return index;
	}

	public static int[] maxIndexes(int[] arr){
		int max = max(arr);
		int[] result = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == arr[max]) {
				result[index] = i;
				index++;
			}
		}
		return result;
	}

	public static void display(int[] index){
		for (int i = 0; i < index.length; i++){
			if (i == 0){
				System.out.print(index[i] + " ");
			}else if (index[i] != 0){
				System.out.print(index[i] + " ");
			}else {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = inputArray(size, input);
		display(maxIndexes(arr));
	}
}
