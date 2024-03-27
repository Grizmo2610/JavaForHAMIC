package generateautotest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateMatrixAutoTest {
	static Random random = new Random();

	public static int[][] randomMatrix(int r, int c){
		int[][] matrix = new int[r][c];
		for (int i = 0 ; i < r; i++){
			for (int j = 0; j < c; j++){
				matrix[i][j] = random.nextInt(r * c) + 1;
			}
		}
		return matrix;
	}

	public static void write(String filePath, String content){
		content = content.trim();
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

			writer.write(content);

			writer.close();

			System.out.println("Nội dung đã được ghi vào file thành công.");
		} catch (IOException e) {
			System.out.println("Đã xảy ra lỗi khi ghi vào file: " + e.getMessage());
		}
	}

	public static void write(int exercise, String input, String output){
		String path = "src/autotest/matrix/data/exercise0";
		String inputPath = path + exercise + "/input.txt";
		String outputPath= path + exercise + "/output.txt";
		write(inputPath, input);
		write(outputPath, output);
	}


	public static String matrixToString(int[][] matrix){
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				result.append(matrix[i][j]);
				if (j < matrix[0].length - 1){
					result.append(" ");
				}
			}
			if (i < matrix.length -1){
				result.append("\n");
			}
		}
		return result.toString();
	}

	public static String helper(int row, int col){
		return row + " " + col + "\n";
	}

	public static int[][] reshape(int[][] matrix, int r, int c){
		int m = matrix.length;
		int n = matrix[0].length;
		if (r * c != m * n){
			return matrix;
		}
		int[][] result = new int[r][c];
		for (int i = 0, j = 0; i < m * n && j < r * c; i++, j++) {
			result[j / c][j % c] = matrix[i / n][i % n];
		}
		return result;
	}


	public static void reshapeGenerateTest(int sample){
		StringBuilder input  = new StringBuilder(sample + "\n");
		StringBuilder output = new StringBuilder(sample + "\n");
		for (int i = 0; i < sample; i++){
			// Input data
			int r = random.nextInt(20) + 1;
			int c = random.nextInt(20) + 1;
			int[][] matrix = randomMatrix(r, c);
			int row, col;
			if (random.nextBoolean()){
				row = random.nextInt(20) + 1;
				col = random.nextInt(20) + 1;
			}else{
				row = random.nextInt(20) + 1;
				col = r * c / row;
			}


			// Write input data
			input.append(helper(r, c));
			input.append(matrixToString(matrix)).append("\n");
			input.append(helper(row, col));

			// Output data
			int[][] result = reshape(matrix, row, col);

			//Write output data
			output.append(helper(result.length, result[0].length));
			output.append(matrixToString(result)).append("\n");
		}
		write(1,input.toString() , output.toString());
	}

	public static int[][] lowerTriangleMatrix(int[][] matrix){
		if (matrix.length != matrix[0].length){
			return matrix;
		}
		int[][] result = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix.length; j++){
				if (i >= j){
					result[i][j] = matrix[i][j];
				}
			}
		}
		return result;
	}

	public static void lowerTriangleMatrixGenerateTest(int sample){
		StringBuilder input  = new StringBuilder(sample + "\n");
		StringBuilder output = new StringBuilder(sample + "\n");
		for (int i = 0; i < sample; i++){
			// Input data
			int r, c;
			if (random.nextBoolean()){
				r = random.nextInt(20) + 1;
				c = random.nextInt(20) + 1;
			}else{
				r = random.nextInt(20) + 1;
				c = r;
			}

			int[][] matrix = randomMatrix(r, c);

			// Write input data
			input.append(helper(r, c));
			input.append(matrixToString(matrix)).append("\n");

			// Output data
			int[][] result = lowerTriangleMatrix(matrix);

			//Write output data
			output.append(helper(result.length, result[0].length));
			output.append(matrixToString(result)).append("\n");
		}
		write(2,input.toString() , output.toString());
	}

	public static int[] convertToArray(int[][] matrix){
		int[] result = new int[matrix.length * matrix[0].length];
		int index = 0;
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				result[index] = matrix[i][j];
				index++;
			}
		}
		return result;
	}

	public static void convertToArrayGenerateTest(int sample){
		StringBuilder input  = new StringBuilder(sample + "\n");
		StringBuilder output = new StringBuilder(sample + "\n");
		for (int i = 0; i < sample; i++){
			// Input data
			int r = random.nextInt(20) + 1;
			int c = random.nextInt(20) + 1;
			int[][] matrix = randomMatrix(r, c);

			// Write input data
			input.append(helper(r, c));
			input.append(matrixToString(matrix)).append("\n");

			// Output data
			int[] result = convertToArray(matrix);

			//Write output data
			output.append(GenerateArrayAutoTest.ArrayToString(result)).append("\n");
		}
		write(3,input.toString() , output.toString());
	}



	public static int[] colMean(int[][] matrix){
		int[] means = new int[matrix[0].length];
		for (int col = 0; col < matrix[0].length; col++){
			int sum = 0;
			for (int row = 0; row < matrix.length; row++){
				sum += matrix[row][col];
			}
			means[col] = sum / matrix.length;
		}
		return means;
	}

	public static void colMeanGenerateTest(int sample){
		StringBuilder input  = new StringBuilder(sample + "\n");
		StringBuilder output = new StringBuilder(sample + "\n");
		for (int i = 0; i < sample; i++){
			// Input data
			int r = random.nextInt(20) + 1;
			int c = random.nextInt(20) + 1;
			int[][] matrix = randomMatrix(r, c);

			// Write input data
			input.append(helper(r, c));
			input.append(matrixToString(matrix)).append("\n");

			// Output data
			int[] result = colMean(matrix);

			//Write output data
			output.append(GenerateArrayAutoTest.ArrayToString(result)).append("\n");
		}
		write(4,input.toString() , output.toString());
	}

	public static void main(String[] args) {
		int sample = 200;
		reshapeGenerateTest(sample);
		lowerTriangleMatrixGenerateTest(sample);
		convertToArrayGenerateTest(sample);
		colMeanGenerateTest(sample);
	}
}
