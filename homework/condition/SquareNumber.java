package homework.condition;

import java.util.Scanner;

public class SquareNumber {
	public static boolean isSquare(int number){
		int sqrt = (int) Math.sqrt(number);
		return (sqrt * sqrt) == number;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(isSquare(number));
	}
}
