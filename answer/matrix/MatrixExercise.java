package answer.matrix;
/**
 * DON'T TOUCH OR CHANGE ANYTHING IN THIS FILE!
 */

import autotest.array.Exercise;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Helper structure
 */
class MyStructure {
	int[][] matrix;

	public MyStructure(int[][] matrix) {
		this.matrix = matrix;
	}

	@Override
	public String toString() {
		return "Matrix: \n" + MatrixExercise.matrixToString(matrix);
	}
}

public interface MatrixExercise {
	/**
	 *This method get input from input.txt
	 *
	 * @param exercise number of exercise
	 * @return input data
	 * @throws FileNotFoundException student must read tutorial to using auto test
	 */
	static ArrayList<MyStructure> input(int exercise) throws FileNotFoundException {
		String path = "src/autotest/matrix/data/exercise0" + exercise + "/input.txt";
		Scanner input;
		try{
			input = new Scanner(new File(path));
		}catch (FileNotFoundException e){
			throw new FileNotFoundException("Check tutorial for auto test");
		}
		ArrayList<MyStructure> data   = new ArrayList<>();
		int sample = Integer.parseInt(input.nextLine());
		for (int test = 0; test < sample; test++){
			String[] temp = input.nextLine().trim().split(" ");
			int r = Integer.parseInt(temp[0]);
			int c = Integer.parseInt(temp[1]);
			int[][] matrix = new int[r][c];
			for (int i = 0; i < r; i++){
				matrix[i] = MatrixExercise.toIntegerArray(input.nextLine().trim().split(" "));
			}
			data.add(new MyStructure(matrix));
		}
		return data;
	}

	/**
	 *This method get output from output.txt
	 *
	 * @param exercise number of exercise
	 * @return output for exercise
	 * @throws FileNotFoundException student must read tutorial to using auto test
	 */
	static ArrayList<int[][]> output(int exercise) throws FileNotFoundException {
		String path = "src/autotest/matrix/data/exercise0" + exercise + "/output.txt";
		Scanner input;
		try{
			input = new Scanner(new File(path));
		}catch (FileNotFoundException e){
			throw new FileNotFoundException("Check tutorial for auto test");
		}
		ArrayList<int[][]> data = new ArrayList<>();
		int sample = Integer.parseInt(input.nextLine());

		for (int test = 0; test < sample; test++){
			String[] temp = input.nextLine().trim().split(" ");
			int r = Integer.parseInt(temp[0]);
			int c = Integer.parseInt(temp[1]);
			int[][] matrix = new int[r][c];
			for (int i = 0; i < r; i++){
				matrix[i] = MatrixExercise.toIntegerArray(input.nextLine().trim().split(" "));
			}
			data.add(matrix);
		}
		return data;
	}

	/**
	 * Other method to get test from output.txt
	 *
	 * @param path path to output.txt
	 * @return output data
	 * @throws FileNotFoundException student must read tutorial to using auto test
	 */
	static ArrayList<int[]> output(String path) throws FileNotFoundException {
		Scanner input;
		try{
			input = new Scanner(new File(path));
		}catch (FileNotFoundException e){
			throw new FileNotFoundException("Check tutorial for auto test");
		}
		ArrayList<int[]> data = new ArrayList<>();
		int sample = Integer.parseInt(input.nextLine());

		for (int test = 0; test < sample; test++){
			int[] array = MatrixExercise.toIntegerArray(input.nextLine().trim().split(" "));
			data.add(array);
		}
		return data;
	}


	/**
	 * This method using ro running test for each exercise
	 *
	 * @throws FileNotFoundException Student need to check auto test tutorial before start
	 */
	void test() throws FileNotFoundException;

	static boolean equals(int[][] solution, int[][] answer){
		if (solution.length != answer.length || solution[0].length != answer[0].length){
			return false;
		}

		for (int i = 0; i < solution.length;i++){
			for (int j = 0; j < solution[0].length; j++){
				if (solution[i][j] != answer[i][j]){
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * This method convert matrix to string to writing to file
	 *
	 * @param matrix matrix need to convert
	 * @return String represent for matrix
	 */
	static String matrixToString(int[][] matrix){
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

	/**
	 * Check end display information if test were wrong!
	 *
	 * @param solution Your answer
	 * @param result real answer
	 * @param input input data
	 * @param test number of test case
	 * @return true if your answer is wrong
	 */
	static boolean wrongAnswer(int[][] solution, int[][] result, String input, int test){
		if (!equals(solution , result)){
			System.out.println("Wrong answer in test " + (test + 1));
			System.out.println("Input: ");
			System.out.println(input);
			System.out.println("Output: ");
			System.out.println(matrixToString(solution));
			System.out.println("Expected: ");
			System.out.println(matrixToString(result));
			return true;
		}return false;
	}

	/**
	 * Other method to check if your answer is wrong or not
	 *
	 * @param solution Your solution
	 * @param result answer
	 * @param input input data
	 * @param test number of test case
	 * @return true if you are wrong
	 */
	static boolean wrongAnswer(int[] solution, int[] result, int[][] input, int test){
		if (solution == null || Exercise.notEqual(solution , result)){
			System.out.println("Wrong answer in test " + (test + 1));
			System.out.println("Input: ");
			System.out.println(MatrixExercise.matrixToString(input));
			System.out.println("Output: ");
			System.out.println(Arrays.toString(solution));
			System.out.println("Expected: ");
			System.out.println(Arrays.toString(result));
			return true;
		}return false;
	}

	/**
	 * This method convert a String array to integer array
	 *
	 * @param array String array need to convert
	 * @return integer array from String array
	 */
	static int[] toIntegerArray(String[] array){
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++){
			try{
				result[i] = Integer.parseInt(array[i]);
			}catch (Exception e){
				System.out.println(array[i]);

			}

		}
		return result;
	}
}

/**
 * Special structure for exercise 01
 */
class MyExercise01Structure extends MyStructure {
	int r, c;

	public MyExercise01Structure(int r , int c , int[][] matrix) {
		super(matrix);
		this.r = r;
		this.c = c;
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nr = " + r + ", c = " + c;
	}
}

class Exercise01 implements MatrixExercise {

	/**
	 * Special method to get input for exercise 01
	 *
	 * @return input data
	 * @throws FileNotFoundException student must read tutorial to using auto test
	 */
	static ArrayList<MyExercise01Structure> input() throws FileNotFoundException {
		Scanner input;
		try{
			input = new Scanner(new File("src/autotest/matrix/data/exercise01/input.txt"));
		}catch (FileNotFoundException e){
			throw new FileNotFoundException("Check tutorial for auto test");
		}
		ArrayList<MyExercise01Structure> data   = new ArrayList<>();
		int sample = Integer.parseInt(input.nextLine());
		for (int test = 0; test < sample; test++){
			String[] temp = input.nextLine().trim().split(" ");
			int r = Integer.parseInt(temp[0]);
			int c = Integer.parseInt(temp[1]);
			int[][] matrix = new int[r][c];
			for (int i = 0; i < r; i++){
				matrix[i] = MatrixExercise.toIntegerArray(input.nextLine().trim().split(" "));
			}
			temp = input.nextLine().trim().split(" ");
			int row = Integer.parseInt(temp[0]);
			int col = Integer.parseInt(temp[1]);

			data.add(new MyExercise01Structure(row , col , matrix));
		}

		return data;
	}

	/**
	 * This method using ro running test for each exercise
	 *
	 * @throws FileNotFoundException student must read tutorial to using auto tes
	 */
	@Override
	public void test() throws FileNotFoundException {
		ArrayList<MyExercise01Structure> input  = input();
		ArrayList<int[][]> output = MatrixExercise.output(1);
		for (int testCase = 0; testCase < input().size(); testCase++){
			MyExercise01Structure test   = input.get(testCase);
			int[][] result = Matrix.reshape(test.matrix, test.r, test.c);
			if (MatrixExercise.wrongAnswer(result, output.get(testCase), test.toString(), testCase)){
				return;
			}
		}
		System.out.println("Accepted");
	}
}

class Exercise02 implements MatrixExercise{
	/**
	 * This method using ro running test for each exercise
	 *
	 * @throws FileNotFoundException Student need to check auto test tutorial before start
	 */
	@Override
	public void test() throws FileNotFoundException {
		ArrayList<MyStructure> input  = MatrixExercise.input(2);
		ArrayList<int[][]> output = MatrixExercise.output(2);
		for (int testCase = 0; testCase < input.size(); testCase++){
			MyStructure test = input.get(testCase);
			int[][] result = Matrix.lowerTriangleMatrix(test.matrix);
			if (MatrixExercise.wrongAnswer(result, output.get(testCase), test.toString(), testCase)){
				return;
			}
		}
		System.out.println("Accepted");
	}
}

class Exercise03 implements MatrixExercise{
	/**
	 * This method using ro running test for each exercise
	 *
	 * @throws FileNotFoundException Student need to check auto test tutorial before start
	 */
	@Override
	public void test() throws FileNotFoundException {
		ArrayList<MyStructure> input  = MatrixExercise.input(3);
		String path = "src/autotest/matrix/data/exercise03/output.txt";
		ArrayList<int[]> output = MatrixExercise.output(path);
		for (int testCase = 0; testCase < input.size(); testCase++){
			MyStructure test = input.get(testCase);
			int[] result = Matrix.convertToArray(test.matrix);
			if (MatrixExercise.wrongAnswer(result, output.get(testCase),test.matrix, testCase)){
				return;
			}
		}
		System.out.println("Accepted");
	}
}

class Exercise04 implements MatrixExercise{

	/**
	 * This method using ro running test for each exercise
	 *
	 * @throws FileNotFoundException Student need to check auto test tutorial before start
	 */
	@Override
	public void test() throws FileNotFoundException {
		ArrayList<MyStructure> input  = MatrixExercise.input(4);
		String path = "src/autotest/matrix/data/exercise04/output.txt";
		ArrayList<int[]> output = MatrixExercise.output(path);
		for (int testCase = 0; testCase < input.size(); testCase++){
			MyStructure test = input.get(testCase);
			int[] result = Matrix.colMean(test.matrix);
			if (MatrixExercise.wrongAnswer(result, output.get(testCase),test.matrix, testCase)){
				return;
			}
		}
		System.out.println("Accepted");
	}
}