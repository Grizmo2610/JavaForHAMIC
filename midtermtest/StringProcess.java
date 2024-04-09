package midtermtest;

import java.util.Scanner;

public class StringProcess {
	public static String helper(int number){
		if (number < 10){
			return "0" + number;
		}return "" + number;
	}

	public static String timeConverter(int second){
		int hour = (second / 3600) % 24;
		second %= 3600;
		int minute = (second / 60);
		second %= 60;

		return helper(hour) + ":" + helper(minute) + ":" + helper(second);
	}

	public static int count(String text, char c){
		int count = 0;
		for (char x: text.toCharArray()){
			if (x == c){
				count++;
			}
		}
		return count;
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input time: ");
		int seconds = input.nextInt();
		System.out.println("Time: " +timeConverter(seconds));

		System.out.print("Input text: ");
		String text = input.next();
		System.out.print("Input character: ");
		char c = input.next().charAt(0);

		System.out.println("Count: "  + count(text, c));
	}
}
