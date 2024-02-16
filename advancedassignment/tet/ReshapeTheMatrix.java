package advancedassignment.tet;

import java.util.Scanner;
/**
 * Exercise 16: Reshape the Matrix
 *
 * @version 1.0
 * @author Hoang Tu
 */

public class ReshapeTheMatrix {
	public static int[][] matrixReshape(int[][] mat, int r, int c){
		int m = mat.length;
		int n = mat[0].length;
		if (r * c != m * n){
			return mat;
		}
		int[][] result = new int[r][c];
		for (int i = 0, j = 0; i < m * n && j < r * c; i++, j++) {
			result[j / c][j % c] = mat[i / n][i % n];
		}
		return result;
	}

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

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = input.nextInt();
		int[][] matrix = inputMatrix(input, m, n);
		int r = input.nextInt();
		int c = input.nextInt();
		input.close();

		printMatrix(matrixReshape(matrix, r, c));

	}
}
