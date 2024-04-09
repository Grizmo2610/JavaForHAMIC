package homework.loop;

import java.util.Scanner;

public class FirstNumber {
	public static int firstDigit(int number){
		while (number / 10 > 0){
			number /= 10;
		}return number;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input number: ");
		int number = input.nextInt();

		System.out.println("First digit number is: " + firstDigit(number));
		input.close();
	}
}
