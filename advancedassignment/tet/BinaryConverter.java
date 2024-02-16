package advancedassignment.tet;

import java.util.Scanner;

/**
 * Exercise 13: Binary Converter
 *
 * @version 1.0
 * @author Hoang Tu
 */


public class BinaryConverter {

	public static String convert(int number){
		StringBuilder result = new StringBuilder();
		while (number > 0){
			result.insert(0 , (number % 2));
			number /= 2;
		}

		return result.toString();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(convert(number));
		input.close();
	}
}
