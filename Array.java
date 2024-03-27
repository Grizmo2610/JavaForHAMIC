import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static int[] inputArray(int size, Scanner input){
		int[] array = new int[size];
		for(int i = 0; i < size; i++){
			System.out.print("Input " +(i + 1) + "/" + size +": ");
			array[i] = input.nextInt();
		}
		return array;
	}

	public static int secondMax(int[] numbers){
		int max = numbers[0];
		int secondMax = numbers[1];
		for(int i = 1; i < numbers.length; i++){
			if (numbers[i] > max){
				secondMax = max;
				max = numbers[i];
			} else if (max == secondMax) {
				secondMax = numbers[i];
			} else if (numbers[i] > secondMax) {
				secondMax = numbers[i];
			}
		}
		return secondMax;
	}


	public static int[] addAll(int[] origin, int[] other){
		int[] result = new int[origin.length + other.length];
		System.arraycopy(origin, 0, result, 0, origin.length);
		System.arraycopy(other, 0, result, origin.length, other.length);
		origin = result;
		return origin;
	}

//	public static int[] subArray(int[] array, int start, int end){
//		int[]result = new int[end - start + 1];
//		System.out.println(result.length);
//		System.arraycopy(array, 0, result, 0, end - start + 1);
//		return result;
//	}

	public static int[] subArray(int[] array, int start, int end){
		int[] result = new int[end - start + 1];
		for(int i = start; i < array.length; i++){
			do{
				result[i] = array[i];
			} while(i != end);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input size: ");
		int size = input.nextInt();
		int[] array = inputArray(size, input);

		System.out.println("Second max: " + secondMax(array));

		System.out.print("Input size: ");
		int size2 = input.nextInt();
		int[]other = inputArray(size2, input);

		array = addAll(array, other);
		System.out.println("Add all: " + Arrays.toString(array));

		System.out.print("Input start: ");
		int start = input.nextInt();
		System.out.print("Input end: ");
		int end = input.nextInt();

		System.out.println("Sub array: " + Arrays.toString(subArray(array , start , end)));

	}
}
