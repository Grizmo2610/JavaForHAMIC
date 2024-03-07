package homework.array;

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulMatrix {

	public static int[][] inputMatrix(){
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				matrix[i][j] = input.nextInt();
			}
		}
		return matrix;
	}

	public static int[] searchingElement(int[][] matrix, int element){
		for (int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				if (matrix[i][j] == element){
					return new int[]{i, j};
				}
			}
		}
		return new int[]{0};
	}

	public static int calculate(int[][] matrix){
		int[] indexes = searchingElement(matrix, 1);
		int r = indexes[0], c = indexes[1];
		return Math.abs(r - 2) + Math.abs(c - 2);

	}

	public static void main(String[] args) {
		System.out.println(calculate(inputMatrix()));
	}
}
