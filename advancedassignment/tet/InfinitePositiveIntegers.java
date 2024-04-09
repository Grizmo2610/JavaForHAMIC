package advancedassignment.tet;

import java.util.Scanner;
/**
 * Exercise 07: Infinite positive integers
 *
 * @version 1.0
 * @author Hoang Tu
 */
public class InfinitePositiveIntegers {
	public static int calculateSum(){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int value;
		while (true){
			value = input.nextInt();
			if (value != -1){
				sum += value;
			}else {
				break;
			}
		}
		input.close();
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(calculateSum());
	}
}
