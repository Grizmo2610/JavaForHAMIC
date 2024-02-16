package advancedassignment.tet;

import java.util.Scanner;

/**
 * Exercise 18: Palindrome String
 *
 * @version 1.0
 * @author Hoang Tu
 */
public class PalindromeString {
	public static boolean isPalindrome(String s){
		for (int i = 0; i < s.length() / 2; i++){
			if (s.charAt(i) != s.charAt(s.length() - i - 1)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		System.out.println(isPalindrome(s));
		input.close();
	}
}
