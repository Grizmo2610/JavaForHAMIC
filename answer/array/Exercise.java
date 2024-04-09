package answer.array;
/**
 * DON'T TOUCH OR CHANGE ANYTHING IN THIS FILE!
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public interface Exercise {
	/**
	 * This method get input from input.txt
	 *
	 * @return input for test
	 * @throws FileNotFoundException student must read tutorial to using auto test
	 */
	static ArrayList<int[]> input(int exercise) throws FileNotFoundException {
		String path = "src/autotest/array/data/exercise0" + exercise + "/input.txt";
		Scanner input;
		try{
			File file = new File(path);
			input = new Scanner(file);
		}catch (FileNotFoundException e){
			throw new FileNotFoundException("Check autotest tutorial!");
		}
		ArrayList<int[]> data = new ArrayList<>();
		while (input.hasNextLine()){
			String[] str = input.nextLine().trim().split(" ");

			int[] numbers = new int[str.length];
			for (int i = 0; i < numbers.length; i++){
				numbers[i] = Integer.parseInt(str[i]);
			}
			data.add(numbers);
		}
		return data;
	}

	/**
	 * This method get result from output.txt
	 *
	 * @return result for each test
	 * @throws FileNotFoundException student must read tutorial to using auto test
	 */
	static ArrayList<int[]> output(int exercise) throws FileNotFoundException {
		String path = "src/autotest/array/data/exercise0" + exercise + "/output.txt";
		Scanner input;
		try{
			File file = new File(path);
			input = new Scanner(file);
		}catch (FileNotFoundException e){
			throw new FileNotFoundException("Check autotest tutorial!");
		}
		ArrayList<int[]> data = new ArrayList<>();
		while (input.hasNextLine()){
			String[] str = input.nextLine().trim().split(" ");
			int[] numbers = new int[str.length];
			for (int i = 0; i < numbers.length; i++){
				numbers[i] = Integer.parseInt(str[i]);
			}
			data.add(numbers);
		}
		return data;
	}

	/**
	 * Compare two solution if they equal or not
	 *
	 * @param solution student solution
	 * @param result expected right answer
	 * @return true if student solution are right
	 */
	static boolean notEqual(int[] solution, int[] result){
		if (solution.length != result.length){
			return true;
		}
		for (int i = 0; i < solution.length; i++){
			if (solution[i] != result[i]){
				return true;
			}
		}
		return false;
	}

	/**
	 * This method using ro running test for each exercise
	 *
	 * @throws FileNotFoundException student must read tutorial to using auto tes
	 */
	void test() throws FileNotFoundException;

	static boolean wrongAnswer(int[] solution, int[] result, int[] input, int test){
		if (notEqual(solution , result)){
			System.out.println("Wrong answer in test " + (test + 1));
			System.out.println("Input: ");
			System.out.println(Arrays.toString(input));
			System.out.println("Output: ");
			System.out.println(Arrays.toString(solution));
			System.out.println("Expected: ");
			System.out.println(Arrays.toString(result));
			return true;
		}return false;
	}
	static boolean wrongAnswer(int[] solution, int[] result, int[] input, int target, int test){
		if (notEqual(solution , result)){
			System.out.println("Wrong answer in test " + (test + 1));
			System.out.println("Input: ");
			System.out.println("Nums = " + Arrays.toString(input));
			System.out.println("Target = " + target);
			System.out.println("Output: ");
			System.out.println(Arrays.toString(solution));
			System.out.println("Expected: ");
			System.out.println(Arrays.toString(result));
			return true;
		}return false;
	}
}

class Exercise01 implements Exercise{
	public void test() throws FileNotFoundException {
		ArrayList<int[]> input = Exercise.input(1);
		ArrayList<int[]> output = Exercise.output(1);
		for (int i = 0; i < input.size(); i++){
			int[] result = Array.runningSum(input.get(i));
			if (Exercise.wrongAnswer(result, output.get(i), input.get(i) , i )){
				return;
			}
		}
		System.out.println("Accepted");
	}

	@Override
	public String toString(){
		return "Exercise 01";
	}
}

class Exercise02 implements Exercise{
	public void test() throws FileNotFoundException {
		ArrayList<int[]> input = Exercise.input(2);
		ArrayList<int[]> output = Exercise.output(2);
		for (int i = 0; i < input.size(); i++){
			int[] result = Array.buildArray(input.get(i));
			if (Exercise.wrongAnswer(result, output.get(i), input.get(i) , i )){
				return;
			}
		}
		System.out.println(getClass().getSimpleName() + " Accepted");
	}
}

class Exercise03 implements Exercise{
	/**
	 * This method using ro running test for each exercise
	 *
	 * @throws FileNotFoundException student must read tutorial to using auto tes
	 */
	@Override
	public void test() throws FileNotFoundException {
		ArrayList<int[]> input = Exercise.input(3);
		ArrayList<int[]> output = Exercise.output(3);
		for (int i = 0; i < input.size(); i++){
			int[] result = Array.shuffle(input.get(i), input.get(i).length / 2);
			if (Exercise.wrongAnswer(result, output.get(i), input.get(i) , i )){
				return;
			}
		}
		System.out.println(getClass().getSimpleName() + " Accepted");
	}
}

class HelperStructures{
	int[] nums;
	int target;

	public HelperStructures(int[] nums , int target) {
		this.nums = nums;
		this.target = target;
	}
}

class Exercise04 implements Exercise{

	/**
	 * This method get input from input.txt
	 *
	 * @return input for test
	 * @throws FileNotFoundException student must read tutorial to using auto tes
	 */
	private static ArrayList<HelperStructures> input() throws FileNotFoundException {
		String path = "src/autotest/array/data/exercise04/input.txt";

		Scanner input;
		try{
			File file = new File(path);
			input = new Scanner(file);
		}catch (FileNotFoundException e){
			throw new FileNotFoundException("Check autotest tutorial!");
		}
		ArrayList<HelperStructures> data = new ArrayList<>();
		while (input.hasNextLine()){
			String[] str = input.nextLine().trim().split(",");
			String[] s = str[0].split(" ");
			int target = Integer.parseInt(str[1]);
			int[] numbers = new int[s.length];
			for (int i = 0; i < numbers.length; i++){
				numbers[i] = Integer.parseInt(s[i]);
			}
			data.add(new HelperStructures(numbers, target));
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
		ArrayList<HelperStructures> input = input();
		ArrayList<int[]> output = Exercise.output(4);
		for (int i = 0; i < input.size(); i++){
			int[] result = new int[]{Array.searchInsert(input.get(i).nums, input.get(i).target)};
			if (Exercise.wrongAnswer(result, output.get(i), input.get(i).nums, input.get(i).target, i )){
				return;
			}
		}
		System.out.println(getClass().getSimpleName() + " Accepted");
	}
}

class Exercise05 implements Exercise{

	/**
	 * This method using ro running test for each exercise
	 *
	 * @throws FileNotFoundException student must read tutorial to using auto tes
	 */
	@Override
	public void test() throws FileNotFoundException {
		ArrayList<int[]> input = Exercise.input(5);
		ArrayList<int[]> output = Exercise.output(5);
		for (int i = 0; i < input.size(); i++){
			int[] result = Array.plusOne(input.get(i));
			if (Exercise.wrongAnswer(result, output.get(i), input.get(i) , i )){
				return;
			}
		}
		System.out.println(getClass().getSimpleName() + " Accepted");
	}
}

