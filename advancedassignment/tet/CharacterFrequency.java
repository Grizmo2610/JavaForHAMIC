package advancedassignment.tet;

import java.util.Scanner;

/**
 * Exercise 20: Character Frequency
 *
 * @version 1.0
 * @author Hoang Tu
 */
public class CharacterFrequency {
	public static int[] frequency(String s){
		int[] frequency = new int[128];
		for (int i = 0; i < s.length(); i++){
			frequency[s.charAt(i)]++;
		}
		return frequency;
	}
	public static void display(int[] result){
		for (int i = 0; i < result.length; i++){
			if (result[i] != 0){
				System.out.println("\"" + ((char) i ) + "\"" + ":" + result[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		input.close();
		display(frequency(s));

	}
}
