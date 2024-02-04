package homework.loop;

import java.util.Scanner;

public class SumSeries {
	public static int sum(int n){
		int sum = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < n; i++){
			System.out.print("Input "+ (i + 1) +"/" + n + " number: ");
			sum += input.nextInt();
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of series: ");
		int n = input.nextInt();

		System.out.println("Sum of " + n + " number is: " + sum(n));
	}
}
