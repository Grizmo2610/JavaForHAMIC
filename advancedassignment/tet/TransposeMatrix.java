package advancedassignment.tet;

import java.util.Scanner;

/**
 * Exercise 17: Transpose Matrix
 *
 * @version 1.0
 * @author Hoang Tu
 */
public class TransposeMatrix {
	public static int[][] inputMatrix(Scanner input, int row, int col){
		int[][] matrix = new int[row][col];
		for (int i = 0; i < row; i++){
			for (int j = 0; j < col; j++){
				matrix[i][j] = input.nextInt();
			}
		}

		return matrix;
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

	public static int[][] transposeMatrix(int[][] matrix){
		int[][] result = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i ++){
			for (int j = 0; j < matrix[0].length; j++){
				result[j][i] = matrix[i][j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		int[][] matrix = inputMatrix(input, m, n);

		printMatrix(transposeMatrix(matrix));
	}
}
