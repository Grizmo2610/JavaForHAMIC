package homework.condition;

import java.util.Scanner;

public class LeapYear {
	public static boolean isLeapYear(int year){
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}

	public static void display(int year){
		if (isLeapYear(year)){
			System.out.println(year + " is a leap year!");
		}else {
			System.out.println(year + " is not a leap year!");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input year to check: ");
		int year = input.nextInt();
		display(year);
		input.close();
	}
}
