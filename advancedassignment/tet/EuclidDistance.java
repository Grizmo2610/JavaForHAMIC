package advancedassignment.tet;

import java.util.Scanner;

/**
 * Exercise 02 Euclid distance.
 *
 * @version 1.0
 * @author Hoang Tu
 */

public class EuclidDistance {
	public static double distance(double x_a, double y_a, double x_b, double y_b){
		return Math.sqrt(Math.pow(x_b - x_a, 2) + Math.pow(y_b - y_a, 2));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x_a = input.nextDouble();
		double y_a = input.nextDouble();
		double x_b = input.nextDouble();
		double y_b = input.nextDouble();
		System.out.println(distance(x_a, y_a, x_b, y_b));
		input.close();
	}
}
