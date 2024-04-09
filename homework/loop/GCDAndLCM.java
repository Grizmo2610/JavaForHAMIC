package homework.loop;

import java.util.Scanner;

public class GCDAndLCM {
	public static int checkPositive(int number){
		if (number < 0){
			return - number;
		}return number;
	}
	public static int gcdUsingLoop(int a, int b){
		a = checkPositive(a);
		b = checkPositive(b);

		int gcd = 1;
		int min = a;
		if (b < min){
			min = b;
		}

		for (int i = 1; i <= min; i++){
			if (a % i == 0 && b % i == 0){
				gcd = i;
			}
		}
		return gcd;
	}

	public static int gcdUsingEuclid(int a, int b){
		a = checkPositive(a);
		b = checkPositive(b);
		while (b != 0){
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	public static int lcm(int a, int b){
		a = checkPositive(a);
		b = checkPositive(b);
		return Math.abs(a * b) / gcdUsingEuclid(a, b);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = input.nextInt();
		System.out.print("Input second number: ");
		int b = input.nextInt();
		System.out.println("GCD of " + a + " and " + b + " using loop is: " + gcdUsingLoop(a, b));
		System.out.println("GCD of " + a + " and " + b + " using euclid is: " + gcdUsingEuclid(a, b));
		System.out.println("LCM of " + a + " and " + b + " using euclid is: " + lcm(a, b));
		input.close();
	}
}
