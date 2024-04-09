package homework.condition;

import java.util.Scanner;

public class ValidDay {
	public static boolean isLeapYear(int year){
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

	public static int maxDayInMonth(int month, int year){
		if (month == 2){
			if (isLeapYear(year)){
				return 29;
			}return 28;
		} else if (month == 4 || month == 6 || month == 9 || month == 11){
			return 30;
		}return 31;
	}

	public static boolean validDay(int day, int month, int year){
		if (month > 12 || month < 1){
			return false;
		} else if (day < 1 || day > maxDayInMonth(month, year)){
			return false;
		} else return year >= 1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day = input.nextInt();
		int month = input.nextInt();
		int year = input.nextInt();
		System.out.println(validDay(day,month,year));
	}
}
