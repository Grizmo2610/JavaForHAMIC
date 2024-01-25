package homework.condition;

import java.util.Scanner;

public class Maximum {
	public static int max(int a, int b, int c){
		if (a > b && a > c){
			return a;
		} else if (b > c && b > a){
			return b;
		}return c;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
		System.out.println(max(a, b, c));
	}
}
