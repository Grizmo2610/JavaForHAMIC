package midtermtest;

import java.util.Scanner;

public class Loop {
	public static double sin(double x) {
		double sin = 0;
		double term = x;
		double epsilon = 1e-10;
		for (int i = 1; Math.abs(term) > epsilon; i += 2) {
			sin += term;
			term *= -x * x / ((i + 1) * (i + 2));
		}
		return sin;
	}

	public static void printFactor(int number){
		while (number % 2 == 0){
			System.out.print(2);
			number /= 2;
			if (number > 1){
				System.out.print(" ");
			}
		}
		int div = 3;
		while (number > 1 && number >= div){
			while (number % div == 0){
				System.out.print(div);
				number /= div;
				if (number > 1){
					System.out.print(" ");
				}
			}
			div += 2;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input number: ");
		double x = input.nextDouble();

		System.out.println();

		System.out.println("Sin(" + x +") = " + sin(x));
		System.out.println("Math.Sin(" + x +") = " + Math.sin(x));

//		System.out.println("Input number: ");
//		int number = input.nextInt();
//		System.out.print("Factor: ");
//		printFactor(number);
	}
}
