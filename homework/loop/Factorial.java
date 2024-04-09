package homework.loop;

import java.util.Scanner;

public class Factorial  {
	public static long factorial(int n){
		int result = 1;
		for (int i = 2; i <= n; ++i){
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input number: ");
		int number = input.nextInt();
		input.close();
		System.out.println("Result: " + factorial(number));
	}
}
