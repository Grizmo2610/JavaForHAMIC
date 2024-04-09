package advancedassignment.tet;

import java.util.Scanner;
/**
 * Exercise 06: Calculate Fibonacci
 *
 * @version 1.0
 * @author Hoang Tu
 */

public class Fibonacci {
	public static int calculateFibonacci(int n){
		int[] f = {0, 1};
		if (n < 0){
			return 0;
		} else if (n < 2){
			return f[n];
		}

		int fn = 1;
		for (int i = 2; i <= n; i++){
			fn = f[1] + f[0];
			f[0] = f[1];
			f[1] = fn;
		}
		return fn;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(calculateFibonacci(n));
		input.close();
	}
}
