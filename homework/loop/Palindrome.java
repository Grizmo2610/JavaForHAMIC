package homework.loop;

import java.util.Scanner;

public class Palindrome {
	public static int reverseNumber(int number){
		int reversedNumber = 0;
		while (number > 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number /= 10;
		}

		return reversedNumber;
	}

	public static boolean isPalindrome(int number){
		return number == reverseNumber(number);
	}

	public static void display(int number){
		if (isPalindrome(number)){
			System.out.println(number + " is a palindrome number!");
		}else {
			System.out.println(number + " is not a palindrome number!");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input number: ");
		int number = input.nextInt();
		input.close();

		display(number);
	}
}
