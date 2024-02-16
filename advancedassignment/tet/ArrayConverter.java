package advancedassignment.tet;

import java.util.Scanner;

/**
 * Exercise 15: Array converter
 *
 * @version 1.0
 * @author Hoang Tu
 */

public class ArrayConverter {
	public static int[] inputArray(Scanner input, int size){
		int[] array = new int[size];
		for(int i = 0 ; i < size; i++){
			array[i] = input.nextInt();
		}
		return array;
	}

	public static int[][] convert(int[] original, int m, int n){
		if (original.length != m * n){
			return new int[][]{};
		}

		int[][] result = new int[m][n];
		for (int i = 0; i < m * n; i++){
			result[i / n][i % n] = original[i];

		}
		return result;
	}

	public static void printMatrix(int[][] matrix){
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j]);
				if (j != matrix[0].length - 1){
					System.out.print(" ");
				}
			}
			if (i != matrix.length - 1){
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] array = inputArray(input, size);

		int m = input.nextInt();
		int n = input.nextInt();

		printMatrix(convert(array,m,n));
		input.close();
	}
}
