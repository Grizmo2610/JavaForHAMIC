package midtermtest;

import java.util.Scanner;

public class Matrix {
	public static int[][] inputMatrix(int r, int c, Scanner input){
		int[][] matrix = new int[r][c];
		for (int i = 0; i < r; i++){
			System.out.print("Input " + (i + 1) + "/" + r + "-th round: ");
			for (int j = 0; j < c; j++){
				matrix[i][j] = input.nextInt();
			}
		}
		return matrix;
	}

	public static int max(int[][] origin){
		int max = origin[0][0];
		for (int[] ins : origin){
			for (int j = 0; j < origin[0].length; j++){
				if (ins[j] > max) {
					max = ins[j];
				}
			}
		}
		return max;
	}

	public static int[][]transpose(int[][] matrix){
		int [][] result = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				result[j][i] = matrix[i][j];
			}
		}
		return result;
	}

	public static int[][] upperTriangularMatrix(int[][] matrix){
		int [][] result = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				if (j >= i){
					result[i][j] = matrix[i][j];
				}

			}
		}
		return result;
	}

	public static void printMatrix(int[][] matrix){
		for (int[] ints : matrix){
			for (int j = 0; j < matrix[0].length; j++){
				System.out.print(ints[j]);
				if (j < matrix[0].length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input row size: ");
		int r = input.nextInt();
		System.out.print("Input column size: ");
		int c = input.nextInt();
		int[][] matrix = inputMatrix(r, c, input);

		System.out.println("Max: " + max(matrix));

		System.out.println("Transpose");
		printMatrix(transpose(matrix));

		System.out.println("Upper Triangular Matrix");
		printMatrix(upperTriangularMatrix(matrix));
	}
}
