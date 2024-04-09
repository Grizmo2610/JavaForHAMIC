package advancedassignment.tet;

import java.util.Scanner;

/**
 * Exercise 01: Quadratic Equations Solver.
 *
 * @version 1.0
 * @author Hoang Tu
 */
public class QuadraticEquationsSolver {
	public static double delta(double a, double b, double c){
		return b * b - 4 * a * c;
	}

	public static boolean validEquation(double a, double delta){
		return a != 0 && delta >= 0;
	}

	public static void solve(double a, double b, double c){
		double delta = delta(a, b, c);
		if (validEquation(a, delta)){
			if (delta > 0){
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			} else if (delta == 0){
				System.out.println(-b / 2 * a);
			}
		}else{
			System.out.println("NaN");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		solve(a,b,c);
		input.close();
	}
}
