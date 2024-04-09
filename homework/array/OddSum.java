package homework.array;

import java.util.Scanner;

public class OddSum {
	public static int sum(int n){
		int sum = 1;
		for (int i = 1; i <= n; i++){
			if (i % 2 != 0){
				sum *= i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		System.out.println(sum(n));
	}
}
