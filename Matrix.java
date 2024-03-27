import java.util.Scanner;
import java.util.Random;

public class Matrix {
	public static int[][] inputMatrix(int r, int c, Scanner input){
		int[][] result = new int[r][c];
		for (int i = 0; i < r; i++){
			System.out.println("Input " + (i + 1) +"/" + r +"-th row: ");
			for(int j = 0; j < c; j++){
				result[i][j] = input.nextInt();
			}
		}
		return result;
	}
	public static int max(int[][] origin){
		int max = origin[0][0];
		for (int i = 0; i < origin.length; i++){
			for(int j = 0; j < origin[0].length; j++){
				if (origin[i][j] > max){
					max = origin[i][j];
				}
			}
		}
		return max;
	}

//	public static int[][]transpose(int[][] matrix){
//		int[][]result = new int[matrix[0].length][matrix.length];
//		for(int i = 0; i < matrix.length; i++){
//			for(int j = 0; j < matrix[0].length; j++){
//				result[j][i] = matrix[i][j];
//			}
//		}
//		return result;
//	}

	public static int[][] transpose(int[][] matrix) {
		int row = matrix.length;
		int column = matrix[0].length;
		int[][] transposeMatrix = new int[row][column];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = transposeMatrix[j][i];
			}
		}

		return transposeMatrix;
	}

	public static int[][] upperTriangularMatrix(int[][] matrix){
		if (matrix.length != matrix[0].length){
			return matrix;
		}
		int[][]result = new int[matrix.length][matrix[0].length];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if (j >= i){
					result[i][j] = matrix[i][j];
				}
			}
		}
		return result;
	}

	public static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j]);
				if(j < matrix[0].length - 1){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input row: ");
		int r = input.nextInt();
		System.out.print("Input column: ");
		int c = input.nextInt();

		int[][] matrix = inputMatrix(r, c, input);
		printMatrix(matrix);

		System.out.println("Max: " + max(matrix));

		System.out.println("Transpose: ");
		printMatrix(transpose(matrix));

		System.out.println("Upper triangle matrix: ");
		printMatrix(upperTriangularMatrix(matrix));
	}
}