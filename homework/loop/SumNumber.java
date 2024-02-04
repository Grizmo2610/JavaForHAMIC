package homework.loop;

import java.util.Scanner;

public class SumNumber {
	public static int sum(int l, int r, int t){
		int sum = 0;
		for (int i = l; i <= r; i++){
			if (i % t == 0){
				System.out.println("Current sum: " + sum);
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input left bound: ");
		int l = input.nextInt();
		System.out.print("Input right bound: ");
		int r = input.nextInt();
		System.out.print("Input divisor number: ");
		int t = input.nextInt();

		int sum = sum(l, r, t);
		System.out.println("Sum of all numbers divisible by " + t + " in the range [" + l + ", " + r +"] is: " + sum);
		input.close();
	}
}
