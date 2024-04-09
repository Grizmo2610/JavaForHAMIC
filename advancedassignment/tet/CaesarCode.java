package advancedassignment.tet;

import java.util.Scanner;
/**
 * Exercise 19: Caesar Code
 *
 * @version 1.0
 * @author Hoang Tu
 */

public class CaesarCode {
	public static String encryptCaesar(String str, int key) {
		StringBuilder encryptedString = new StringBuilder();
		str = str.toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			char encryptedChar = (char) ('A' + (str.charAt(i) - 'A' + key) % 26);
			encryptedString.append(encryptedChar);
		}
		return encryptedString.toString();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int k = input.nextInt();
		input.close();
		System.out.println(encryptCaesar(s, k));
	}
}
