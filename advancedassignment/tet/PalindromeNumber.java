package advancedassignment.tet;

import java.util.Scanner;

/**
 * Exercise 05: Palindrome number
 *
 * @version 1.0
 * @author Hoang Tu
 */
public class PalindromeNumber {
	public static int reverseNumber(int number){
		int result = 0;
		while (number > 0){
			result = result * 10 + number % 10;
			number /= 10;
		}
		return result;
	}
	public static boolean isPalindromeNumber(int number){
		return number == reverseNumber(number);
	}
	public static void solution(int number){
		if (isPalindromeNumber(number)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		solution(number);
		input.close();
	}
}
