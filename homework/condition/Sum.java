package homework.condition;

import java.util.Scanner;

public class Sum {
	public static int calculateSum(int l, int r, int t) {
		int u1 = l;
		if (l % t != 0){
			u1 = (l / t + 1) * t;
		}
		int un = r / t * t;
		int n = (un - u1) / t + 1;
		return n * (u1 + un) / 2 ;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int l = input.nextInt(), r = input.nextInt(), t = input.nextInt();

		System.out.println(calculateSum(l, r, t));

	}
}
