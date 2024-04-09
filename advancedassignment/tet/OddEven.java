package advancedassignment.tet;

import java.util.Scanner;
/**
 * Exercise 03: Check Odd Even.
 *
 * @version 1.0
 * @author Hoang Tu
 */
public class OddEven {
	public static void solution(int number){
		if (number % 2 == 0){
			System.out.println("EVEN");
		}else{
			System.out.println("ODD");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		solution(number);
		input.close();
	}
}
