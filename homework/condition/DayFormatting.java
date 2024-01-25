package homework.condition;

import java.util.Scanner;

public class DayFormatting {
	public static String formatNumber(int number){
		if (number < 10){
			return "0" + number;
		}return number + "";
	}

	public static String dayFormatting(int day, int month, int year){
		return formatNumber(day) + "/" + formatNumber(month) + "/" + formatNumber(year);
	}

	public static void display(int day, int month, int year){
		System.out.println(dayFormatting(day,month,year));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input day: ");
		int day = input.nextInt();
		System.out.print("Input month: ");
		int month = input.nextInt();
		System.out.print("Input year: ");
		int year = input.nextInt();
		display(day, month,year);
		input.close();
	}
}
