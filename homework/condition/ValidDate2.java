package homework.condition;

import java.util.Scanner;

public class ValidDate2 {
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

	public static void solution(int day, int month, int year){
		int max = maxDayInMonth(month, year);
		if (validDay(day,month, year)){
			if (month == 12 && day == 31){
				System.out.println("01 01 " + (year + 1));
			} else if (day >= max){
				System.out.println("01 " + (month + 1) + " " + year);
			} else{
				System.out.println((day + 1) + " " + month + " " + year);
			}
		}else{
			System.out.println("Not a valid day!");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int     day   = input.nextInt();
		int month = input.nextInt();
		int year = input.nextInt();
		solution(day,month,year);
	}
}
