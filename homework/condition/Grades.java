package homework.condition;

import java.util.Scanner;

public class Grades {
	public static double avg(double math, double literature, double english){
		return (math + literature + english) / 3;
	}

	public static String classification(double math, double literature, double english){
		double gpa = avg(math, literature,english);
		if (gpa < 4){
			return "F";
		} else if (gpa < 6.5){
			return "C";
		}else if (gpa < 8){
			return "B";
		}return "A";
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double math = input.nextDouble();
		double literature = input.nextDouble();
		double english = input.nextDouble();

		System.out.println(classification(math, literature, english));		
	}
}
